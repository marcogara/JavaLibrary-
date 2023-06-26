package fabrickMethode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TransportauftragsFabrik fabrik = null;

        Transportauftrag auftrag = null;

        System.out.println("Biite geben Sie die gewünschte Transportart an: ");
        System.out.println("L für Landfracht, F für Luftfracht und S für Seefracht");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        switch (input.toUpperCase()) {
            case "L":
                fabrik = new Landfrachbrieffabrik();
                break;
            case "S":
                fabrik = new Seefrachbrieffabrik();
                break;
            case "F":
                fabrik = new Luftfrachbrieffabrik();
                break;

            default:
                System.out.println("Error");

        }

        if (fabrik != null) {
            auftrag = fabrik.erzeugeTransportauftrag("Zielort: Oldenbug");
            auftrag.lieferAus();
        }

    }
}
