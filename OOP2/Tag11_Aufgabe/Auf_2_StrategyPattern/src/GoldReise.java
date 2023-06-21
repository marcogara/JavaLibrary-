import java.time.LocalDateTime;

class GoldReise extends Reisen {

    public GoldReise(int grundpreis, LocalDateTime beginn, StornoAlgorithmus algortihm) {
        super(grundpreis, beginn);
        setStornoAlgorithmus(algortihm);
    }

    @Override
    public double berechnenPreis() {
        return super.getGrundpreis() * 1.75;
    }

}



