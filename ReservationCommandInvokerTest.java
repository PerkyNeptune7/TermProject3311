import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReservationCommandInvokerTest {

    private static class TrueCommand implements Command {
        @Override
        public boolean execute() {
            return true;
        }
    }

    private static class FalseCommand implements Command {
        @Override
        public boolean execute() {
            return false;
        }
    }

    @Test
    public void testCommandIsNull() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();

        boolean result = invoker.submitCommand(null);

        assertFalse(result);
    }

    @Test
    public void testCommandExecutesTrue() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        Command command = new TrueCommand();

        boolean result = invoker.submitCommand(command);

        assertTrue(result);
    }

    @Test
    public void testCommandExecutesFalse() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        Command command = new FalseCommand();

        boolean result = invoker.submitCommand(command);

        assertFalse(result);
    }
}