import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.Timer;

public class LabDatabase {
    private static final int BOOKED_SESSION_SECONDS = 60 * 60;

    private List<UserAccounts> users;
    private List<EquipmentForStatePattern> equipmentList;
    private List<PendingBooking> bookings;
    private Map<String, Sensor> equipmentSensors;
    private Map<String, Timer> bookingTimers;
    private UserFactory userFactory;
    private List<Runnable> pendingUsersListeners;
    private List<Runnable> equipmentListeners;
    private List<Runnable> bookingListeners;

    public LabDatabase() {
        users = new ArrayList<>();
        equipmentList = new ArrayList<>();
        bookings = new ArrayList<>();
        equipmentSensors = new HashMap<>();
        bookingTimers = new HashMap<>();
        userFactory = new UserFactory();
        pendingUsersListeners = new ArrayList<>();
        equipmentListeners = new ArrayList<>();
        bookingListeners = new ArrayList<>();

        // --- FIX: Manually approve the hardcoded test accounts ---
        UserAccounts dummyStudent = userFactory.createUser("Student", "student1@yorku.ca", "pass123", "STU-1001");
        dummyStudent.isapproved = true;     // Bypass the queue
        dummyStudent.needsapproval = false;
        users.add(dummyStudent);

        UserAccounts dummyFaculty = userFactory.createUser("Faculty", "prof@yorku.ca", "secure456", "FAC-1001");
        dummyFaculty.isapproved = true;     // Bypass the queue
        dummyFaculty.needsapproval = false;
        users.add(dummyFaculty);
        // ---------------------------------------------------------

        // 1. Add the Head Lab Coordinator to the system (Already approved by default)
        HeadLabCoordinator boss = HeadLabCoordinator.getInstance();
        users.add(boss);

        // 2. Have the Coordinator auto-generate a Lab Manager for testing
        LabManager manager1 = boss.autoGenerateLabManager("manager1@yorku.ca", "managepass");
        users.add(manager1);

        // Dummy Equipment
        addEquipmentInternal(new EquipmentForStatePattern("EQ-001", "Electron Microscope", "Room 101"));
        addEquipmentInternal(new EquipmentForStatePattern("EQ-002", "3D Printer", "Room 102"));
        addEquipmentInternal(new EquipmentForStatePattern("EQ-003", "Spectrometer", "Room 103"));
    }

    public UserAccounts authenticate(String username, String password) {
        for (UserAccounts user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    public List<EquipmentForStatePattern> getAvailableEquipment() {
        return equipmentList;
    }

    public void registerNewUser(String role, String username, String password, String registrationId) {
        UserAccounts newUser = userFactory.createUser(role, username, password, registrationId);
        users.add(newUser);
        notifyPendingUsersChanged();
    }
    public void addUser(UserAccounts user) {
        this.users.add(user);
        notifyPendingUsersChanged();
    }

    public void addEquipment(EquipmentForStatePattern eq) {
        addEquipmentInternal(eq);
        notifyEquipmentChanged();
    }

    public java.util.List<UserAccounts> getPendingUsers() {
        java.util.List<UserAccounts> pending = new java.util.ArrayList<>();
        for (UserAccounts u : users) {
            if (u.needsapproval && !u.isapproved) {
                pending.add(u);
            }
        }
        return pending;
    }

    public void removeUser(UserAccounts user) {
        users.remove(user);
        notifyPendingUsersChanged();
    }

    public void notifyPendingUsersChanged() {
        for (Runnable listener : new ArrayList<>(pendingUsersListeners)) {
            listener.run();
        }
    }

    public void notifyEquipmentChanged() {
        for (Runnable listener : new ArrayList<>(equipmentListeners)) {
            listener.run();
        }
    }

    public void notifyBookingsChanged() {
        for (Runnable listener : new ArrayList<>(bookingListeners)) {
            listener.run();
        }
    }

    public void addPendingUsersListener(Runnable listener) {
        pendingUsersListeners.add(listener);
    }

    public void removePendingUsersListener(Runnable listener) {
        pendingUsersListeners.remove(listener);
    }

    public void addEquipmentListener(Runnable listener) {
        equipmentListeners.add(listener);
    }

    public void removeEquipmentListener(Runnable listener) {
        equipmentListeners.remove(listener);
    }

    public void addBookingListener(Runnable listener) {
        bookingListeners.add(listener);
    }

    public void removeBookingListener(Runnable listener) {
        bookingListeners.remove(listener);
    }

    public PendingBooking createPendingBooking(String bookingId, EquipmentForStatePattern equipment, UserAccounts user, int secondsRemaining) {
        PendingBooking existingBooking = getBookingById(bookingId);
        if (existingBooking != null) {
            return existingBooking;
        }
        if (hasOpenBookingForEquipment(equipment.getId())) {
            return null;
        }

        PendingBooking booking = new PendingBooking(
                bookingId,
                equipment.getId(),
                equipment.getDescription(),
                user.username,
                user.getRegistrationId(),
                user.getHourlyRate(),
                BookingStatus.PENDING_PICKUP,
                secondsRemaining
        );
        bookings.add(booking);
        equipment.markPendingPickup();
        notifyBookingsChanged();
        notifyEquipmentChanged();
        return booking;
    }

    public void updatePendingBookingCountdown(String bookingId, int secondsRemaining) {
        PendingBooking booking = getBookingById(bookingId);
        if (booking == null || booking.getStatus() != BookingStatus.PENDING_PICKUP) {
            return;
        }

        booking.setSecondsRemaining(secondsRemaining);
        if (secondsRemaining <= 0) {
            booking.setLateArrival(true);
        }
        notifyBookingsChanged();
    }

    public void markPendingBookingLate(String bookingId) {
        PendingBooking booking = getBookingById(bookingId);
        if (booking == null || booking.getStatus() != BookingStatus.PENDING_PICKUP) {
            return;
        }

        booking.setLateArrival(true);
        booking.setSecondsRemaining(0);
        notifyBookingsChanged();
    }

    public void cancelBooking(String bookingId) {
        PendingBooking booking = getBookingById(bookingId);
        if (booking == null) {
            return;
        }
        if (booking.getStatus() == BookingStatus.RESERVED) {
            notifyBookingsChanged();
            return;
        }

        booking.setStatus(BookingStatus.CANCELLED);
        booking.setSecondsRemaining(0);
        stopBookingTimer(bookingId);
        EquipmentForStatePattern equipment = getEquipmentById(booking.getEquipmentId());
        if (equipment != null) {
            equipment.release();
        }
        notifyBookingsChanged();
        notifyEquipmentChanged();
    }

    public List<PendingBooking> getPendingBookingsForUser(String username) {
        List<PendingBooking> results = new ArrayList<>();
        for (PendingBooking booking : bookings) {
            if (username.equals(booking.getBookedByUserId()) && booking.getStatus() == BookingStatus.PENDING_PICKUP) {
                results.add(booking);
            }
        }
        return results;
    }

    public List<PendingBooking> getReservedBookingsForUser(String username) {
        List<PendingBooking> results = new ArrayList<>();
        for (PendingBooking booking : bookings) {
            if (username.equals(booking.getBookedByUserId()) && booking.getStatus() == BookingStatus.RESERVED) {
                results.add(booking);
            }
        }
        return results;
    }

    public List<PendingBooking> getAllPendingBookings() {
        List<PendingBooking> results = new ArrayList<>();
        for (PendingBooking booking : bookings) {
            if (booking.getStatus() == BookingStatus.PENDING_PICKUP) {
                results.add(booking);
            }
        }
        return results;
    }

    public List<PendingBooking> getAllReservedBookings() {
        List<PendingBooking> results = new ArrayList<>();
        for (PendingBooking booking : bookings) {
            if (booking.getStatus() == BookingStatus.RESERVED) {
                results.add(booking);
            }
        }
        return results;
    }

    public int extendReservedBooking(String bookingId, int extensionSeconds) {
        PendingBooking booking = getBookingById(bookingId);
        if (booking == null || booking.getStatus() != BookingStatus.RESERVED) {
            return 0;
        }

        int currentSeconds = booking.getSecondsRemaining();
        int updatedSeconds = Math.min(BOOKED_SESSION_SECONDS, currentSeconds + extensionSeconds);
        int addedSeconds = updatedSeconds - currentSeconds;
        if (addedSeconds <= 0) {
            return 0;
        }

        booking.setSecondsRemaining(updatedSeconds);
        notifyBookingsChanged();
        return addedSeconds;
    }

    public double getPaymentDueForBooking(String bookingId) {
        PendingBooking booking = getBookingById(bookingId);
        if (booking == null) {
            return 0.0;
        }
        return booking.getPaymentDue();
    }

    public boolean markBookingPaid(String bookingId) {
        PendingBooking booking = getBookingById(bookingId);
        if (booking == null || booking.getPaymentDue() <= 0) {
            return false;
        }

        booking.setPaymentCompleted(true);
        notifyBookingsChanged();
        return true;
    }

    public PendingBooking getBookingById(String bookingId) {
        for (PendingBooking booking : bookings) {
            if (booking.getBookingId().equals(bookingId)) {
                return booking;
            }
        }
        return null;
    }

    public void triggerSensorStart(String equipmentId) {
        Sensor sensor = equipmentSensors.get(equipmentId);
        if (sensor != null) {
            sensor.startEquipment();
        }
    }

    public void triggerSensorStop(String equipmentId) {
        Sensor sensor = equipmentSensors.get(equipmentId);
        if (sensor != null) {
            sensor.stopEquipment();
        }
    }

    private void addEquipmentInternal(EquipmentForStatePattern eq) {
        equipmentList.add(eq);
        Sensor sensor = new Sensor(eq.getId());
        sensor.attach(new Observer() {
            @Override
            public void update(Sensor sensor) {
                handleSensorUpdate(sensor);
            }
        });
        equipmentSensors.put(eq.getId(), sensor);
    }

    private void handleSensorUpdate(Sensor sensor) {
        PendingBooking matchingBooking = null;
        for (PendingBooking booking : bookings) {
            if (booking.getEquipmentId().equals(sensor.getSensorId())
                    && (booking.getStatus() == BookingStatus.PENDING_PICKUP || booking.getStatus() == BookingStatus.RESERVED)) {
                matchingBooking = booking;
                break;
            }
        }

        if (matchingBooking == null) {
            return;
        }

        EquipmentForStatePattern equipment = getEquipmentById(matchingBooking.getEquipmentId());
        if (sensor.isEquipmentActive()) {
            matchingBooking.setStatus(BookingStatus.RESERVED);
            matchingBooking.setSecondsRemaining(BOOKED_SESSION_SECONDS);
            startBookedCountdown(matchingBooking);
            if (equipment != null) {
                equipment.confirmReservation();
            }
        } else {
            matchingBooking.setStatus(BookingStatus.COMPLETED);
            matchingBooking.setSecondsRemaining(0);
            stopBookingTimer(matchingBooking.getBookingId());
            if (equipment != null) {
                equipment.release();
            }
        }

        notifyBookingsChanged();
        notifyEquipmentChanged();
    }

    private EquipmentForStatePattern getEquipmentById(String equipmentId) {
        for (EquipmentForStatePattern equipment : equipmentList) {
            if (equipment.getId().equals(equipmentId)) {
                return equipment;
            }
        }
        return null;
    }

    private boolean hasOpenBookingForEquipment(String equipmentId) {
        for (PendingBooking booking : bookings) {
            if (booking.getEquipmentId().equals(equipmentId)
                    && (booking.getStatus() == BookingStatus.PENDING_PICKUP || booking.getStatus() == BookingStatus.RESERVED)) {
                return true;
            }
        }
        return false;
    }

    private void startBookedCountdown(PendingBooking booking) {
        stopBookingTimer(booking.getBookingId());

        Timer timer = new Timer(1000, e -> {
            if (booking.getStatus() != BookingStatus.RESERVED) {
                stopBookingTimer(booking.getBookingId());
                return;
            }

            booking.setSecondsRemaining(booking.getSecondsRemaining() - 1);
            notifyBookingsChanged();

            if (booking.getSecondsRemaining() <= 0) {
                booking.setStatus(BookingStatus.COMPLETED);
                stopBookingTimer(booking.getBookingId());
                EquipmentForStatePattern equipment = getEquipmentById(booking.getEquipmentId());
                if (equipment != null) {
                    equipment.release();
                }
                notifyBookingsChanged();
                notifyEquipmentChanged();
            }
        });

        timer.start();
        bookingTimers.put(booking.getBookingId(), timer);
    }

    private void stopBookingTimer(String bookingId) {
        Timer timer = bookingTimers.remove(bookingId);
        if (timer != null) {
            timer.stop();
        }
    }
}
