import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import static java.time.Duration.*;

public class Kap09W3 {
    public static void main(String[] args) {
        var birthday   = LocalDate.of(1984,  6,  19);
        var today = LocalDate.now();
        int years = Period.between(birthday,  today).getYears();
        System.out.format("Marco ist %d Jahre alt.\n", years);

        var nextBirthday = birthday.plusYears(years+1);
        System.out.println("Sein nächster Geburtstag ist am: " +
                nextBirthday);

        long days = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.format("Das ist in %d Tagen.\n", days);
    }

}
