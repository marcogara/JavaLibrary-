package com.BmiCalculator.controller;

import com.BmiCalculator.model.BodyMassCalculator;
import com.BmiCalculator.view.BodyMassGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class BodyMassController {
    private BodyMassGUI view;
    private BodyMassCalculator model;

    public BodyMassController(BodyMassGUI view, BodyMassCalculator model) {
        this.view = view;
        this.model = model;

        view.setButtonClickListener(new ButtonClickListener());

        // Add key listener to the button
        view.getButton().addKeyListener(new EnterKeyListener());

        view.getTextField2().addKeyListener(new EnterKeyListener());
    }

    class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calculateBMI();
        }
    }

    class EnterKeyListener extends java.awt.event.KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                calculateBMI();
            }
        }
    }

    private void calculateBMI() {
        double num1 = Double.parseDouble(view.getTextField1().getText());
        double num2 = Double.parseDouble(view.getTextField2().getText());

        model.setBmi(num1, num2);
        view.setOutputField(String.valueOf(model.getBmi()));
    }
}





