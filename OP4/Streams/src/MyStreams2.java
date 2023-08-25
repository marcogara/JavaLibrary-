import javax.print.DocFlavor;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *  Der Begriff "Stream" beschreibt einen Datenstrom, zum Beispiel Input- und  Output-Stream in und aus Dateien.
 *  Demnächst werden wir auch den Datenstrom zwischen zwei Programmen über das Netzwerk mit Sockets kennenlernen.
 *  In diesem Thema heute geht es aber um das Interface "Stream<T>", welches Datenströme aus z.B. Listen  bereitstellen kann.
*/

/**
 * This class is responsible for reading files from the resources folder.
 * The resources folder should be set as a source directory and marked as Resources
 * in the project structure of IntelliJ or any other IDE being used. -> README file
 */

public class MyStreams2 {

    public static void main(String[] args) throws Exception {

        // System.out.println(createDataForFile());

        //Erstellung einer Dummy-Datei
        saveDataToFile(generateDummyData());
        // System.out.println(readFileToString());


        try {

            String text = readFileToString();
            System.out.println(text);
            System.out.println("-------------------------------");

            // Kommentare hinzufügen
            List<String> liste = readFileToList();
            liste.stream().forEach(System.out::println);

            System.out.println("Größe der liste: " + liste.size());

            toFilteredList(liste).forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Generates dummy data and stores it in a StringBuilder.
     * StringBuilder vs. StringBuffer -> both have exactly the same methods.
     * Difference: Builder is more efficient, while Buffer is thread-safe.
     * Renamed method to generate dummy data for file.
     *
     * @return A string representation of the data stored in the StringBuilder.
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
        // Letzteres macht Sinn, wenn ich in meinem Programm die Methoden der File Klasse neben
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
     * Renamed method to read file contents into a list of strings.
     *
     * @return A list containing each line of the file as a separate string element.
     * @throws Exception If an error occurs while reading the file.
     */
    private static List<String> readFileToList() throws Exception {

        URL url = MyStreams2.class.getResource("/FileStream.txt");

        // Variante 1
/*
        List<String> liste = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(url.getFile())))
        {
            stream.forEach(liste::add); // per forEach jedes Element der Liste hinzufügen
        }
*/

        // Variante 2
        // Read lines from the file using Files.lines() since Java 8
        try (Stream<String> stream = Files.lines(Paths.get(url.toURI()))) {
            // Collect stream elements into a list using Collectors.toList()
            List<String> liste = stream.collect(Collectors.toList());
            return liste;
        }
    }


            private static List<String> toFilteredList(List<String> liste)
            {
                // Schritt 1: 5 Zeilen zerlegen -> Jedes Element in einer eigenen Zeile.
                // Wir iterieren die Liste.
                // Wenn wir jeden String splitten, bekommen wir ein Array, welches auch streamen kann.
                // Wir iterieren das Array und geben jedes Element aus.
                liste.forEach(e -> Arrays.stream(e.split(" ")).forEach(System.out::println));
                System.out.println();

                // Schritt 2: Filtern nach alphabetischen Werten.
                // Wir wollen nur einzelne Großbuchstaben.
                liste.forEach(e -> Arrays.stream(e.split(" "))
                        .filter(f -> f.length() == 1 && Character.isAlphabetic(f.charAt(0)) && Character.isUpperCase(f.charAt(0)))
                        .forEach(System.out::println));
                // Erläuterung:
                // Wir iterieren über die Liste mit forEach. Das heißt, jede einzelne Zeile des Textes. Für jedes Element der Liste (also jede Zeile) splitten für am Leerzeichen.
                // Das Ergebnis davon ist ein Array.
                // Wir iterieren über das Array als Stream und filtern dabei nach allen Elementen, die genau 1 Zeichen lang sind und Großbuchstaben sind.
                // Der Filter liefert wieder einen Stream, über den wir iterieren können.
                System.out.println();

                // Schritt 3: Das Ergebnis in eine neue Liste schreiben.
                List<String> result = new ArrayList<>();
                liste.forEach(e -> Arrays.stream(e.split(" "))
                        .filter(f -> f.length() == 1 && Character.isAlphabetic(f.charAt(0)) && Character.isUpperCase(f.charAt(0)))
                        .forEach(result::add));

                return result;
            }

        }






















































