import java.util.ArrayList;
import java.util.List;

public class Fahrzeug {
    private List<Observer> observerList = new ArrayList<>();
    private String kennzeichen;
    private boolean bearbeitet;

    public void setBearbeitet(boolean bearbeitet) {
        this.bearbeitet = bearbeitet;
    }

    public Fahrzeug(String kennzeichen){
        this.kennzeichen=kennzeichen;
        this.bearbeitet=false;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObserversAutoIstBereit() {
        for (Observer observer : observerList ) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {

        return "Fahrzeug mit kennzeichen : " + this.kennzeichen + "\nist schon Bearbeitet? : " + this.bearbeitet;
    }
}


