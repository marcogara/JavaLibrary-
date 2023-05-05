import java.util.Scanner;

public class Taschenrechner {

    public static void taschenrechner(){
        int auswahl, zahl1, zahl2;
        zahl2=0;

        System.out.println("Geben Sie bitte einen ersten Zahl ein: ");
        Scanner scan = new Scanner(System.in);
        zahl1 = scan.nextInt();

        do {
            System.out.println("treffen Sie bitte eine Auswahl: \n(1) für + \n(2) für - \n(3) für * \n(4) für / ");
            auswahl = scan.nextInt();

            switch (auswahl) {
                case 1: sum2(zahl1,zahl2);
                    ;
                    break;
                case 2: min2(zahl1,zahl2);
                    ;
                    break;
                case 3: mol(zahl1,zahl2);
                    ;
                    break;
                case 4: div2(zahl1,zahl2);
                    ;
                    break;

                default:
                    System.out.println("ungültigen Auswahl");
                    ;
                    break;
            }

        }while (auswahl > 5 || auswahl < 0);

        // System.out.println("Auswahl ist: " + auswahl);
    }

    private static void div2(int a, int b) {

        fragtzweiteZahl();
        if (b == 0) System.out.println("Kann nicht geteilt durch 0");
        else {
            int mol = a / fragtzweiteZahl();
            System.out.println("Das Ergebniss lautet: "+mol);
        }

    }

    private static void mol(int a, int b) {

        int mol = a * fragtzweiteZahl();
        System.out.println("Das Ergebniss lautet: "+mol);
    }

    private static void min2(int a, int b) {

        int min = a - fragtzweiteZahl();
        System.out.println("Das Ergebniss lautet: "+min);

    }

    private static void sum2(int a, int b ) {

        // fragtzweiteZahl(b);

        int sum = a + fragtzweiteZahl();

        // System.out.println("zweite zahl ist: "+ fragtzweiteZahl(b));

        System.out.println("Das Ergebnis lautet: "+sum);

    }

    private static int fragtzweiteZahl() {
        System.out.println("Geben Sie bitte einen zweiten Zahl ein : ");
        Scanner scan = new Scanner(System.in);
        int c= scan.nextInt();

        return c;
    }


}
