import java.util.Scanner;

/* Aufgabe 1
 * Schreiben Sie eine statische Methode, die vom Benutzer eine Zahl abfragt und die eingegebene Zahl als Integer zurückgibt.
  Wenn der Benutzer etwas eingibt, was keine ganze Zahl ist, soll eine Fehlermeldung erscheinen und die Abfrage wird wiederholt.
 * Geben Sie zum Testen die eingegebene Zahl in der Konsole aus.
 * Rückgabewert: Die eingegebene Zahl
 */

public class Aufgabe_1 {

    public static void main(String[] args) {

        zahlAbfrage();

    }
        public static int ParsenINTEGER(String value, int defaultVal)                         // zum Kontrolle und Parsen in Integer Zahlen
        {
            try                                                      // Try-Catch abfangen von Fehlern (Exceptions) dazu kommen wir später mehr
            {
                return Integer.parseInt(value);                // gebe den geparsten Wert zurück
            }
            catch (NumberFormatException e)                    // wenn parsen nicht geklappt dann fange den Fehler ab der kommt und gebe den defaultWert zurück
            {
                return defaultVal;
            }
        }

    private static void zahlAbfrage() {

        while(true) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Bitte eine Zahl eingeben: ");
        String s = sc.nextLine();
        if (ParsenINTEGER(s, 0) != 0) {
            System.out.println("Eingegeben: " + ParsenINTEGER(s, 0));
            return;
        } else {
            System.out.println("Ihre Eingabe war nicht korrekt");
        }
        }
    }
}










