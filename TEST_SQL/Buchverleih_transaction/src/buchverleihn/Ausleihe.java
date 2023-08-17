package buchverleihn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Ausleihe {

    public static final HashMap<Buch,Ausleihe> ausleiheHashMap = new HashMap<>();
    //Alternative
    public static final ArrayList<Ausleihe> ausleiheList = new ArrayList<>();

    // buch kunde datum dauer
    private final Buch buch;
    private final Kunde kunde;
    private final LocalDate datum;
    private final int dauer;

    public Ausleihe(Buch buch, Kunde kunde, LocalDate datum, int dauer)
    {
        this.buch = buch ;
        this.kunde = kunde;
        this.datum = datum;
        this.dauer = dauer;

        ausleiheHashMap.put(buch, this);
        // Alternative
        ausleiheList.add(this);
    }

    public Buch getBuch() {
        return buch;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public int getDauer()
    {
        return dauer;
    }
}
