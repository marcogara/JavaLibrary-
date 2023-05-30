/* Erstellen Sie die abstrakte Klasse "Kreatur" mit einem privaten Attribut "name", einer abstrakten Methode "angreifen" und einem Konstruktor, der name initialisiert.
 * Erstellen Sie zwei weitere Klassen "Ritter" und "Drache", die beide von "Kreatur" erben.
 * Die beiden Subklassen implementieren die Methode der Basisklasse.
 * Der Ritter nutzt sein Schwert, der Drache spuckt Feuer.
 * In main() erzeugen Sie je ein Objekt von Ritter und Drache.
 * Rufen Sie in der main-Methode() für beide Objekte die überschriebene angreifen()-Methode auf.
 */

public class Main {
    public static void main(String[] args) {

        Ritter ritter = new Ritter("aldi");
        Drache drache = new Drache("lidl");

        ritter.angreifen();
        drache.angreifen();

        }
    }
