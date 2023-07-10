public class Kap08W6 {

        public static void main(String[] args) {
            // buildArray testen
            double[] tst = buildArray(125, 175, 6);

            // alle Array-Elemente in for-each-Schleife ausgeben
            for(double d : tst)
                System.out.println(d);
        }

        public static double[] buildArray(double x0, double x1, int n) {
            // Rückgabe null, wenn n kleiner oder gleich 1
            if(n <= 1)
                return null;

            // Array erzeugen
            double[] result = new double[n];

            // Schrittweite zwischen den double-Zahlen
            double delta = (x1 - x0) / (n - 1);

            // Array initialisieren
            for(int i = 0; i < n; i++)
                result[i] = x0 + delta*i;

            // Array zurückgeben
            return result;
        }

    }
