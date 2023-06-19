/*
    This is an open.source code meant for educational purposes only not intended
    for production use and may contain errors or bugs.
    Feel free to modify and use it for personal learning or teaching purposes.
    Not intended for distribution as a commercial product.
    Thanks.
*/


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome in Weinladen Online Shop!");

        Artikel art1 = new Artikel("Brunello ", 14.30);
        Artikel art2 = new Artikel("Amarone ", 32.30);


        System.out.println("Der Artikelname von art1 ist:  " + art1.getArtikelName() + " und kostet " + art1.getArtikelPreis());
        System.out.println(" Falls gibt eine preis veränderung von art1 von : " + art1.getArtikelPreis() + " zu 16.80 €  dann ...");

        art1.setArtikelPreis(16.80);

        System.out.println("Der Artikelname von art1 ist:  " + art1.getArtikelName() + " und kostet " + art1.getArtikelPreis());

        Warenkorb warenkorb1 = new Warenkorb(100);

        warenkorb1.addItem(art1, 30);
        warenkorb1.addItem(art2, 8);
        
        warenkorb1.getArtikelList();

        System.out.println(warenkorb1.berechnenTotal());

    }
}
