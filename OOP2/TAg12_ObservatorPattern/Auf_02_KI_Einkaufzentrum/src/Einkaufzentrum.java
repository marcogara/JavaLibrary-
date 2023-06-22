import java.util.ArrayList;
import java.util.List;

public class Einkaufzentrum {

    //    Dort wird eine Liste vom Typ "KundeGrüßend" deklariert.
    private final List<KundeGruessen> kundeGruessenList = new ArrayList<>();

    //    Die öffentliche Methode neuerKundeBetrittDasGebäude löst das Event aus (Es wird für jedes Objekt der Liste die Methode aufgeruf


    public void addAboEvent(KundeGruessen kundeGruessen) {

        this.kundeGruessenList.add(kundeGruessen);

    }


    public void neuerKundeBetrittDasGebäude() {

        kundeGruessenList.forEach(KundeGruessen::gruessen);

        // for (KundeGruessen k : kundeGruessenList) {
        // k.gruessen();
        // }


    }
}
