import controller.BodyMassController;
import model.BodyMassCalculator;
import view.BodyMassGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BodyMassGUI view = new BodyMassGUI();
            BodyMassCalculator model = new BodyMassCalculator();
            new BodyMassController(view, model);
            view.setVisible(true);
        });
    }
}