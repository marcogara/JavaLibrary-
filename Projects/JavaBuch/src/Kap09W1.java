import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

import static java.lang.System.out;

public class Kap09W1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        out.print(c.getDisplayName(
                Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.GERMAN)+" ");

        LocalDate date1 = LocalDate.now();
        DateTimeFormatter dtf =        // Format Montag 31.12.
                DateTimeFormatter.ofPattern( "d.M." );
        System.out.print(dtf.format(date1));




        }
    }

