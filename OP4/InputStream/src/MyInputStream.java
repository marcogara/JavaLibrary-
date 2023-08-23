
/*
 * Generelles: Die Klasse InputStream ist eine Superklasse
 * Sub-Klassen: AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream,
 * ObjectInputStream, PipedInputStream, SequenceInputStream, StringBufferInputStream
 *
 * Fast alle Streams implementieren die Interfaces => Closeable, AutoCloseable
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyInputStream {
    static Path p = Paths.get("resources/LoremIpsumText.txt");

    public static void main(String[] args) throws IOException
    {
        String text = inputStreamToString(p);
    }
    private static String inputStreamToString(Path file) throws IOException{
        try(InputStream in = Files.newInputStream(file)) {

            // liefert Größe der Datei in Bytes
            // Ob available() die tatsächliche Größe zurückgibt ist abhängig von der Implementierung des Streams
            System.out.println("Available: " + in.available());
            System.out.println(Files.size(file));

            byte daten[] = new byte[(int) Files.size(file)];

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return " ";
    }
}