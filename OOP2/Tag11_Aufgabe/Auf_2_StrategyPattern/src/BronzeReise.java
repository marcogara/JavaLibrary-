import java.time.LocalDateTime;

class BronzeReise extends Reisen {

    public BronzeReise(int grundpreis, LocalDateTime beginn, StornoAlgorithmus algortihm) {
        super(grundpreis, beginn);
        setStornoAlgorithmus(algortihm);
    }

    @Override
    public double berechnenPreis() {
        return super.getGrundpreis() * 1.25;
    }

}

