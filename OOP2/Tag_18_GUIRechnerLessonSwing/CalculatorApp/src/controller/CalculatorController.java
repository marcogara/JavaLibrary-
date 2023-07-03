package controller;

import model.Calculator;
import view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    CalculatorView calculatorView;
    Calculator calculator;

    public CalculatorController(CalculatorView calculatorView, Calculator calculator) {
        this.calculatorView = calculatorView;
        this.calculator = calculator;

        this.calculatorView.setButtonClickListener(new ButtonClickListener());
    }

    class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand() == "Clr") {
                calculatorView.clearDisplay();
                return;
            }

            calculatorView.writeToDisplay("Hallo Welt");

        }
    }
}
