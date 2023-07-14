import com.BmiCalculator.controller.BodyMassController;
import com.BmiCalculator.model.BodyMassCalculator;
import com.BmiCalculator.view.BodyMassGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BodyMassGUI view = new BodyMassGUI();
                BodyMassCalculator model = new BodyMassCalculator();
                new BodyMassController(view, model);
                view.setVisible(true);
            }
        });
    }
}








