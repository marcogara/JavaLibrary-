public class Drache extends Kreatur{

    public Drache(String name) {
        super(name);
    }

    //  Der Ritter nutzt sein Schwert, der Drache spuckt Feuer.
    @Override
    public void angreifen() {
        System.out.println(getClass().getSimpleName() + " " + name + ": Ich spucke Feuer!");

    }
}
