import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Aufgabe 5
 * Schreiben Sie eine Funktion, die die Stromkosten im Jahr für einen Computer berechnet.
 * Es soll der Verbrauch des Computers (in Watt),
 * die durchschnittliche Zeit, die der Computer am Tag läuft in Stunden
 * und die Stromkosten pro kWh als Argumente an die Funktion übergeben werden.
 * Wer die Werte seines Computers, oder die Stromkosten pro kWh seines Anbieters nicht kennt,
 * sollte mit folgenden Werten arbeiten:
 * Verbrauch eines Laptops: 70
 * Stromkosten kWh: 25 Cent
 * Erstellen Sie einen PAP, ein Struktogramm, oder Pseudocode und anschließend ein Java-Programm.
 */

public class StromRechner {

    public static void main (String[] args)
    {
        double dVerbrauchWatt = 70;
        double dStundeTag = 5;
        double dStromKostenKWhEuro =  0.25 ;

        stromRechnenTag(dVerbrauchWatt,dStundeTag,dStromKostenKWhEuro);

    }

    private static void stromRechnenTag(double verbrauch, double stundeTag, double stromKosten) {

        DecimalFormat f = new DecimalFormat("#0.00");
        double preisTag = (verbrauch / 1000)* stundeTag  * stromKosten;
        System.out.println(" Das kost am Tag liegt bei  \u20ac " + f.format(preisTag) + " an!");

    }
}
