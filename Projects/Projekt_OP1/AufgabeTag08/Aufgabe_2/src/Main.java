/* Erstellen Sie in der Main einen Roboter mit der Aufgabe "Ich reiche Butter." und einer Batterielaufzeit
    von 5.
   * Lassen Sie ihn fünfmal in einer Schleife Butter reichen.
   */
public class Main {
    public static void main(String[] args) {

        Roboter roboter = new Roboter(5,"Ich reiche Butter");

        for (int i = 0; i < 5; i++) {
            roboter.führeAufgabeAus();
        }

        }
    }
