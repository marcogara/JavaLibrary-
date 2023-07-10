public class DashBoard implements IObserver {

    int latestMesswert;

    @Override
    public void update(int m) {

        latestMesswert = m;
    }

    void display() {

        System.out.println(latestMesswert);
    }
}
