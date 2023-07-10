/*
 * Aufgabe 1
Schreiben Sie bitte ein Java-Programm, das
a) in einer Endlosschleife den User zu Beginn jeden Durchlaufs fragt, ob er eine  ...
	(1) Übersetzung, oder
	(2) Monatsnummer wünscht
	(3) Programm Beenden

b) bei Eingabe von (1) einen deutschen Monatsnamen abfragt und die englische Übersetzung ausgibt
c) bei Eingabe von (2) einen deutschen Monatsnamen abfragt und die Monatsnummer ausgibt (Januar=1, ...)
d) bei Fehleingaben (Auswahl ungleich 1 und 2 / nicht-existenter deutscher Monatsname) eine entsprechende Fehlermeldung ausgibt

Bemerkung:
Versuchen Sie die Aufgabe bitte zunächst durch zwei 1-dimensionale String-Arrays zu lösen.
*/

import java.util.Scanner;

public class Aufgabe_01 {
    public static void main(String[] args) {

        boolean preogrammEnde = false;
        int iTreffer;
        Scanner sc = new Scanner(System.in);
        char cAntwort;

        do {

            System.out.println("Bitte auswhälen ");
            System.out.println("Übersetzung :          (1) \nMonatsnummer Wünscht : (2) \nProgramm Beenden :     (3)");
            iTreffer = sc.nextInt();

            switch (iTreffer) {

                case 1:
                    monateUebersetzen();
                    break;
                case 2:
                    System.out.println("i ist zwei");
                    break;
                case 3:
                    System.out.println("i ist drei");
                    break;
                default:
                    System.out.println(" Bitte versuchen si noch mal ");
                    break;

            }

            System.out.println("noc mal? (J) oder (N) ");
            cAntwort = sc.next().charAt(0);

            if (cAntwort == 'J' || cAntwort == 'j') preogrammEnde = false;

            if (cAntwort == 'N' || cAntwort == 'n') preogrammEnde = true;

        } while (preogrammEnde != true);

    }

    public static void monateUebersetzen() {

        Scanner sc = new Scanner(System.in);
        String[] monate = new String[12];
        String[] month = new String[12];
        String monateingabe;

        monate[0] = "Januar";
        monate[1] = "Februar";
        monate[2] = "März";
        monate[3] = "April";
        monate[4] = "Mai";
        monate[5] = "Juni";
        monate[6] = "Juli";
        monate[7] = "August";
        monate[8] = "September";
        monate[9] = "Oktober";
        monate[10] = "November";
        monate[11] = "Dezember";

        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";

        System.out.println("Bitte Schreiben Einen Monat: ");
        monateingabe = sc.next();

        switch (monateingabe) {

            case "Januar":
                System.out.println(month[0]);
                break;
            case "Februar":
                System.out.println(month[1]);
                break;
            case "März":
                System.out.println(month[2]);
            case "April":
                System.out.println(month[3]);
                break;
            case "Mai":
                System.out.println(month[4]);
                break;
            case "Juni":
                System.out.println(month[5]);

            case "Juli":
                System.out.println(month[6]);
                break;
            case "August":
                System.out.println(month[7]);
                break;
            case "September":
                System.out.println(month[8]);
                break;
            default:
                System.out.println(" KLein gültige Eingabe");
                break;

        }
    }
}



