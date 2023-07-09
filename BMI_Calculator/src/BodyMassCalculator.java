public class BodyMassCalculator {
    private double groesse;
    private double gewicht;
    private double bmi;

    public BodyMassCalculator(double size, double weight) {
        groesse = size;
        gewicht = weight;
        setBmi();
    }

    private void setBmi() {
        bmi = gewicht / (groesse * groesse);
    }

    public double getBmi() {
        return bmi;
    }
}