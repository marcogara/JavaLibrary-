import java.text.DecimalFormat;
import java.util.List;

/*
(- und + hier in der Aufgabenstellung dienen nur zur Auflistung der einzelnen Punkte und haben nichts mit den Zugriffsmodifizierern im UML-Diagramm zu tun)
 Schreiben Sie bitte ein Programm, in dem ...
 - eine Klasse Firma definiert wird
   + die Member der Klasse sind:
     - String: name
     - Double-Liste: konten
     - Methode: getSumme
       + Funktion: berechnet den Gesamtbetrag aller Listenelemente
       + Rückgabewert: Gesamtbetrag
     - Getter und Setter für die Attribute.

 - In der Main erstellen Sie zwei Firmen und geben die Werte testweise aus.

 Erstellen Sie zu der Klasse ein UML Klassendiagramm.
*/
public class Firma {

    private String sName;
    private List<Double> dKonten;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public List<Double> getdKonten() {
        return dKonten;
    }

    public void setdKonten(List<Double> dKonten) {
        this.dKonten = dKonten;
    }
    public String getSumme() {
        double summe = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        String formattedNumber = null;
        for (double dKonten : dKonten) {
            summe = summe + dKonten;
            formattedNumber = df.format(summe);
        }
        return formattedNumber;
    }
}
