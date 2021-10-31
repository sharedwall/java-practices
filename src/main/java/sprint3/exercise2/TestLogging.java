package sprint3.exercise2;

import java.io.IOException;
import java.util.logging.*;

public class TestLogging {
    private static final Logger LOGGER = Logger.getLogger(TestLogging.class.getName());

    public static void main(String[] args) {

        Handler consoleHandler;
        Handler fileHandler;
        try {
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler("./javacodegeeks.log");

            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.config("Configuration done.");
            LOGGER.removeHandler(consoleHandler);
            LOGGER.log(Level.FINE, "Finer logged");
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
        LOGGER.finer("Finest example on LOGGER handler completed.");
    }
}
