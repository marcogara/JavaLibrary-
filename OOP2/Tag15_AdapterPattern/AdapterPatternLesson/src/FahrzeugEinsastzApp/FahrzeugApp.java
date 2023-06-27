package FahrzeugEinsastzApp;

import externe_bibliothek.JsonRoutenBerechnung;
import externe_bibliothek.XmlDatei;

public class FahrzeugApp {

    // XML to Json Converter
    // JSON JavaScript Objective Notation


    public static void main(String[] args) throws InterruptedException {

        Konvertierend routenBerechnend = new XmlJsonAdapter(new JsonRoutenBerechnung());

        // Unser Programm stellt Xml-Daten zur Verfügung, z.b. über eine ausgelesene Datei oder Über einen Webservice.
        XmlDatei.daten = " Fahrzeugendaten ";

        // Wir kommunizzieren über den Adaptert mit der externen JSON Bibliothek und erhalten das Ergebnis als XML vom Adapter:

        XmlDatei ergebnisXml = routenBerechnend.getFahrzeitInXml(new XmlDatei());

        // Ausgabe zur Überprüfung:
        System.out.println("Die Fahrzeit liegt nun in XML vor: " + XmlDatei.daten);

        
    }
}
