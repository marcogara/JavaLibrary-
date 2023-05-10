/* Aufgabe 0
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein Array "Album" vom Typ String mit der Größe 5 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 5 Songs hinzu. Dabei ist jedes Element im Array ein Song-Titel.
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie Length-Eigenschaft des Arrays für die Schleifenbedingung.
 */


public class Aufage_0 {

    public static void main(String[] args) {

        String [] sAlbum = new String[5];
        sAlbum [0] = "Blinding Lights";
        sAlbum [1] = "Levitating";
        sAlbum [2] = "Good 4 U";
        sAlbum [3] = "Stay";
        sAlbum [4] = "Montero";

        arrAusgaben(sAlbum);

    }

    private static void arrAusgaben(String[] sAlbum) {

        for (int i = 0; i < sAlbum.length; i++) {
            System.out.println(sAlbum[i] + " ");

        }
    }

}
