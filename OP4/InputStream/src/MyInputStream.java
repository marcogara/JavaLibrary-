
/*
 * Generelles: Die Klasse InputStream ist eine Superklasse
 * Sub-Klassen: AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream,
 * ObjectInputStream, PipedInputStream, SequenceInputStream, StringBufferInputStream
 *
 * Fast alle Streams implementieren die Interfaces => Closeable, AutoCloseable
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MyInputStream {

    static byte daten[];
    static Path p = Paths.get("resources/LoremIpsumText.txt");

    public static void main(String[] args) throws IOException
    {
        String text = inputStreamToString(p);

        text = scannerToString(p);
        System.out.println(text);
    }
    private static String inputStreamToString(Path file) throws IOException {
        try (InputStream in = Files.newInputStream(file)) {

            // liefert Größe der Datei in Bytes
            // Ob available() die tatsächliche Größe zurückgibt ist abhängig von der Implementierung des Streams
            System.out.println("Available: " + in.available());
            System.out.println(Files.size(file));

            daten = new byte[(int) Files.size(file)];
            // Große in Bytes ausgeben
            System.out.println("Daten Anzahl " + daten.length);

            int anzahl = in.read(daten);
            System.out.println("Anzahl gelesen " + anzahl);

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
        return new String(daten, StandardCharsets.UTF_8);
    }


    private static String scannerToString(Path file) throws IOException{
        StringBuilder sb = new StringBuilder();

        try(InputStream in = Files.newInputStream(file); Scanner scanner = new Scanner(in,StandardCharsets.UTF_8)){

            Pattern pattern = Pattern.compile("([.,])"); //RegEx
            scanner.useDelimiter(pattern);

            while(scanner.hasNext())
            {
                sb.append(scanner.next().trim()).append("\n");
            }


        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return sb.toString();
    }


}









































