package FahrzeugEinsastzApp;

import externe_bibliothek.JsonDatei;
import externe_bibliothek.JsonRoutenBerechnung;
import externe_bibliothek.XmlDatei;

public class XmlJsonAdapter implements Konvertierend {

    private final JsonRoutenBerechnung jsonRoutenBerechnung;

    public XmlJsonAdapter(JsonRoutenBerechnung jsonRoutenBerechnung) {
        this.jsonRoutenBerechnung = jsonRoutenBerechnung;
    }

    @Override
    public XmlDatei getFahrzeitInXml(XmlDatei xmlDaten) throws InterruptedException {
        // Die übergebenen XML-Daten müssen in Json umgewandelt werden:
        JsonDatei jsonDaten = this.transformiereXmlZuJson(xmlDaten);

        // Die Json-Daten übergeben wir an die externe Bibliothek um den Service zu benutzen:
        JsonDatei ergebnisFahrzeitInJson = jsonRoutenBerechnung.berechneFahrzeit(jsonDaten);

        XmlDatei ergebnisFahrzeitInXml = this.transformiereJsonZuXml(ergebnisFahrzeitInJson);

        return ergebnisFahrzeitInXml;
    }

    private JsonDatei transformiereXmlZuJson(XmlDatei xmlDatei) {
        System.out.println("Habe XML-Daten empfangen. Beginne die Transformation zu JSON...");

        // Transformation der Daten ist nur gefaked, gemocked. Ist natürlich viel komplizierter.
        JsonDatei jsonDaten = new JsonDatei();
        jsonDaten.daten = XmlDatei.daten;

        return jsonDaten;

    }

    private XmlDatei transformiereJsonZuXml(JsonDatei jsonDaten) throws InterruptedException {
        System.out.println("Habe ein Ergebnis in Json vorliegen... Transformiere nun nach Xml.");
        Thread.sleep(1000);

        // Transformation der Daten ist nur gefaked, gemocked. Ist natürlich viel komplizierter.
        XmlDatei xmlDaten = new XmlDatei();
        XmlDatei.daten = jsonDaten.daten;

        return xmlDaten;

    }
}
