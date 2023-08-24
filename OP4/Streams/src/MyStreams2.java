import javax.print.DocFlavor;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Der Begriff "Stream" beschreibt einen Datenstrom, zum Beispiel Input- und Output-Stream in und aus Dateien.
// Demnächst werden wir auch den Datenstrom zwischen zwei Programmen über das Netzwerk mit Sockets kennenlernen.
// In diesem Thema heute geht es aber um das Interface "Stream<T>", welches Datenströme aus z.B. Listen bereitstellen kann.

public class MyStreams2 {

    public static void main(String[] args) throws Exception {


        // System.out.println(createDataForFile());

        //Erstellung einer Dummy-Datei
        saveDataToFile(generateDummyData());
        System.out.println(readFileToString());

    }


    // Schreibt Dummy-Daten in einen StringBuilder
    // StringBuilder vs. StringBuffer -> beide haben exakt die gleichen Methoden
    // Unterschied: Builder ist performanter, der Buffer hingegen Thread-sicher

    /**
     * Renamed method to generate dummy data for file
     * @return String aus den sb
     */
    private static String generateDummyData(){

        StringBuilder sb = new StringBuilder();

        // ASCII-Werte
        for (int i=65;i<100;i++)
        {
            if ((i-65)%7==0 && i >65)
                sb.append("\n");
            sb.append(i);
            sb.append(" / ");
            sb.append((char) i );
            sb.append(" / ");
        }

        return sb.toString();
    }

    /**
     * Renamed method to save data into a file
     * Schreibt Dummy-daten mit einem IO Stream in eine Datei
     * @param data
     */
    private static void saveDataToFile(String data) {
        // Der Konstruktor ist überladen - man kann ihm direkt den Pfad oder ein file-Objekt übergeben
        //Letzteres macht Sinn, wenn ich in meinem Programm die Methoden der File Klasse neben
        // der Dateierzeugung wie zum Beispiel getParentDirectory() nutzen möchte
        try (FileWriter writer = new FileWriter("resources/FileStream.txt")) {
            writer.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Renamed method to read file contents into a string
     *
     * @return The contents of the file as a string.
     * @throws Exception If an error occurs while reading the file.
     */

        private static String readFileToString() throws Exception {
            // zetcode.com/java/readtext/

            try(InputStream in = MyStreams2.class.getResourceAsStream("/FileStream.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(in))){

            return reader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
    }

    /**
     * Renamed method to read file contents into a list of strings
     * @return
     * @throws Exception
     */
    private static List<String> readFileToList() throws Exception {

        //Seit java8 verfügt Filers über die line()-Methode, mit der wir
        // zeilenweise per Stream die Datei auslesen können
        // Der Stream kann mit toList() ab Java 16 das Ergebnis in einer Liste verpacken

        URL url = MyStreams2.class.getResource("/FileStream.txt");

        // Variante 1
        /*List<String> liste = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(url.getFile())))
        {
            stream.forEach(liste::add); // per forEach jedes Element der Liste hinzufügen
        }*/

        // Variante 2
        try(Stream<String> stream = Files.lines(Paths.get(url.toURI())))
        {
            List<String> liste = stream.collect(Collectors.toList());
            return liste;
        }



    }


}




















































