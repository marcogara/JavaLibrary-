import java.io.File;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.*;

public class FileDirectories
{
    public static void main(String[] args)
    {
        // Diese Methode erstellt eine neue Datei
        // Der Pfad muss angepasst werden, falls der Ordner "resources" nicht existiert
        // Hinweis: Unter Run - Edit Configuration -> Edit Configuration Template -> Application -> Working Directory -> $MODULE_WORKING_DIR$

        createFile("resources" + File.separator + "FilesAndDirectories.txt");
        delete("resources" + File.separator + "FilesAndDirectories.txt");

        System.out.println("File Separator is: " + File.separator);

        // Ermitteln des Working Directories
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);

        // System.getProperties().list(System.out); //-> gibt die ganzen Properties aus

        System.out.println(System.getProperty("user.home"));

        // createDirectory("resources/Ordner_1/Ordner_4/Ordner_5");
        // createDirectory("resources/Ordner_1/Ordner_2/Ordner_3");

        // createDirectory2("eins/zwei/drei/vier");
    }

    private static void createDirectory2(String s) {


    }

    private static void createFile(String path)
    {
        // Erzeugt eine neue File-Instanz mit dem angegebenen Pfad.
        // Hinweis! Die Datei existiert in diesem Moment eventuell noch nicht,
        File file = new File(path);

        try
        {
            if(file.createNewFile())
            {
                System.out.println("Datei erstellt! " + file.getName());
            }
            else
            {
                System.out.println("Datei existiert bereits! ");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void delete(String path){

            Path filePath = Paths.get(path);

            try{
                Files.delete(filePath);
                System.out.println("Datei gelöscht: " + filePath.getFileName());
            } catch(IOException e){
                e.printStackTrace();
            }
        }


    private static void functions(String path){
        try
        {
            File f = new File(path + "1.txt");
            Path p = Paths.get(path + "2.txt"); //ab Java 11 Path.off()

            //Weitere interessante FileSystem und FileSystems
            if(f.createNewFile())
                System.out.println("datei erstellt " + f.getName());

            p = Files.createFile(p);
            System.out.println("Datei erstellt " + p.getFileName());

            //Prüfen od die ausgehrürt werden Können
            System.out.println(f.canExecute());
            System.out.println(Files.isExecutable(p));

            //prüfen, ob in die Datei geschrieben werden
            System.out.println(f.canWrite());
            System.out.println(Files.isWritable(p));


            //Setzen der schreibrechte
            f.setWritable(false);
            System.out.println(f.canWrite());

            f.setWritable(true);
            System.out.println(f.canWrite());



        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
