public class History implements IObserver {
    int latestMesswert;

    @Override
    public void update(int m) {

        latestMesswert = m;
    }

    void save() {

        System.out.println("This value was correctly saved " + latestMesswert);
    }
}
