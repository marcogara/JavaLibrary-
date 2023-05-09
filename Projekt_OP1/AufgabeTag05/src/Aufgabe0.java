import com.sun.source.doctree.SystemPropertyTree;

/*
Aufgabe 0
Schreiben Sie bitte ein Java-Programm, das
a) einen Integer-Wert so lange abfragt, bis er mindestens die Größe 10 hat
b) bei jeder zu kleinen Eingabe eine Fehlermeldung ausgibt
c) bei einer Eingabe von mindestens 10 mit einer Erfolgsmeldung das Programm beendet

Bemerkungen:
1) Auch while und do-while Schleifen unterscheiden sich in Java nicht von denen in ANSI C
2) Fehleingaben im Sinne von Buchstaben, Zeichen, oder Kommazahlen werden vom Programm NICHT abgefangen
*/

import java.util.Scanner;

public class Aufgabe0 {

    public static void main(String[] args) {
        int izahl;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Bitte geben sie ein Zhal ein (mindestens groesser als 10): ");
            izahl= Integer.parseInt(scanner.nextLine());
            if (izahl<10) System.out.println("Fehlermeldung : Zahl nich mindestens groesser als 10");

            }while (izahl<10);

        System.out.println(" Programm ender ohne Feheler.");

    }
}
