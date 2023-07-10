import java.util.ArrayList;
import java.util.List;

public class SensorDaten {

    private final List<IObserver> ObserverList = new ArrayList<>();

    private int messWert;


    public void notifyObserver() {
        for (IObserver observer : this.ObserverList) {
            observer.update(this.messWert);
        }
    }


    public void addObserver(IObserver observer) {
        this.ObserverList.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.ObserverList.remove(observer);
    }

    public int getMessWert() {
        return messWert;
    }

    public void setMessWert(int messWert) {
        this.messWert = messWert;
    }
}
