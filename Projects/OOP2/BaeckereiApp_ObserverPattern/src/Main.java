import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

    static void advanceTime(Date date, Kunde k1, Kunde k2, Kunde k3) throws InterruptedException {
        while(true)
        {
            Thread.sleep(100);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR,1);
            date = calendar.getTime();
            System.out.println("Today is "+ date.toString());

            k1.checkBirthday(date);
            k2.checkBirthday(date);
            k3.checkBirthday(date);

        }
    }
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Hello hier sie ein Bäckerei !");

        Baeckerei baeckerei = new Baeckerei();

        Kunde k1 = new Kunde("Albert",      new java.sql.Date(1990, 9, 12),"schoko");

        k1.addObserver(baeckerei);
        baeckerei.addKundeInListI(k1);
        Kunde k2 = new Kunde("Thomas",      new java.sql.Date(1990, 2, 12),"banana");
        k2.addObserver(baeckerei);
        baeckerei.addKundeInListI(k2);
        Kunde k3 = new Kunde("Arianne",      new java.sql.Date(1990, 8, 12),"zitrone");
        k3.addObserver(baeckerei);
        baeckerei.addKundeInListI(k3);

        advanceTime(      new java.sql.Date(2023, 5, 24),k1,k2,k3);

    }
}





