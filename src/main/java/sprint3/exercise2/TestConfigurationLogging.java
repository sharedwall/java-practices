package sprint3.exercise2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestConfigurationLogging {
    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger("confLogger");

    public static void main(String[] args) {
        try {
            logManager.readConfiguration(new FileInputStream("./javacodegeeks.properties.log"));
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Error in loading configuration", exception);
        }
        LOGGER.fine("Fine message logged");
    }
}
