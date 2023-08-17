package buchverleihn;

import java.util.HashMap;

public class Kunde {

    // nummer  name guthaben
    public static final HashMap<Integer, Kunde> kunden = new HashMap<>();
    private final int nummer;
    private String name;
    private int guthaben;

    public Kunde(int nummer, String name, int guthaben)
    {
        this.nummer = nummer;
        this.name = name;
        this.guthaben = guthaben;
        kunden.put(nummer,this);
    }

    public int getNummer()
    {
        return nummer;
    }
    public String getName()
    {
        return name;
    }
    public int getGuthaben()
    {
        return guthaben;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGuthaben(int guthaben)
    {
        this.guthaben = guthaben;
    }

    public void verändereGuthaben(int betrag)
    {
        guthaben = this.guthaben + betrag;
    }

}
