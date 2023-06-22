/* Aufgabe 0
 * Interface "Feuerlöschend" mit der Methode "löscheFeuer()"
 * Klasse "Person"
 * - mit einer Liste vom Typ Feuerlöschend
 * - einer void Methode "rufeFeuer()", welche "Feuer!" auf der Konsole ausgibt, und für alle Feuerlöscher die Methode löscheFeuer() aufruft.
 * - einer weiteren Methode zum Hinzufügen neuer Objekte vom Typ Feuerlöschend .
 * Klasse "Feuerbekaempfer", implementiert das Interface.
 * - mit einer void Methode "löscheFeuer()" ohne Parameter, welche auf der Konsole "Feuer löschen!" ausgibt.
 */


public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();

        Feuerbekaempfer feuerbekaempfer1 = new Feuerbekaempfer();

        p1.addFeuerloeschend(feuerbekaempfer1);

        p1.rufeFeuer();

    }
}
