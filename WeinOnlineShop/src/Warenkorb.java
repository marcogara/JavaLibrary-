/*
    This is an open.source code meant for educational purposes only not intended
    for production use and may contain errors or bugs.
    Feel free to modify and use it for personal learning or teaching purposes.
    Not intended for distribution as a commercial product.
    Thanks.
*/

public class Warenkorb {

    private final Artikel[] artikelListe;

    private final int[] artikelAnzahl;
    private final int itemCounter = 0;

    public Warenkorb(int maxItems) {
        artikelListe = new Artikel[maxItems];
        artikelAnzahl = new int[maxItems];
    }

    public void getArtikelList() {

        for (int i = 0; i < artikelListe.length; i++) {

            if (artikelAnzahl[i] != 0) {
                System.out.println("Artikel : " + artikelListe[i].getArtikelName() + " quantity: " + artikelAnzahl[i]);

            } else break;
        }
    }

    public void addItem(Artikel a, int anzahl) {
        for (int i = 0; i < artikelListe.length; i++) {
            if (artikelListe[i] == null) { // find first empty slot in the array
                artikelListe[i] = a;
                artikelAnzahl[i] = anzahl;
                break; // exit the loop once item is added
            }
        }
    }

    public double berechnenTotal() {

        double tot = 0;

        for (int i = 0; i < artikelListe.length; i++) {

            if (artikelAnzahl[i] != 0) {
                tot += artikelListe[i].getArtikelPreis() * artikelAnzahl[i];

            } else break;
        }
        return tot;
    }

}
