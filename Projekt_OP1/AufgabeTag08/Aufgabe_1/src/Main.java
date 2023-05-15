import java.util.ArrayList;
import java.util.Arrays;
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
public class Main {
    public static void main(String[] args) {

        Firma firma1 = new Firma();
        firma1.setsName("wortex GmbH");
        firma1.setdKonten(new ArrayList<>(Arrays.asList(12.34, 432.43, 342.56)));

        Firma firma2 = new Firma();
        firma2.setsName("Health AG");
        firma2.setdKonten((new ArrayList<>(Arrays.asList(432.43, 89.50 , 3423.80))));

        List<Firma> firmenliste = new ArrayList<Firma>();
        firmenliste.add(firma1);
        firmenliste.add(firma2);

        for (Firma element : firmenliste)
        {
            System.out.println(element.getsName() + " : " + element.getSumme());
        }
        }
    }
