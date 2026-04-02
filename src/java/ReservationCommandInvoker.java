public class ReservationCommandInvoker {
    public boolean submitCommand(Command command) {
        if (command == null) {
            return false;
        }

        return command.execute();
    }
}