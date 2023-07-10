import static java.lang.Thread.sleep;

public class Kunde implements Observer {

    private String kundenName ;

    private int kundenNummer;

    private  String kundeTelefon;

    public Kunde(String kundenName, int kundenNummer, String kundeTelefon) {
        this.kundenName = kundenName;
        this.kundenNummer = kundenNummer;
        this.kundeTelefon = kundeTelefon;
    }

    @Override
    public void update(Fahrzeug fahrzeug){

        System.out.println(fahrzeug);
        System.out.println("Kunde sagt : Danke !");

    }

    @Override
    public String toString() {

        return "Kunde : " + this.kundenName + "\nKunde ID : " + this.kundenNummer+ "\nTelefonnummer : " + this.kundeTelefon;
    }
}
