import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 Schreiben Sie bitte ein Java Programm, in dem ...
 - innerhalb einer ersten Schleife pro Durchlauf ganze Zahlen abgefragt werden:
   + falls der User inkorrekte Eingaben tätigt (Text, Kommazahlen, zu große Zahlen ...) wird die Eingabe ignoriert
   + falls die Eingabe eine positive ganze Zahl ist, wird sie in eine Integer-Liste eingetragen
   + falls die Eingabe eine negative Ganzzahl oder 0 ist, endet diese erste Schleife
 - eine foreach-Schleife startet, die alle Elemente aus der Liste ausgibt
 - eine weitere Schleife startet, in der pro Durchlauf eine ganze Zahl abgefragt wird:
   + falls der User keine ganze Zahl eingibt, kommt es zum nächsten Schleifendurchlauf (Wiederholen der Abfrage)
   + falls der User eine ganze Zahl x eingibt, endet die Schleife
 - aus der Liste alle Elemente gelöscht werden, deren Wert x ist (siehe vorangegangene User-Eingabe)
 - zur Kontrolle die (verkürzte) Liste ausgegeben wird
 - ein beliebiger Tastendruck das Programm beendet

 Zur Erläuterung ein Beispiel:
 Angenommen der User gibt der Reihe nach 1 2 2 3 a b c und -1 ein, dann ergibt die erste Ausgabe: 1 2 2 3
 (denn a b und c werden ignoriert und -1 beendete die Eingabe-Schleife)
 Nehmen wir ferner an, der User gibt anschließend der Reihe nach a b 2 ein, so werden alle 2en aus der Liste gelöscht
 (denn a und b wurden ignoriert und die erste zulässige Eingabe als Löschwert genutzt)
 => die abschließende Ausgabe lautet dann also: 1 3
 */

public class Aufgabe_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> ziffernliste = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        erstelleListe(ziffernliste);

        ausgabeListe(ziffernliste);

        sucheMatchLoop(ziffernliste);
        System.out.println("Zur Kontrolle hier neue List: ");
        ausgabeListe(ziffernliste);

    }

    public static void sucheMatchLoop(ArrayList<Integer> ziffernliste) {
        boolean boTreffer = false;

        do {

            int iEingabe = 0;
            System.out.println(" Bitte geben sie einen Zahl ein: ");

            try {
                iEingabe = scanner.nextInt();                         // try reading integer value from input stream

                if (iEingabe > 0) {                                    // check if value is valid
                    System.out.println("Input is a valid integer: " + iEingabe);
                    // check if value is inside the ZiffernList

                    if (ziffernliste.contains(iEingabe)) {

                        while (ziffernliste.contains(iEingabe)) {
                            System.out.println("The list contains " + iEingabe);


                            ziffernliste.remove(Integer.valueOf(iEingabe));
                        }

                        boTreffer = true;
                        break;

                    } else {
                        System.out.println("The list does not contain " + iEingabe);
                    }
                    continue; // continue prompting for more inputs

                } else {                        // handle invalid inputs
                    System.out.println("Input must be greater than or equal to zero!");
                    continue;          // in case 0 or negative is given exit the do-while loop
                }

            }catch(InputMismatchException e){
                    System.out.println("Invalid input! Please enter a valid integer.");
                }

                scanner.next();                 // discard non-integer input and continue prompting for more inputs
                continue;

            } while (!boTreffer) ;

        }

    public static void erstelleListe(ArrayList<Integer> ziffernliste) {

        Scanner scanner = new Scanner(System.in);
        do {

            int iEingabe =0;
            System.out.println(" Bitte geben sie einen Zahl ein: ");


            try {

                iEingabe = scanner.nextInt();                         // try reading integer value from input stream

                if (iEingabe > 0) {                                    // check if value is valid
                    System.out.println("Input is a valid integer: " + iEingabe);
                    // add some values to the list
                    ziffernliste.add(iEingabe);

                    continue; // continue prompting for more inputs
                } else {                        // handle invalid inputs
                    System.out.println("Input must be greater than or equal to zero!");
                    break;          // in case 0 or negative is given exit the do-while loop
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
            scanner.next();                 // discard non-integer input and continue prompting for more inputs
            continue;

        } while (true);

    }

    public static void ausgabeListe(ArrayList<Integer> ziffernliste) {

        System.out.println("Meine liste: ");
        for (Integer s : ziffernliste) {
            System.out.println(s);
        }
    }
}
