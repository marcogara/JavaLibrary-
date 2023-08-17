package buchverleihn;

import java.util.HashMap;

public class Buch {

    public static final HashMap<Integer,Buch> bücher = new HashMap<>();

    // mit id und titel
    private final int id;
    private String titel;

    public Buch(int id, String titel)
    {
        this.id = id;
        this.titel = titel;
        bücher.put(id, this);
    }

    public int getId()
    {
        return id;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
    }

}
