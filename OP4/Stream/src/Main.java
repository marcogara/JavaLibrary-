import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String text = null;

        Scanner scanner = new Scanner(System.in);
        File file = new File("protokoll.dat");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Bitte geben Sie ein Text ein: (oder Abbrechen durch 'Abbrechen");

        while (!(text = scanner.nextLine()).equals("Abbrechen")) {
            System.out.println("Bitte geben Sie ein Text ein: (oder Abbrechen durch 'Abbrechen");
            bw.append(text + "\n");
            bw.flush();
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("protokoll.dat"));

        String eingelesenerText = null;

        while ((eingelesenerText = br.readLine()) != null)
        {

            System.out.println(eingelesenerText);
        }

        br.close();

    }
    }
