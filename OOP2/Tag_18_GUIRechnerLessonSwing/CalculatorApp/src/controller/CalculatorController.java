package controller;

import model.*;
import view.CalculatorView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    CalculatorView calculatorView;
    Calculator calculator;

    public CalculatorController(CalculatorView calculatorView, Calculator calculator) {
        this.calculatorView = calculatorView;
        this.calculator = calculator;

        this.calculatorView.setArithmethicButtonClickListener(new ArithmethicButtonClickListener());
    }

    public void setFirstNumber() {
        String inputBuffer = calculatorView.getInputFromDisplay();

        try {
            calculatorView.setFirstNumber(Double.parseDouble(inputBuffer));
            calculatorView.clearDisplay();

        } catch (Exception ex) {
            // TODO : Fehler Meldung generieren und zeigen id der View
            ex.toString();
        }
    }

    class ArithmethicButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            if (e.getActionCommand().equals("/")) {
                calculator.setArithmeticStrategy(new Division());
                setFirstNumber();

            }
            if (e.getActionCommand().equals("*")) {
                calculator.setArithmeticStrategy(new Multiplication());
                setFirstNumber();
            }
            if (e.getActionCommand().equals("-")) {
                calculator.setArithmeticStrategy(new Subtraction());
                setFirstNumber();
            }
            if (e.getActionCommand().equals("+")) {
                calculator.setArithmeticStrategy(new Addition());
                setFirstNumber();
            }
            if (e.getActionCommand().equals("=")) {

                String inputBuffer2 = calculatorView.getInputFromDisplay();
                double secondNumber = 0.0D;


                try {
                    secondNumber = Double.parseDouble(inputBuffer2);
                    if (calculator.getArithmeticStrategy() instanceof Division && secondNumber == 0) {
                        throw new ArithmeticException("Division by zero is not defined!");
                    }

                } catch (NumberFormatException ex) {

                    // TODO : Fehler Meldung generieren und zeigen id der View
                    // Handle NumberFormatException here
                    ex.toString();

                } catch (ArithmeticException ex) {
                    // Handle ArithmeticException here
                    JOptionPane.showMessageDialog(null, "Division by zero is not defined!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                calculatorView.clearDisplay();


                double result = calculator.calculate(calculatorView.getFirstNumber(), secondNumber);
                // result = Math.round(result);
                calculatorView.writeResultToDisplay(String.valueOf(result));

            }

        }
    }
}



/*
                try {
                    secondNumber = Double.parseDouble(inputBuffer2);
                    if (secondNumber != 0) {

                        calculatorView.clearDisplay();

                    }


                } catch (Exception ex) {

                    ex.toString();
                    // TODO: das muss aus der Model raus
                    JOptionPane.showMessageDialog(null, "Teilen durch 0 ist nicht definiert!", "FEHLER", JOptionPane.ERROR_MESSAGE);

                }

 */
