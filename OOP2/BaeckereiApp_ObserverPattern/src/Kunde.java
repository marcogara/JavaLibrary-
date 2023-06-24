import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Kunde {

    private String name;
    private Date geburtstag;
    private String liebligsGeschmack;

    private List<Observer> ObserverList = new ArrayList<>();

    public Kunde(String name, java.sql.Date geburtstag, String liebligsGeschmack) {
        this.name = name;
        this.geburtstag = geburtstag;
        this.liebligsGeschmack = liebligsGeschmack;
    }

    public String getName() {
        return name;
    }

    public void addObserver(Observer observer) {
        this.ObserverList.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.ObserverList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer o : ObserverList) {
            o.update(this);
        }
    }

    public boolean checkBirthday(Date today) {

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(today);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(geburtstag);

        if(cal1.get(Calendar.MONTH)==cal2.get(Calendar.MONTH)&&cal1.get(Calendar.DAY_OF_MONTH)==cal2.get(Calendar.DAY_OF_MONTH))
        {
            notifyObserver();
            return true;
        } else return false;
    }

}
