import java.util.Random;


import java.util.Random;
import java.util.Scanner;

/* Schreiben Sie ein Programm, das...
 * eine Zufallszahl von 1 bis inklusive 99 auswürfelt
 * und den Benutzer in einer Schleife über eine Eingabe die Zahl erraten lässt.
 * Dabei wird die eingegebene Zahl in einen Integer geparst. Bei falscher Eingabe soll wiederholt werden.
 * Das Programm teilt nun dem Benutzer mit, ob die Schätzung kleiner oder größer als die gewürfelte Zahl war.
 * Die Schleife endet, wenn die gewürfelte Zahl getroffen wurde.
 * Dem Benutzer wird die Anzahl der Versuche ausgegeben.

 * Recherchieren Sie die Klasse "Random".
 */
public class RandomNumberGenerator {

                public static void main(String[] args) {

                    int iRandom;
                    int iVermutung;
                    int iversuche=0;
                    iRandom = generateRandom();

                    do {

                        iVermutung = fragtUser();

                        if (iVermutung > iRandom) {
                            System.out.println("Deine Vermutung war groeßer asl den Zufallzahl...versuch noch mal.  " );


                        } else if (iVermutung < iRandom) {
                            System.out.println("Deine Vermutung war kleiner asl den Zufallzahl...versuch noch mal.  " );

                        }

                        iversuche++;

                        // System.out.println(" Zufallnummer war : " + iRandom);


                    } while (iRandom != iVermutung);

                    System.out.println(" WOOOW Richitg vermutet.");

                    System.out.println("du hast " + iversuche +" Versuche gemacht. ");

                }

    private static int generateRandom() {
        long seed = System.currentTimeMillis();                         // Use current time as seed
        Random random = new Random(seed);
        int randomNumber = random.nextInt(99) + 1;
        return randomNumber;

    }

    private static int fragtUser() {

        System.out.print("Bitte eine Zahl eingeben: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}

