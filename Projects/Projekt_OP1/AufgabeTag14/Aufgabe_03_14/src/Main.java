import java.util.ArrayList;
import java.util.Arrays;

/* Sie betreiben einen Imbiss und möchten eine Verwaltungssoftware für die verkauften Waren erstellen.
 * Die Verkaufsware unterteilt sich in Essen und Getränke. Alle Waren werden in der Basisklasse, von der kein Objekt erstellt werden darf, in einer Liste gespeichert.
 * Für alle Waren erfassen Sie die Bezeichnung und den Preis. Essen besteht zudem aus einer Auflistung der Zutaten, zu Getränken speichern Sie die Füllmenge in Milliliter.
 * Alle benötigten Daten werden über Konstruktoren erfasst.
 * Um alle Waren bequem ausgeben zu können, überschreiben Sie die toString-Methode der Klassen. Dabei vermeiden Sie doppelten Code und beachten die Abkapselung und Trennung von Darstellung und Programmlogik.
 * Zum Testen erstellen Sie ein Getränk, ein Essen und geben alle Informationen auf dem Bildschirm aus.
 *
 * Erstellen Sie dazu ein UML Klassendiagramm.
 */
public class Main {
    public static void main(String[] args) {

        new Essen("Burger", 4.99, new ArrayList<String>(Arrays.asList("Brötchen", "Rindfleisch-Patties", "Gurken", "Ketchup")));
        new Essen("Pizza Groß", 5.99, new ArrayList<String>(Arrays.asList("Pizzateig", "Tomatensoße", "Käse", "Salami" )));


        new Getraenk("Cola", 1.49, 500);

        for (   Waren ware  : Waren.warenlist   ) {

            System.out.println(ware);              // Die toString()-Methode wird automatisch von print und println aufgerufen!




        }

        }
    }
