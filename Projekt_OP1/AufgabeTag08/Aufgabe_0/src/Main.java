/* Aufgabe 0 (Basics)
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * string "titel", int "dauerSekunden", string "interpret"
 * passenden Getter und Setter für die Attribute
 * und der Methode "spielen", die auf der Konsole alle Informationen über den Song ausgibt (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
 *
 * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
 * Erstellen Sie außerdem ein UML Klassendiagramm für die Klasse "Song".
 */

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("bella ciao",320,"italoband");
        song1.spielen();

        System.out.println(song1.getiDauerSekunde());

        }

}
