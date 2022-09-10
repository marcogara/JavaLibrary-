public class Kap07W4 {
    /* Geben ist eine beliebige Zeichenkette s = "Lorem ipsum".
    Ermitteln Sie, wie viel Prozent der Buchstaben Vokale sind, wie viel Konsonanten.
    Ignorieren Sie dabei alle andere Zeichen. Geben Sie die Prozentzahlen mit zwei Nachkommastellen aus.
    Erstellen Sie außerdem eine neue Zeichenkette, die nur alle Vokale als Kleinbuchstaben enthält
    (hier also "oeiu").
 */
    public static void main(String[] args) {

        String s = "Lorem ipsum";

        double cntVokale = 0, cntKonsonanten =0, cntSpace=0;
        double cntNumberofC =0;
        double porzentVok = 0;
        double porzentKon =0;

        for (char c: s.toCharArray()) {

            if ( c== 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            cntVokale ++;

            else if ((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'))
                cntKonsonanten ++;

            else if ( c== ' ')
                cntSpace ++;

        }

        System.out.println(s.toLowerCase());

        cntNumberofC = cntKonsonanten + cntVokale;

        porzentVok = (cntVokale / cntNumberofC) *100;
        porzentKon = (cntKonsonanten / cntNumberofC) *100;

        System.out.print("Prozent der Vokale ist: ");

        System.out.format("%.2f\n",porzentVok);

        System.out.print("Prozent der Konsonanten ist: ");

        System.out.format("%.2f\n",porzentKon);

    }
}

