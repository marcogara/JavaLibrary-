package controller;

import model.*;
import view.CalculatorView;

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
                calculator.setArithmeticStrategy(new Moltiplication());
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
                    calculatorView.clearDisplay();

                } catch (Exception ex) {
                    // TODO : Fehler Meldung generieren und zeigen id der View
                    ex.toString();
                }

                double result = calculator.calculate(calculatorView.getFirstNumber(), secondNumber);
                calculatorView.writeResultToDisplay(String.valueOf(result));

            }

        }
    }
}
