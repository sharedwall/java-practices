package sprint3.exercise2;

import java.io.IOException;
import java.util.logging.*;

public class TestFormatterLogger {
    private static final Logger LOGGER = Logger.getLogger(TestFormatterLogger.class.getName());
    public static void main(String[] args) {

        Handler fileHandler;
        Formatter simpleFormatter;
        try {
            fileHandler = new FileHandler("./javacodegeeks.formatter.log");
            simpleFormatter = new SimpleFormatter();

            LOGGER.addHandler(fileHandler);
            LOGGER.info("Finest message: Logger with DEFAULT FORMATTER");

            fileHandler.setFormatter(simpleFormatter);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.finest("Finest message: Logger with SIMPLE FORMATTER");
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
    }
}
