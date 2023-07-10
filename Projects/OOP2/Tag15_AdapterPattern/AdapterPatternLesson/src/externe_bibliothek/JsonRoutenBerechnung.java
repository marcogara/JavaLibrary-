package externe_bibliothek;

// Diese beispielhafte externe Klassenbibliothek berechnet Fahrzeiten, Pausenzeiten, Lenkzeiten usw. und kann nur mit JSON Daten umgehen.
// Um die Bibliothek einzubinden, brauchen wir einen Adapter, der von XML zu JSON und zurück konvertieren kann.
public class JsonRoutenBerechnung
{
    public JsonDatei berechneFahrzeit(JsonDatei jsonDaten)
    {
        // Es fehlt natürlich der Algorithmus, um die Fahrzeit zu berechnen. Wir tun nur so als ob und geben einen String als Ergebnis zurück.
        System.out.println("Die Bibliothek hat folgende JSON Daten erhalten: " + jsonDaten.daten);

        JsonDatei ergebnisJson = new JsonDatei();
        ergebnisJson.daten = "Die Fahrzeit beträgt 12 Minuten und 37 Sekunden.";
        return ergebnisJson;
    }
}