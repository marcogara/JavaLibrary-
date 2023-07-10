import java.util.Scanner;

class Menu {

    public StringBuilder eingabeString;
    public int zaehler;
    private Schuhart art;
    private Schuhfabrik schuhfabrik;

    public void starteMenu() {

        Scanner scan = new Scanner(System.in);

        boolean istOK;
        do {

            istOK = true;
            eingabeString = new StringBuilder("Bitte wählen Sie eine Fabrik in der sie Schuhe herstellen wollen: \n");
            zaehler = 1;

            for (Fabrik s : Fabrik.values()) {
                eingabeString.append(zaehler).append(" ").append(s.toString()).append("\n");
                zaehler++;
            }

            //******************************
            System.out.println(eingabeString);
            System.out.print("Auswahl:");
            int fabrik = scan.nextInt();
            scan.nextLine();

            switch (fabrik) {
                case 1:
                    schuhfabrik = new Nordfabrik();
                    break;
                case 2:
                    schuhfabrik = new Südfabrik();
                    break;
                case 3:
                    schuhfabrik = new Nordsüdfabrik();
                    break;

                default:
                    System.out.println("Eingabe nicht bekannt!");
                    istOK = false;
                    break;
            }
        } while (!istOK);

        do {
            istOK = true;

            eingabeString = new StringBuilder("Bitte wählen sie Ihr Schuhprodukt: \n");
            zaehler = 1;
            for (Schuhart s : Schuhart.values()) {
                eingabeString.append(zaehler).append(" ").append(s.toString()).append("\n");
                zaehler++;
            }

            //******************************
            System.out.println(eingabeString);
            System.out.print("Auswahl:");
            int schuhart = scan.nextInt();
            scan.nextLine();

            switch (schuhart) {
                case 1:
                    art = Schuhart.GUMMISTIEFEL;
                    break;
                case 2:
                    art = Schuhart.HAUSSCHUHE;
                    break;
                case 3:
                    art = Schuhart.SNEAKER;
                    break;
                case 4:
                    art = Schuhart.STIEFEL;
                    break;
                case 5:
                    art = Schuhart.HIGHHEELS;
                    break;
                case 6:
                    art = Schuhart.SANDALEN;
                    break;
                default:
                    System.out.println("Eingabe nicht bekannt!");
                    istOK = false;
                    break;
            }
        } while (!istOK);

        schuhfabrik.erzeugeProdukt(art);

    }
}
