public class Getraenk extends Waren{

    private int fuelmenge;
    protected Getraenk(String bezeichung, double preis, int fuelmenge) {
        super(bezeichung, preis);
        this.fuelmenge = fuelmenge;

    }
    /**
     * @return Gibt einen String mit den Daten der Basisklasse plus zusätzlich der Füllmenge in Milliliter zurück.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\n" +
                "Füllmenge: " + this.fuelmenge + " ml\n";
    }

}
