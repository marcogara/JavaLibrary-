
import java.util.Scanner;

public class Kap05Schaltjahr {

    public static void main(String[] args) {

        final int daysInYear = 365;
        final int daysInLeapYear = 366;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days has the current year?" );
        int answergiven = scanner.nextInt();

        if (answergiven == 365) {
            System.out.println("this is a not a leap year");

        }else if (answergiven == 366) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("Enter correct amount of days");
        }







    }
}
