import java.util.ArrayList;
import java.util.List;

public class Person {

    /*
     * Klasse "Person"
     * - mit einer Liste vom Typ Feuerlöschend
     * - einer void Methode "rufeFeuer()", welche "Feuer!" auf der Konsole ausgibt, und für alle Feuerlöscher die Methode löscheFeuer() aufruft.
     * - einer weiteren Methode zum Hinzufügen neuer Objekte vom Typ Feuerlöschend.

     */

    private final List<Feuerloeschend> feuerloeschendList = new ArrayList<>();

    public void addFeuerloeschend(Feuerloeschend feuerloeschend) {
        this.feuerloeschendList.add(feuerloeschend);
    }

    public void rufeFeuer() {

        System.out.println("Feuer!");

        for (Feuerloeschend b : feuerloeschendList) {
            b.loescheFeuer();
        }
    }

}
