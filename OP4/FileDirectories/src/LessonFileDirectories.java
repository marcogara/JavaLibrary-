import java.io.File;
import java.io.IOException;

// "nio" steht für "non-blocking input output" und ist ab Java 7 verfügbar.
// nio erweitert die Funktionalitäten zum Arbeiten mit Dateien.
import java.nio.file.*;
import java.util.stream.Stream;

public class LessonFileDirectories {

    // Mit den Klassen File, Path, Files, Paths können wir mit Dateien und Ordner im Dateisystem arbeiten.
// File ist im Paket java.io, die anderen in java.nio

        public static void main(String[] args)
        {
            // Erstellt eine einzelne Datei.
            // Achtung: Der Pfad muss angepasst werden, falls der Ordner "resources" nicht existiert (oder der Ordner muss manuell erstellt werden)
            // Hinweis: Unter Run -> Edit Configurations -> Edit Configuration Template -> Application -> Working Directory -> $MODULE_WORKING_DIR$ einfügen
            createFile("resources" + File.separator + "FilesAndDirectories.txt");
            // Löscht die Datei beim Beenden der JVM.
            delete("resources" + File.separator + "FilesAndDirectories.txt");

            System.out.println(File.separator); // File.separator gibt uns an, welches Trennzeichen für Dateipfade unser System verwendet.
            // Unter Windows ist für gewöhnlich / als auch \ möglich.

            // Das Working Directory lässt sich über System.getProperty("user.dir") ermitteln:
            String userDir = System.getProperty("user.dir");
            System.out.println(userDir);

            // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
            //System.getProperties().list(System.out);
            //System.out.println(System.getProperty("user.home"));

            System.out.println();

            // Erstellt einen oder mehrere Ordner:
            createDirectory("resources/Ordner1");
            createDirectory("resources/Ordner2/Ordner3");

            delete("resources/Ordner1");
            delete("resources/Ordner2/Ordner3");

            // Erstellt einen oder mehrere Ordner mit den Klassen aus java.nio.file:
            createDirectory2("resources/Ordner4/Ordner5");
            delete("resources/Ordner4/Ordner5");

            System.out.println("***************");

            // Weitere Funktionen für Dateien und Ordner:
            functions("resources/Examples");

            System.out.println("####################");

            // walk: Durchläuft den Dateibaum beginnend bei der angegebenen Datei oder dem Ordner.
            try (Stream<Path> s = Files.walk(Paths.get("resources")))
            {
                s.forEach(System.out::println);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        private static void createFile(String path)
        {
            // Erzeugt eine neue File-Instanz mit dem angegebenen Pfad.
            // Hinweis: Die Datei existiert an diesem Moment eventuell noch nicht!
            File file = new File(path);

            try
            {
                if (file.createNewFile())
                    System.out.println("Datei erstellt: " + file.getName());
                else
                    System.out.println("Datei existiert bereits.");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        private static void delete(String path)
        {
            try
            {
                File file = new File(path);
                if (file.exists())
                {
                    if (file.delete()) // Löscht die Datei oder den Ordner sofort (Es können nur leere Ordner gelöscht werden).
                        System.out.println(file.getName() + " wird gelöscht!");
                    else
                        System.out.println(file.getName() + " konnte nicht gelöscht werden!");


                    //file.deleteOnExit(); // Markiert eine Datei oder einen Ordner zum Löschen beim Beenden der virtuellen Maschine (JVM).
                    // Es werden dabei keine Überordner gelöscht, sondern immer nur der letzte Ordner im angegebenen Pfad!

                    //Files.delete(file.toPath());
                    // Löscht eine Datei oder einen Ordner, wenn es existiert. Es können nur leere Ordner gelöscht werden.
                    //Files.deleteIfExists(file.toPath());
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        private static void createDirectory(String path)
        {
            File file = new File(path);

            try
            {
                // Prüft, ob die Datei oder das Verzeichnis existiert.
                if (!file.exists())
                {
                    //if (file.mkdir()) // mkdir erstellt nur einen Ordner. wenn der Pfad Ordner beinhaltet, die nicht existieren, schlägt das Erstellen fehl.
                    if (file.mkdirs()) // mkdirs erstellt alle notwendigen Ordner, wenn der Pfad mehrere Ordner beinhaltet, die noch nicht existieren.
                        System.out.println("Directories erstellt!");
                    else
                        System.out.println("Directories konnten nicht erstellt werden!");
                }
                else
                    System.out.println("Directory existiert bereits!");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        // Seit Java 7 gibt es neben File im io-Package auch noch Path, Paths und Files im nio-Package.
        private static void createDirectory2(String path)
        {
            // Erstellt eine Path-Instanz mit dem übergebenen Pfad.
            Path p = Paths.get(path);

            try
            {
                p = Files.createDirectories(p); // Erstellt alle Ordner, inklusive notwendiger Überordner.
                //p = Files.createDirectory(p); // Erstellt einen Ordner, wirft eine Exception, wenn das nicht möglich ist, weil z.B. die Überordner fehlen.
                // Die Rückgabe dieser Methoden ist ein Path-Objekt, welches auf das erstellte Verzeichnis zeigt.
                System.out.println("Directories erstellt.");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }

        private static void functions(String path)
        {
            try
            {
                File f = new File(path + "1.txt");
                Path p = Paths.get(path + "2.txt"); // oder Path.of() ab Java 11

                // Weitere interessante Klassen sind FileSystem und FileSystems

                if (f.createNewFile())
                    System.out.println("Datei erstellt: " + f.getName());

                p = Files.createFile(p);
                System.out.println("Datei erstellt: " + p.getFileName());

                // Prüft, ob die Anwendung die angegebene Datei ausführen kann.
                System.out.println(f.canExecute());
                System.out.println(Files.isExecutable(p));

                // Prüft, ob die Anwendung die angegebene Datei beschreiben kann.
                System.out.println(f.canWrite());
                System.out.println(Files.isWritable(p));

                // Kann die Schreibberechtigung ändern.
                f.setWritable(false);
                System.out.println(f.canWrite());
                f.setWritable(true);

                // Prüft, ob die Anwendung die angegebene Datei lesen kann.
                System.out.println(f.canRead());
                System.out.println(Files.isReadable(p));

                // Gibt den absoluten Pfad zurück.
                System.out.println(f.getAbsolutePath()); // Als String
                System.out.println(p.toAbsolutePath()); // Als Path-Objekt

                // Gibt den Pfadnamen des übergeordneten Verzeichnisses zurück.
                System.out.println(f.getParent()); // Als String
                System.out.println(p.getParent()); // Als Path-Objekt

                // Datei verschieben:
                // "REPLACE_EXISTING" überschreibt das Ziel, wenn es schon existiert.
                Files.move(p, Paths.get("resources\\Ordner2\\"+p.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                // Datei kopieren:
                Files.copy(f.toPath(), Paths.get("resources\\Ordner2\\"+f.getName()), StandardCopyOption.REPLACE_EXISTING);

                delete(f.toString());
                delete(p.toString());

                // FileSystem-Beispiel:
                FileSystem fs = FileSystems.getDefault();
                System.out.println(fs);
                fs.getRootDirectories().forEach(System.out::println);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

