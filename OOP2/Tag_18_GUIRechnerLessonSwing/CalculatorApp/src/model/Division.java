package model;

import javax.swing.*;

public class Division implements ArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            // TODO: das muss aus der Model raus
            JOptionPane.showMessageDialog(null, "Teilen durch 0 ist nicht definiert!", "FEHLER", JOptionPane.ERROR_MESSAGE);

        }

        return firstNumber / secondNumber;
    }
}
