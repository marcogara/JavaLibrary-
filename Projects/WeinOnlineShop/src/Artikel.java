/*
    This is an open.source code meant for educational purposes only not intended
    for production use and may contain errors or bugs.
    Feel free to modify and use it for personal learning or teaching purposes.
    Not intended for distribution as a commercial product.
    Thanks.
*/

public class Artikel {

    private final String artikelName;
    private double artikelPreis;

    public Artikel(String artikelName, double artikelPreis) {
        this.artikelName = artikelName;
        this.artikelPreis = artikelPreis;
    }

    public String getArtikelName() {
        return artikelName;
    }

    public double getArtikelPreis() {
        return artikelPreis;
    }

    public void setArtikelPreis(double artikelPreis) {
        this.artikelPreis = artikelPreis;
    }
}
