package fabrickMethode;

// Wir erstellen das Produktinterface (abstraktes Produkt), welches von allen konkreten Produkten implementiert wird.
// Häufig wird dies auch über eine abstrakte Klasse gelöst, wenn die konkreten Produkte nicht-abstrakte Methoden oder Attribute erben sollen.
public interface Transportauftrag {
    void lieferAus();
}

// Die konkreten Produktklassen überschreiben die Methoden des abstrakten Produktinterfaces.
class Landfrachtbrief implements Transportauftrag {
    @Override
    public void lieferAus() {
        System.out.println("Ich werde in eine Box verpackt und auf einen LKW verladen.");
    }
}

class Luftfrachtbrief implements Transportauftrag {
    @Override
    public void lieferAus() {
        System.out.println("Ich werde per Flugzeug verschickt.");
    }
}

class Seefrachtbrief implements Transportauftrag {
    @Override
    public void lieferAus() {
        System.out.println("Ich werde in einen Container verpackt und per Schiff versendet.");
    }
}

