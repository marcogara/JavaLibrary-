package model;

// Model: entählt die Daten, Geschäftsobjekt und geschäftlogik
public class RechnerModel {
    private int berechnungsErgebnise;

    public void addiereZweiZahlen(int zahl1, int zahl2) {
        this.berechnungsErgebnise = zahl1 + zahl2;
    }

    public int getBerechnungsErgebnise() {
        return this.berechnungsErgebnise;
    }
}
