// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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



        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");

        // Press Umschalt+F10 or click the green arrow button in the gutter to run the code.
        // for (int i = 1; i <= 5; i++) {

        // Press Umschalt+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Strg+F8.
        // System.out.println("i = " + i);
        }
    }
