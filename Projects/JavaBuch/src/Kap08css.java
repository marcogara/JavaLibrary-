// projekt kap 08 - css pag. 162


public class Kap08css {

    public static void main(String[] args) {

        String a,c;
        a = "#rgbc";
        c = String.valueOf(isValid(a));
        System.out.println(isValid(c));
    }

    public static boolean isValid(String s) {

        if (!s.startsWith("#"))   // anfangszeichen kontrollieren
            return false;

        // restliche Zeichenkette ohne # in kleinbuchstaben
        String hex = s.substring(1).toLowerCase();

        // Länge kontrollieren
        int len = hex.length();
        if (!(len == 3 || len == 4 || len == 6 || len == 8))
            return false;

        // hexadezimale Ziffern kontrollieren
        for (char c : hex.toCharArray())
            if (!("0123456789abcdef".contains("" + c)))
                return false;

        // kein Fehler gefunden
        return true;
    }
}



