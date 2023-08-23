import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.System.out;

/*
 * Java IO bietet das Konzept von Streams, das im Grunde einen kontinuierlichen
 * Datenfluss darstellt. Streams können viele verschiedene Datentypen wie
 * Bytes, Zeichen, Objekte usw. unterstützen.
 *
 * Generelles: Die Klasse OutputStream ist eine Superklasse
 * Sub-Klassen: AudioOutputStream, ByteArrayOutputStream, FileOutputStream, FilterOutputStream,
 * ObjectOutputStream, PipedOutputStream, SequenceOutputStream, StringBufferOutputStream
 *
 * Fast alle Streams implementieren die Interfaces => Closeable, AutoCloseable
 *
 * Die Schnittstelle Closeable stellt eine Methode namens close()
 * zum Schließen einer Quelle oder eines Ziels von Daten.
 *
 * Die Schnittstelle AutoCloseable bietet auch eine Methode namens close() mit
 * ähnlichem Verhalten wie in Closeable. In diesem Fall wird jedoch beim
 * Verlassen eines try-with-resource-Blocks automatisch die Methode close()
 * aufgerufen.
 */

public class Main {

    public static void main(String[] args) {

        try {
            // writeStringAsBytes("resources/Text.txt", "Lorem Ipsum");
            writeString("resources/Text.txt", "Lorem Ipsum");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeStringAsBytes(String file, String data) throws IOException {
        //String in Byte-Array umwandeln
        byte[] bytes = data.getBytes();

        //OutputStream implementiert AutoCloseable -> Voraussetzung für die Try-with-Resources
        try (OutputStream out = Files.newOutputStream(Path.of(file))) {
            for (byte elem : bytes) {
                out.write(elem); //Jedes Byte wird einzeln in der Datei geschrieben
            }
            // out.write(bytes); // Alle in einem Schritt in die Datei
            // out.write(bytes,6,4); //Durch Angabe von offset und Length können nur bestimmte Bytes in die Datei schreiben
        }
    }

    private static void writeString(String file, String data) throws IOException{

        Path path = Path.of(file);

      /*  try(OutputStream out = Files.newOutputStream(path); Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8))
        {
            writer.write(data);

        }catch (IOException e)
        {
            e.printStackTrace();
        }*/


        //Alternative: FileWriter
        try(FileWriter writer = new FileWriter(file, true)){

            writer.write(data + "\n");

        }catch (IOException e)
        {
            e.printStackTrace();
        }


    }


























































}
