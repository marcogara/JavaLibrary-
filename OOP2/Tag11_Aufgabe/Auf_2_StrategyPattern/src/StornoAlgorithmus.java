import java.time.LocalDateTime;

// StornoAlgorithmus is the strategy interface
interface StornoAlgorithmus {
    double berechneStornierung(Reisen reise, LocalDateTime stornierungsDatum);
}

