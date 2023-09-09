public class Main {
    public static void main(String[] args) {

        // aufgabe 1
        CheckGeradeUngerade test = new CheckGeradeUngerade();
        System.out.println( test.checkgerade(2549));

        // Aufgabe Quersumme
        QuerSumme test1 = new QuerSumme();

        System.out.println("QuerSumme von 123435 ist : "+ test1.quersumme(123435));

        // aufgabe 2
        Aufgabe2 hallo = new Aufgabe2();

        Aufgabe2.G_mal_Hallo();
        System.out.println();

        int l=4;
        for (int i=0; i<l;i++)
            System.out.println("Welt");
        }
    }
