import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {

        // Beispiel Für Transaction
        boolean buchenErgebnis = Transaction.buchenVonNachBetrag("0000123456","0000987654",500);
        if(buchenErgebnis)
        {
            System.out.println("Die Buchung war elfolgreich");
        }
        else System.out.println("Die Buchung war nicht erfolgreich");

        // Beispiel Für Transaction
        boolean buchenErgebnis1 = Transaction.buchenVonNachBetrag("0000","0000987654",500);
        if(buchenErgebnis1)
        {
            System.out.println("Die Buchung war elfolgreich");
        }
        else System.out.println("Die Buchung war nicht erfolgreich");


        boolean erg = BinaryData.updateKundeMitBild(1,"/Users/Administrator/Pictures/Screenshots/Screenshot (7).png");
         if (erg)
             System.out.println("da bild wurde eingefügt");

         else System.out.println("Das Bild wurde nicht eingefügt");

/*        System.out.println("Dateipfad eingeben:");
        Scanner scanner = new Scanner(System.in);
        String dateipfad = scanner.nextLine();

		*//*if (updateKundeMitBild(dateipfad, 1))
			System.out.println("Erfolgreich");*//*

        if (BinaryData.selectBildVonKunde(dateipfad, 1))
            System.out.println("Erfolgreich");*/


    }
    }
