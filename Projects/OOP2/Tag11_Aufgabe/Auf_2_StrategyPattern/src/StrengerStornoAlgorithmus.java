import java.time.Duration;
import java.time.LocalDateTime;

// StrengerStornoAlgorithmus is another concrete strategy class
class StrengerStornoAlgorithmus implements StornoAlgorithmus {
    @Override
    public double berechneStornierung(Reisen reise, LocalDateTime stornierungsDatum) {
        long tageBisAbreise = Duration.between(LocalDateTime.now(), reise.getBeginn()).toDays();
        if (tageBisAbreise > 10) {
            return 0.25 * reise.berechnenPreis();
        } else {
            return 0.75 * reise.berechnenPreis();
        }
    }

}

