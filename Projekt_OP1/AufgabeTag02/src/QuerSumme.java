public class QuerSumme {

    public int quersumme(int a) {
        int quersumme = 0;
        int length = String.valueOf(a).length();
        
        for(int i=0;i<length;i++) {
            quersumme = quersumme + (a % 10);
            a = a / 10;
        }
        return quersumme;
    }
}
