import controller.CalculatorController;
import model.Calculator;
import view.CalculatorView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // not best practice:
        // new CalculatorView();

        // Functional Interfac runnable hat nur eine abstrakte Methode.
        // Fügt unsere Anwendung dem UI Thread hinzu. Die Anwendung wird aufgerufen, sobald alle Eventes der Event queue
        // abgearbeitet wurden.
        /*
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorView();
            }
        });

         */

        // Alternative: wir implementieren runnable als Lambdaausdruck:
        SwingUtilities.invokeLater(() -> new CalculatorController(new CalculatorView(), new Calculator()));


    }
}