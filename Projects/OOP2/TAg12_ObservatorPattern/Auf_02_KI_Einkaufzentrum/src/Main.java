/*
       Sie haben eine "KI" in Ihrem Einkaufzentrum im Einsatz.

    *  Jedes Mal, wenn der Sensor an der Tür einen neuen Kunden bemerkt, soll die "KI" den Kunden grüßen.
    *
    *  Das werden wir durch verschiedene Klassen simulieren.
    *  Als Observer erstellen wir das Interface "KundeGrüßend" welches über die Methode "grüßen()"" verfügt.
    *  Der Sender des Events ist das Einkaufzentrum mit dem Sensor.
    *  Dort wird eine Liste vom Typ "KundeGrüßend" deklariert.
    *  Die öffentliche Methode neuerKundeBetrittDasGebäude löst das Event aus (Es wird für jedes Objekt der Liste die Methode aufgerufen).
    *
    *  Empfänger für das Event sind die Klassen Mitarbeiter und Geschäftsführer.
    *  Ja, das Einkaufzentrum wird von einer KI geführt.
    *  Die Grüßen-Methode macht nichts anderes, als testweise eine Begrüßung auf dem Bildschirm auszugeben.
    *  Da die KI japanisch ist, sagt sie "Irasshaimase!" als Mitarbeiter und "Irasshaimase!!!" als Geschäftsführer.
    *  Zum Schluss erstellen wir in der Main ein paar Objekte unserer Klassen, abonnieren das Event und lassen einen Kunden in das Gebäude.
*/
public class Main {
    public static void main(String[] args) {

        Einkaufzentrum einkaufzentrum = new Einkaufzentrum();
        
        einkaufzentrum.addAboEvent(new Geschaeftsfuehrer());

        einkaufzentrum.addAboEvent(new Mitarbeiter());

        einkaufzentrum.neuerKundeBetrittDasGebäude();


    }
}
