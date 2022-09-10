import java.sql.Time;
import java.time.LocalTime;

public class Kap09W2 {
    public static void main(String[] args) {
        LocalTime startOfMovie =LocalTime.of(19,30);
        LocalTime soon = startOfMovie.plusMinutes(132);

        System.out.println(" Film beginnt: " + startOfMovie);
        System.out.println(" Filmende:     "+ soon);
    }

}
