package sprint3.exercise11;

import java.util.logging.Logger;

public class IvoryTower implements WizardTower {
    private static final Logger LOGGER = Logger.getLogger("confLogger");

    public void enter(Wizard wizard) {
        LOGGER.info(wizard.toString() + " enters the tower.");
    }

}
