import java.util.Scanner;
/*
    AUFGABE 3A
    Schreiben Sie bitte die folgende Funktion (und testen Sie diese im Main)
    Name: inputINT
    Übergabewert: 1 String als User-Information-Text (z.B."Geben Sie bitte eine ganze Zahl ein: ")
    Funktion: Fragt vom User eine ganze Zahl ab (OHNE Überprüfung der Korrektheit der User-Eingabe)
    Rückgabewert: User-Eingabe

    AUFGABE 3B
    Schreiben Sie bitte ein Java-Programm, in dem (unter Verwendung der Funktion aus Teilaufgabe A) ...
    - eine Schleife solange durchlaufen wird, bis der User die Eingabe 42 tätigt
    - bei jeder falschen Eingabe eine Fehlermeldung auf der Konsole erscheint
    - bei der ersten korrekten Eingabe die Schleife beendet und eine Erfolgsmeldung ausgegeben wird
*/
public class Aufgabe_3 {

        public static void main(String[] args) {
            int iWert = 0;

            // System.out.println(inputInt("Geben Sie bitte eine ganze Zahl ein: "));

            do {

                iWert=    inputInt("Geben Sie bitte eine ganze Zahl ein: ");

                if (iWert != 42)
                {
                    System.out.println("Leider Falsch ! ");
                }

            }while (iWert != 42);

            System.out.println(" Programm endet ohne Feheler.");

        }

    private static int inputInt(String s) {

        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}


