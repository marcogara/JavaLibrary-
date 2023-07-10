import java.util.Arrays;
import java.util.Scanner;

public class Kap10W5 {

    public static void main(String[] args) {
        var lotto = inputLotto();
        System.out.println(Arrays.toString(lotto));
    }

    public static int[] inputLotto() {
        var result = new int[6];  // Eingaben hier speichern
        int n = 1;                // mitzählen, die wievielte Zahl eingegeben wird
        var scanner = new Scanner(System.in);  // für die Eingaben

        // Label für continue
        doLoop:
        do {
            try {
                // Eingabeaufforderung
                System.out.format("Geben Sie die %d. Zahl ein: ", n);
                int nextNumber = scanner.nextInt();

                // Zahlenbereich überprüfen
                if (nextNumber<1 || nextNumber>49) {
                    System.out.println("Die Zahl muss zwischen 1 und 49 liegen. Wiederholen!");
                    continue;
                }

                // Doppelgänger ausschließen
                for(int i = 0; i < n; i++)
                    if(result[i] == nextNumber) {
                        System.out.println("Diese Zahl haben Sie schon. Wiederholen!");
                        // do-Schleife fortsetzen
                        continue doLoop;
                    }

                // Zahl war OK: speichern
                result[n-1] = nextNumber;
                n++;
            } catch (Exception e) {
                // die Eingabe war fehlerhaft, nextInt() hat einen Fehler ausgelöst
                System.out.println("Das ist keine Zahl. Wiederholen!");
                scanner.next();  // fehlerhafte Eingabe überspringen!
            }
        } while(n <= 6);

        scanner.close();
        Arrays.sort(result);
        return result;
    }
}
