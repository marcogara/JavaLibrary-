import java.util.Scanner;

public class Kap08W5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe einen Jahr ein: ");

        int year = scanner.nextInt();  // insert here the year you would like to test
        boolean lYtest = leapYear(year);

        System.out.println("Bitte gebe einen Monat ein:(Januar,Februar,... )");

        String monthToTest = scanner.next();   // insert here the year you would like to test
        int daysInAMonth = tage(monthToTest,year);

        if (lYtest == true)
            System.out.println(year + " ist ein Schaltjahr und " + monthToTest + " " + year + " hat " + daysInAMonth + " Tage.");
        else
            System.out.println(year + " ist kein Schaltjahr und "+ monthToTest + " " + year + " hat " + daysInAMonth + " Tage.");

    }

    public static boolean leapYear(int s) {

        boolean leapYear;
        if (s % 400 == 0) {
            leapYear = true;
        } else if (s % 100 == 0) {
            leapYear = false;
        } else if (s % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        return leapYear;
    }

    public static int tage(String monat,int jahr) {


        boolean lYtest =leapYear(jahr);
        int days = 0;
        switch (monat) {
            case "Januar":
            case "März":
            case "Mai":
            case "Juli":
            case "August":
            case "Oktober":
            case "Dezember":
                days = 31;
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                days = 30;
                break;
            case "Februar":
                if (lYtest == true)
                days = 29;
                else
                    days = 28;
                break;

        }
        if(days !=0)
        return days;
        else System.out.println("Ungültiger Monatsname!");
        return days;
    }
}

