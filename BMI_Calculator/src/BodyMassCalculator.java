public class BodyMassCalculator {
    private double groesse ;
    private double gewicht ;
    private double bmi;


    public BodyMassCalculator(double size, double weight) {

        this.groesse = size;
        this.gewicht = weight;
    }

    public double getBmi ()
    {

        this.bmi=this.gewicht / (this.groesse*this.groesse);

        return this.bmi;
    }


}