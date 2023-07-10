/* Ihre GUI Anwendung aktualisiert regelmäßig die gemessenen SensorDaten. Wenn dies geschieht, sollen die Daten auch sofort in der Oberfläche angezeigt und in einer
 History-Protokoll-Datei gespeichert werden. Damit die einzelnen Komponenten des Programmes von der Aktualisierung der SensorDaten erfahren, möchten Sie das Observer-Muster verwenden.
 *
 * Klasse SensorDaten beinhaltet die aktuellen Messwerte des Sensors.
 * Interface IObserver mit der Methode update().
 * Klassen Dashboard und History implementieren das Interface (update).
 * In der Klasse SensorDaten können sich Observer in eine Observer-Liste eintragen und austragen (addObserver, removeObserver).
 * Dies geschieht immer im Konstruktor der Observer, denen ein Objekt der SensorDaten übergeben wird.
 * Werden die Messwerte des Sensors aktualisiert (setMesswerte), werden alle Observer darüber benachrichtigt (notifyObservers).
 * Die Observer können dann die Messwerte aus den SensorDaten abfragen (getMesswerte).
 * Das Dashboard gibt die Messwerte aus (display), die History speichert die Daten (save)(hier simuliert durch eine einfache Ausgabe,
 wenn Sie bereits mit dem Arbeiten mit Dateien vertraut sind, können Sie natürlich ein tatsächliches Speichern implementieren)
 */
public class Main {
    public static void main(String[] args) {

        SensorDaten sensorDaten = new SensorDaten();

        sensorDaten.setMessWert(3);

        DashBoard dashBoard = new DashBoard();

        History history = new History();

        sensorDaten.addObserver(dashBoard);
        sensorDaten.addObserver(history);

        sensorDaten.notifyObserver();

        dashBoard.display();

        history.save();

        sensorDaten.setMessWert(9);
        sensorDaten.notifyObserver();

        dashBoard.display();

        history.save();


    }
}
