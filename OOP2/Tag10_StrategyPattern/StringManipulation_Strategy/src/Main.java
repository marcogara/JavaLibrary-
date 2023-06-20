// Das Strategy-Muster.
// Allgemeines: Ist ein Verhaltensmuster, welches uns erlaubt eine Familie von Algorithmen zu definieren, jeden Algorithmus in eine getrennte Klasse
// zu stecken und ihre Objekte austauschbar zu machen.
// Motivation: Wir verwenden das Strategiemuster, wenn wir verschiedene Varianten (Strategien) eines Algorithmus in einem Objekt brauchen und diese zur
// Laufzeit austauschen möchten.
// Erklärung: Im Strategy-Muster kann das Verhalten einer Klasse oder deren Algorithmen zur Laufzeit ausgetauscht werden. Wir kreieren Objekte, die
// verschiedene Strategien repräsentieren und ein Kontextobjekt, dessen Verhalten sich nach je nach eingesetzter Strategie ändert.

// Vorteile:
// - Algorithmen, die in einem Objekt verwendet werden, können zur Laufzeit ausgetauscht werden.
// - Wir können die Implementationsdetails der Strategien isolieren von dem Code, der die Strategien ausführt.
// - Open/Closed Prinzip: Es können einfach neue Strategien hinzugefügt werden (Open: offen für Erweiterungen), ohne bestehenden Code abändern zu müssen (Closed: geschlossen für Änderungen).

// Nachteile:
// - Hat das Programm nur wenige Algorithmen, die sich selten ändern, gibt es keinen ausreichenden Grund das Programm mit neuen Klassen und Interfaces zu verkomplizieren.
// - Der Client muss um die Unterschiede der Algorithmen wissen, um den angemessenen auszuwählen.   ???
// - Einige moderne Programmiersprachen unterstützen funktionale Programmierung und können dieselbe Funktionalität, ohne zusätzliche Klassen und Interfaces, einfacher umsetzen.

// Implementierungsschritte Strategy-Muster
// 1. Erstelle ein Interface mit einer abstrakten Methode. -> Strategie.java
// 2. Erstelle konkrete Klassen, die das Interface implementieren. Für jede konkrete Strategie eine Klasse.
// 3. Erstelle eine Kontextklasse. Eine Kontextklasse muss ein Attribut bereithalten um eine Referenz zu einer Strategie abspeichern zu können.
// Die Kontextklasse funktioniert mit allen Strategien durch dasselbe Interface, welches nur eine Methode bereitstellt, um die gewählte Strategie
// auszuführen. Durch das Strategy Pattern wird die Kontextklasse unabhängig von konkreten Strategien und der Entwickler kann beliebig neue Algorithmen / Strategien
// hinzufügen oder bestehende ändern, ohne die Kontextklasse oder bestehende Strategie-Klassen anpassen zu müssen.

public class Main {
    public static void main(String[] args) {

        String string1 = "Hallo";

        String string2 = "Welt";

        SchreibKontext sch1 = new SchreibKontext(new NormalschreibStrategie());

        String erg = sch1.schreiben(string1, string2);

        System.out.println(erg);

    }

    public interface SchreibStrategie {

        String erstelleZeichenkette(String s1, String s2);

    }

    public static class SchreibKontext {

        // hier werden zur Laufzeit die konkreten Strategien untereinander ausgetausch.
        private SchreibStrategie schreibStrategie;

        public SchreibKontext(SchreibStrategie schreibStrategie) {

            this.schreibStrategie = schreibStrategie;
        }

        public SchreibStrategie getSchreibStrategie() {
            return schreibStrategie;
        }

        public void setSchreibStrategie(SchreibStrategie schreibStrategie) {
            this.schreibStrategie = schreibStrategie;
        }

        public String schreiben(String s1, String s2) {

            return schreibStrategie.erstelleZeichenkette(s1, s2);
        }
    }

    public static class NormalschreibStrategie implements SchreibStrategie {
        @Override
        public String erstelleZeichenkette(String s1, String s2) {

            return s1 + " " + s2;
        }
    }

    public class GrossschreibStrategie implements SchreibStrategie {
        @Override
        public String erstelleZeichenkette(String s1, String s2) {

            return (s1 + " " + s2).toUpperCase();
        }
    }

    public class KleinschreibStrategie implements SchreibStrategie {
        @Override
        public String erstelleZeichenkette(String s1, String s2) {

            return (s1 + " " + s2).toLowerCase();
        }
    }

}



































































































