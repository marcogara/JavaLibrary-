import java.time.Duration;
import java.time.LocalDateTime;

// KulanterStornoAlgorithmus is a concrete strategy class
class KulanterStornoAlgorithmus implements StornoAlgorithmus {
    @Override
    public double berechneStornierung(Reisen reise, LocalDateTime stornierungsDatum) {
        long tageBisAbreise = Duration.between(LocalDateTime.now(), reise.getReisebeginn()).toDays();
        if (tageBisAbreise > 1) {
            return 0.25 * reise.berechnenPreis();
        } else {
            return 0.5 * reise.berechnenPreis();
        }
    }
}

