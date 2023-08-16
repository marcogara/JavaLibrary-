public class Teilnehmer <T1,T2>{

    private final T1 ID;
    private final T2 NAME;

    public Teilnehmer(T1 id, T2 name)
    {
        this.ID = id;
        this.NAME = name;
    }

    public T1 getId() {
        return ID;
    }

    public T2 getName() {
        return NAME;
    }
}
