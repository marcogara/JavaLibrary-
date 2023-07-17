package model;

public class BodyMassCalculator {
    private double groesse;
    private double gewicht;
    private double bmi;

    public void setBmi(double groesse, double gewicht) {
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.bmi = Math.round((this.gewicht / (this.groesse * this.groesse)) * 100.0) /100.0 ;
    }

    public double getBmi() {
        return this.bmi;
    }
}