import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;


public class ReservationCommandUI extends JFrame {

    public ReservationCommandUI() {
        setTitle("Reservation Command UI");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);

        mainPanel.add(new JLabel("Reservation Command Actions"));

        mainPanel.add(new JLabel("Reservation ID:"));
        JTextField reservationIdField = new JTextField(15);
        reservationIdField.setMaximumSize(new Dimension(200, 30));
        reservationIdField.setPreferredSize(new Dimension(200, 30));
        mainPanel.add(reservationIdField);

        mainPanel.add(new JLabel("New Start Time:"));
        JTextField newStartTimeField = new JTextField(15);
        newStartTimeField.setMaximumSize(new Dimension(200, 30));
        newStartTimeField.setPreferredSize(new Dimension(200, 30));
        mainPanel.add(newStartTimeField);

        mainPanel.add(new JLabel("New End Time:"));
        JTextField newEndTimeField = new JTextField(15);
        newEndTimeField.setMaximumSize(new Dimension(200, 30));
        newEndTimeField.setPreferredSize(new Dimension(200, 30));
        mainPanel.add(newEndTimeField);

        JButton extendButton = new JButton("Extend Reservation");
        mainPanel.add(extendButton);

        JButton cancelButton = new JButton("Cancel Reservation");
        mainPanel.add(cancelButton);

        JButton modifyButton = new JButton("Modify Reservation");
        mainPanel.add(modifyButton);

        JLabel statusLabel = new JLabel("Status: Waiting for action");
        mainPanel.add(statusLabel);

       extendButton.addActionListener(e -> {
    String reservationId = reservationIdField.getText().trim();
    String newEndTimeText = newEndTimeField.getText().trim();

    if (reservationId.isEmpty() || newEndTimeText.isEmpty()) {
        statusLabel.setText("Status: Please enter Reservation ID and New End Time");
        return;
    }

    try {
        LocalDateTime newEndTime = LocalDateTime.parse(newEndTimeText);

        Equipment equipment = new Equipment("Microscope", "Lab microscope", "Room A");

        Reservation reservation = new Reservation(
                reservationId,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                ReservationStatus.ACTIVE
        );

        ExtendReservationCommand command =
                new ExtendReservationCommand(equipment, reservation, newEndTime);

        boolean result = command.execute();

        if (result) {
            statusLabel.setText("Status: Reservation extended successfully");
        } else {
            statusLabel.setText("Status: Failed to extend reservation");
        }

    } catch (DateTimeParseException ex) {
        statusLabel.setText("Status: Use format yyyy-MM-ddTHH:mm");
    }
});

cancelButton.addActionListener(e -> {
    String reservationId = reservationIdField.getText().trim();

    if (reservationId.isEmpty()) {
        statusLabel.setText("Status: Please enter Reservation ID");
        return;
    }

    Reservation reservation = new Reservation(
            reservationId,
            LocalDateTime.now(),
            LocalDateTime.now().plusHours(1),
            ReservationStatus.ACTIVE
    );

    CancelReservationCommand command = new CancelReservationCommand(reservation);

    boolean result = command.execute();

    if (result) {
        statusLabel.setText("Status: Reservation cancelled successfully");
    } else {
        statusLabel.setText("Status: Failed to cancel reservation");
    }
});


modifyButton.addActionListener(e -> {
    String reservationId = reservationIdField.getText().trim();
    String newStartTimeText = newStartTimeField.getText().trim();
    String newEndTimeText = newEndTimeField.getText().trim();

    if (reservationId.isEmpty() || newStartTimeText.isEmpty() || newEndTimeText.isEmpty()) {
        statusLabel.setText("Status: Please enter Reservation ID, New Start Time, and New End Time");
        return;
    }

    try {
        LocalDateTime newStartTime = LocalDateTime.parse(newStartTimeText);
        LocalDateTime newEndTime = LocalDateTime.parse(newEndTimeText);

        Equipment equipment = new Equipment("Microscope", "Lab microscope", "Room A");

        Reservation reservation = new Reservation(
                reservationId,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                ReservationStatus.ACTIVE
        );

        ModifyReservationCommand command =
                new ModifyReservationCommand(equipment, reservation, newStartTime, newEndTime);

        boolean result = command.execute();

        if (result) {
            statusLabel.setText("Status: Reservation modified successfully");
        } else {
            statusLabel.setText("Status: Failed to modify reservation");
        }

    } catch (DateTimeParseException ex) {
        statusLabel.setText("Status: Use format yyyy-MM-ddTHH:mm");
    }
});



    }

    public static void main(String[] args) {
        ReservationCommandUI ui = new ReservationCommandUI();
        ui.setVisible(true);
    }
}
