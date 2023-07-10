import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* Sie betreiben einen Imbiss und möchten eine Verwaltungssoftware für die verkauften Waren erstellen.
 * Die Verkaufsware unterteilt sich in Essen und Getränke. Alle Waren werden in der Basisklasse, von der kein Objekt erstellt werden darf, in einer Liste gespeichert.
 * Für alle Waren erfassen Sie die Bezeichnung und den Preis. Essen besteht zudem aus einer Auflistung der Zutaten, zu Getränken speichern Sie die Füllmenge in Milliliter.
 * Alle benötigten Daten werden über Konstruktoren erfasst.
 * Um alle Waren bequem ausgeben zu können, überschreiben Sie die toString-Methode der Klassen. Dabei vermeiden Sie doppelten Code und beachten die Abkapselung und Trennung von Darstellung und Programmlogik.
 * Zum Testen erstellen Sie ein Getränk, ein Essen und geben alle Informationen auf dem Bildschirm aus.
 *
 * Erstellen Sie dazu ein UML Klassendiagramm.
 */
public abstract class Waren {

    private String bezeichung;
    private double preis;

    public static List<Waren> warenlist = new ArrayList<>();

    // konstruktor
    protected Waren(String bezeichung, double preis) {
        this.bezeichung = bezeichung;
        this.preis = preis;

        warenlist.add(this); // "this" zeigt auf das aktuelle Objekt, welches gerade durch den Konstruktor instanziiert wird.
        // heißt: In "this" steht die Speicheradresse des Objektes.
    }
    @Override
    public String toString()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String money = formatter.format(preis);
        return String.format("Bezeichnung: %s - Preis: %s", this.bezeichung, money);
    }





}
