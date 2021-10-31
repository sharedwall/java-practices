package sprint3.exercise2;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class TestFilterLogging implements Filter {
    private static final Logger LOGGER = Logger.getLogger(TestFilterLogging.class.getName());

    public static void main(String[] args) {
        LOGGER.setFilter(new TestFilterLogging());
        LOGGER.severe("This is SEVERE message");
        LOGGER.warning("This is important warning message");
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        if (record == null)
            return false;

        String message = record.getMessage() == null ? "" : record.getMessage();
        return message.contains("important");
    }
}
