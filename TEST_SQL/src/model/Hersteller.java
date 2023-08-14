package model;

public class Hersteller {

    // Erstellen der Objektvariablen
    private final int nummer;
    private String name;

    // Setzen der Werte bei der Konstruktion eines Objektes von Typen Hersteller
    public Hersteller(int nummer, String name)
    {
        this.nummer = nummer;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer()
    {
        return nummer;
    }

    public String getName()
    {
        return name;
    }

}
