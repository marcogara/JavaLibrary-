import java.util.Random;
/*
Die Methode String randomletters(int n) soll eine Zeichenkette mit n zufällig
ausgewählten Kleinbuchstaben (a-z) zurückgeben.
 */

public class Kap08W4 {

    public static void main(String[] args) {
    int n = 14;
    String m= randomletters(n);
    System.out.println(m);
}
public static String randomletters(int p1) {

    int leftLimit = 97; // letter 'a' from ASCII table n. 97 is decimal correspondent to "a"
    int rightLimit = 122; // letter 'z'
    int targetStringLength= p1;
    Random random = new Random();

    String generatedString = random.ints(leftLimit, rightLimit + 1)
            .limit(p1)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

    return generatedString;
}

}
