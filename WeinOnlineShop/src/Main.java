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

        // Test functionality to create Artikel and give it name and price
        Artikel art1 = new Artikel("Brunello ", 14.30);
        Artikel art2 = new Artikel("Amarone ", 32.30);

        // Test functionality to get Name and Price
        System.out.println("Der Artikelname von art1 ist:  " + art1.getArtikelName() + " und kostet " + art1.getArtikelPreis());
        System.out.println(" Falls gibt eine preis veränderung von art1 von : " + art1.getArtikelPreis() + " zu 16.80 €  dann ...");

        // Test functionality to set a different price
        art1.setArtikelPreis(16.80);

        System.out.println("Der Artikelname von art1 ist:  " + art1.getArtikelName() + " und kostet " + art1.getArtikelPreis());

        Warenkorb warenkorb1 = new Warenkorb(100);

        warenkorb1.addItem(art1, 30);
        warenkorb1.addItem(art2, 8);

        warenkorb1.getArtikelList();

        System.out.println(warenkorb1.getBestellwert());

        // test design strategy Versandkosten algorithms , the idea is that a customer could choose from a GUI
        // the type of shipment so accordingly here we instantiate an Obj
        Versand st = new StandardLieferungen();
        // we set the type of shipment passing the Obj instantiate with StandardLieferungen class
        warenkorb1.setVersand(st);


        // Test if the calculation of the shipment cost take place
        System.out.println(" Cost before Shipping : " + warenkorb1.getBestellwert());
        // Adding the cost of goods to cost of shipment
        System.out.println(" Cost after Shipping : " + (warenkorb1.getBestellwert() + warenkorb1.getVersandKosten()));


    }
}
