// Jede Reise hat einen Grundpreis und einen Reisebeginn.
//  * Es können für alle Reise-Arten die Anzahl der Tage bis zur Abreise bestimmt werden.


import java.time.LocalDateTime;

abstract class Reisen {

    private final int grundpreis;

    public int getGrundpreis() {
        return grundpreis;
    }



    private final LocalDateTime beginn;

    // Reference to the current algorithm object.
    protected StornoAlgorithmus algorithm;

    public LocalDateTime getBeginn() {
        return beginn;
    }

    public Reisen(int grundpreis, LocalDateTime beginn) {
        this.grundpreis = grundpreis;
        this.beginn = beginn;
    }

    // Method to be implemented by concrete subclasses.
    public abstract double berechnenPreis();

    // Method that delegates the calculation of the storno fee to the current algorithm object.
    public double berechneStornierung(LocalDateTime stornierungsDatum) {
        return algorithm.berechneStornierung(this, stornierungsDatum);
    }

    public StornoAlgorithmus getStornoAlgorithmus() {
        return algorithm;
    }

    // Getter and setter methods for the StornoAlgorithmus reference
    public void setStornoAlgorithmus(StornoAlgorithmus algorithm) {
        this.algorithm = algorithm;
    }

}



