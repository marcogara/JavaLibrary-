import java.time.LocalDateTime;

class GoldReise extends Reisen {

    public GoldReise(int grundpreis, LocalDateTime beginn, StornoAlgorithmus algortihm) {
        super(grundpreis, beginn);
        setSotnoAlgortihm(algortihm);
    }

    @Override
    public double berechnenPreis() {
        return getGrundPreis() * 1.75;
    }

}



