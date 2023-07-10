public class ExceptionHandling {


    public static double exceptionHandlingDivision(int iZahl1, int iZahl2) {

        if (iZahl2 == 0) {
            throw new ArithmeticException("Teilen durch 0 nicth erlaubt");
        } else {
            double ergebnis = iZahl1 / iZahl2;
            return ergebnis;
        }
    }

    public static int exceptionHandlingQuerSumme(int a) throws Exception {

        int quersumme = 0;
        int length = String.valueOf(a).length();

        // System.out.println(length);

        if (a < 0) {
            throw new Exception("Quersumme ist negativ ");

        } else {
            for (int i = 0; i < length; i++) {
                quersumme = quersumme + (a % 10);
                a = a / 10;

            }
            return quersumme;
        }

    }

}





