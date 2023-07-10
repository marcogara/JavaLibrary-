import java.util.HashMap;
import java.util.Map;

public class Werkstatt implements Observer{

    private Map<Fahrzeug,Kunde> auftraege = new HashMap<>();

    public void addAuftrag (Fahrzeug fahrzeug,Kunde kunde)
    {
        auftraege.put(fahrzeug,kunde);
    }

    public Map<Fahrzeug, Kunde> getAuftraege() {
        return auftraege;
    }

    @Override
    public void update(Fahrzeug fahrzeug) {

        System.out.println(auftraege.get(fahrzeug));
        System.out.println("Text to Kunde ist geschickt!");

    }
}
