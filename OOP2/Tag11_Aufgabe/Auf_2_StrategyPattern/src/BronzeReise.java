import java.time.LocalDateTime;

class BronzeReise extends Reisen {

    public BronzeReise(int grundpreis, LocalDateTime beginn, StornoAlgorithmus algortihm) {
        super(grundpreis, beginn);
        setStonoAlgortihm(algortihm);
    }

    @Override
    public double berechnenPreis() {
        return getGrundPreis() * 1.25;
    }

}

