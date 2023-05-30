public class Ritter extends Kreatur{

    public Ritter(String name) {
        super(name);
    }

    //  Der Ritter nutzt sein Schwert, der Drache spuckt Feuer.
    @Override
    public void angreifen() {
        System.out.println("Der Ritter nutzt sein Schwert");

    }
}
