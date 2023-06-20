/*
    This is an open.source code meant for educational purposes only not intended
    for production use and may contain errors or bugs.
    Feel free to modify and use it for personal learning or teaching purposes.
    Not intended for distribution as a commercial product.
    Thanks.
*/

import java.util.Scanner;

interface RechnenOperationen {
    double berechnen2Zahlen(int zahl1, int zahl2);
}

public class Rechner {

    Scanner scanner = new Scanner(System.in);

    int zahl1;
    int zahl2;

    private RechnenOperationen rechnenOperationen;

    public void frageUserFuerGrundrechenoperationen() {
        System.out.print("Addition        (a)\nSubtraktion     (s)\nMultiplikation  (m)\nDivision        (d)\n");

        String input = scanner.nextLine();

        char selection = input.charAt(0);

        if (selection == 'a') {
            RechnenOperationen x = new Rechner.Addition();
            setRechnenOperationen(x);
        }
        if (selection == 's') {
            RechnenOperationen x = new Rechner.Subtraktion();
            setRechnenOperationen(x);
        }
        if (selection == 'm') {
            RechnenOperationen x = new Rechner.Multiplikation();
            setRechnenOperationen(x);
        }
        if (selection == 'd') {
            RechnenOperationen x = new Rechner.Division();
            setRechnenOperationen(x);
        }

    }

    public void setRechnenOperationen(RechnenOperationen rechnenOperationen) {
        this.rechnenOperationen = rechnenOperationen;
    }

    public double rechnen() {
        return rechnenOperationen.berechnen2Zahlen(zahl1, zahl2);
    }

    public void frageUserFuerZahlen() {

        System.out.println(" Zahl1 eingeben : ");
        this.zahl1 = scanner.nextInt();

        System.out.println(" Zahl2 eingeben : ");
        this.zahl2 = scanner.nextInt();
    }


    public static class Addition implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 + zahl2;
        }
    }

    public static class Subtraktion implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 - zahl2;
        }
    }

    public static class Multiplikation implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 * zahl2;
        }
    }

    public static class Division implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 / zahl2;
        }
    }

}


































