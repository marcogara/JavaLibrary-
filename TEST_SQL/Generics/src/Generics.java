
public class Generics<T> {

    private T straße;
    private T postleitzeit;

    public void setStraße(T straße )
    {
        this.straße = straße;
    }

    public T getStraßedatenTyp()
    {
        return (T) straße.getClass();
    }

    public void setPostleitzeit(T postleitzeit)
    {
        this.postleitzeit = postleitzeit;
    }

    public T getPostdatenTyp()
    {
        return (T) postleitzeit.getClass();
    }

    public void setAdresse(T straße, T postleitzeit)
    {
        this.straße = straße;
        this.postleitzeit = postleitzeit;
    }

}
