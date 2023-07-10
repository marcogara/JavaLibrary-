package com.BmiCalculator.model;

public class BodyMassCalculator {
    private double groesse;
    private double gewicht;
    private double bmi;

    public BodyMassCalculator(double size, double weight) {
        groesse = size;
        gewicht = weight;
        setBmi();
    }

    public void setBmi() {
        bmi = gewicht / (groesse * groesse);
    }

    public double getBmi() {
        return bmi;
    }
}