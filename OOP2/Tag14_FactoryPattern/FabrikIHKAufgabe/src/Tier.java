public abstract class Tier {

    int alter;

    public Tier(int alter) {
        this.alter = alter;
    }

    abstract int getAlter();

    void gibAlterAus() {
        System.out.println("Meine Alter ist: " + this.alter);
    }

}

class Ameise extends Tier {

    public Ameise(int alter) {
        super(alter);
    }

    @Override
    int getAlter() {
        return 0;
    }
}
