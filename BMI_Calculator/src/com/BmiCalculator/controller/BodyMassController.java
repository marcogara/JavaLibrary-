package com.BmiCalculator.controller;

import com.BmiCalculator.model.BodyMassCalculator;
import com.BmiCalculator.view.BodyMassGUI;


public class BodyMassController {
        private BodyMassGUI view;
        private BodyMassCalculator model;

        public BodyMassController(BodyMassGUI view, BodyMassCalculator model) {
            this.view = view;
            this.model = model;

            // Add event listeners or bindings here
            // For example, you can add a listener to a button in your GUI to trigger BMI calculation and update the view.
            // You can also listen to other user input events and update the model or view accordingly.
        }

        // Add methods for handling user input events and updating the model/view as needed

    }

