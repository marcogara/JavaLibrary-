package fabrickMethode;

public abstract class TransportauftragsFabrik {

    // Fabrickmethode
    public abstract Transportauftrag erzeugeTransportauftrag(String auftragsdaten);

}

// Die konkrete Fabriken sind für die Erzeugung der konkreten Produkte zuständig.

class Landfrachbrieffabrik extends TransportauftragsFabrik {

    @Override
    public Transportauftrag erzeugeTransportauftrag(String auftragsdaten) {
        System.out.println("neuer Landfrachbrief mit daten:  " + auftragsdaten + " wird erstellt. ");
        return new Landfrachtbrief();
    }
}

class Luftfrachbrieffabrik extends TransportauftragsFabrik {

    @Override
    public Transportauftrag erzeugeTransportauftrag(String auftragsdaten) {
        System.out.println("neuer Luftfrachbrief mit daten:  " + auftragsdaten + " wird erstellt. ");
        return new Luftfrachtbrief();
    }
}

class Seefrachbrieffabrik extends TransportauftragsFabrik {

    @Override
    public Transportauftrag erzeugeTransportauftrag(String auftragsdaten) {
        System.out.println("neuer Seefrachbrief mit daten:  " + auftragsdaten + " wird erstellt. ");
        return new Seefrachtbrief();
    }
}


