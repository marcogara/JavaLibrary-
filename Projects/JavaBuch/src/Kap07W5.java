import java.util.Scanner;

public class Kap07W5 {

    // Password bewerter

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bitte gebe ein Password ein: ");
        String s = scanner.next();

        boolean length = false;
        boolean kleinUndGroße = false;
        boolean ziffern = false;
        boolean sonderzeichen = false;

        boolean validPassword = false;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c))
                ziffern = true;

            if (Character.isLowerCase(c) || Character.isUpperCase(c))
                kleinUndGroße = true;

            if (s.contains("!") || s.contains("?"))
                sonderzeichen = true;

            if (s.length() > 8)
                length = true;

        }

        System.out.println(kleinUndGroße);
        System.out.println(ziffern);
        System.out.println(sonderzeichen);
        System.out.println(length);

    }
}








