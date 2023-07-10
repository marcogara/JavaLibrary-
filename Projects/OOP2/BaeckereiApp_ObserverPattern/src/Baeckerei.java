import java.util.ArrayList;
import java.util.List;

interface Observer {

    public void update(Kunde kunde);

}

public class Baeckerei implements Observer
{

    private List<Kunde> kundeList = new ArrayList<>();

    public void addKundeInListI(Kunde kunde)
    {
        this.kundeList.add(kunde);
    }

    @Override
    public void update(Kunde kunde) {

        System.out.println("Backe Kuche für Kunde"+ kunde.getName()+" !");
    }

}
