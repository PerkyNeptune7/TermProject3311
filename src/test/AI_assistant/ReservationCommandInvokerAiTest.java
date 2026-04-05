package test.AI_assistant;

import static org.junit.jupiter.api.Assertions.*;

import app.Command;
import app.ReservationCommandInvoker;
import org.junit.jupiter.api.Test;

public class ReservationCommandInvokerAiTest {

    private static class SuccessfulCommand implements Command {
        @Override
        public boolean execute() {
            return true;
        }
    }

    private static class FailingCommand implements Command {
        @Override
        public boolean execute() {
            return false;
        }
    }

    private static class CountingTrueCommand implements Command {
        private int count = 0;

        @Override
        public boolean execute() {
            count++;
            return true;
        }

        public int getCount() {
            return count;
        }
    }

    private static class CountingFalseCommand implements Command {
        private int count = 0;

        @Override
        public boolean execute() {
            count++;
            return false;
        }

        public int getCount() {
            return count;
        }
    }

    @Test
    void submitCommandReturnsFalseWhenCommandIsNull() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();

        boolean result = invoker.submitCommand(null);

        assertFalse(result);
    }

    @Test
    void submitCommandReturnsTrueWhenCommandExecutesSuccessfully() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        Command command = new test.AI_assistant.ReservationCommandInvokerAiTest.SuccessfulCommand();

        boolean result = invoker.submitCommand(command);

        assertTrue(result);
    }

    @Test
    void submitCommandReturnsFalseWhenCommandExecutionFails() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        Command command = new test.AI_assistant.ReservationCommandInvokerAiTest.FailingCommand();

        boolean result = invoker.submitCommand(command);

        assertFalse(result);
    }

    @Test
    void submitCommandCallsExecuteExactlyOnceForSuccessfulCommand() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        test.AI_assistant.ReservationCommandInvokerAiTest.CountingTrueCommand command = new test.AI_assistant.ReservationCommandInvokerAiTest.CountingTrueCommand();

        invoker.submitCommand(command);

        assertEquals(1, command.getCount());
    }

    @Test
    void submitCommandCallsExecuteExactlyOnceForFailingCommand() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        test.AI_assistant.ReservationCommandInvokerAiTest.CountingFalseCommand command = new test.AI_assistant.ReservationCommandInvokerAiTest.CountingFalseCommand();

        invoker.submitCommand(command);

        assertEquals(1, command.getCount());
    }

    @Test
    void submitCommandCalledTwiceExecutesCommandTwice() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        test.AI_assistant.ReservationCommandInvokerAiTest.CountingTrueCommand command = new test.AI_assistant.ReservationCommandInvokerAiTest.CountingTrueCommand();

        invoker.submitCommand(command);
        invoker.submitCommand(command);

        assertEquals(2, command.getCount());
    }

    @Test
    void submitCommandWithNullDoesNotAffectLaterValidCommand() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        test.AI_assistant.ReservationCommandInvokerAiTest.CountingTrueCommand command = new test.AI_assistant.ReservationCommandInvokerAiTest.CountingTrueCommand();

        boolean firstResult = invoker.submitCommand(null);
        boolean secondResult = invoker.submitCommand(command);

        assertFalse(firstResult);
        assertTrue(secondResult);
        assertEquals(1, command.getCount());
    }

    @Test
    void submitCommandPreservesReturnedTrueValueFromCommand() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        Command command = new test.AI_assistant.ReservationCommandInvokerAiTest.SuccessfulCommand();

        boolean result = invoker.submitCommand(command);

        assertEquals(true, result);
    }

    @Test
    void submitCommandPreservesReturnedFalseValueFromCommand() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        Command command = new test.AI_assistant.ReservationCommandInvokerAiTest.FailingCommand();

        boolean result = invoker.submitCommand(command);

        assertEquals(false, result);
    }

    @Test
    void submitCommandWithDifferentCommandsReturnsTheirOwnResults() {
        ReservationCommandInvoker invoker = new ReservationCommandInvoker();
        Command successfulCommand = new test.AI_assistant.ReservationCommandInvokerAiTest.SuccessfulCommand();
        Command failingCommand = new test.AI_assistant.ReservationCommandInvokerAiTest.FailingCommand();

        boolean firstResult = invoker.submitCommand(successfulCommand);
        boolean secondResult = invoker.submitCommand(failingCommand);

        assertTrue(firstResult);
        assertFalse(secondResult);
    }
}
