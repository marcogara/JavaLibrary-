abstract class Computerteil {
    private final String bezeichnung;
    private final String hersteller;

    public Computerteil(String bezeichnung, String hersteller) {
        this.bezeichnung = bezeichnung;
        this.hersteller = hersteller;
    }

    public String toString() {
        return this.bezeichnung + ", " + this.hersteller;
    }
}

class Grafikkarte extends Computerteil {

    // Konstruktor und Methoden für Grafikkarten-Klasse
    public Grafikkarte(String bezeichnung, String hersteller) {
        super(bezeichnung, hersteller);
    }

}

class Mainboard extends Computerteil {

    // Konstruktor und Methoden für Mainboards-Klasse
    public Mainboard(String bezeichnung, String hersteller) {
        super(bezeichnung, hersteller);
    }

}

class SSD extends Computerteil {
    // Konstruktor und Methoden für SSD-Klasse
    public SSD(String bezeichnung, String hersteller) {
        super(bezeichnung, hersteller);
    }

}

class MSIGrafikkarte extends Grafikkarte {
    public MSIGrafikkarte(String hersteller) {
        super("MSI Geforce GTX 1080", hersteller);
    }
}

class MSIMainboard extends Mainboard {
    public MSIMainboard(String hersteller) {
        super("MSI Z370 Gaming Pro Carbon", hersteller);
    }
}

class MSISSD extends SSD {
    public MSISSD(String hersteller) {
        super("MSI Optix AG32CQ", hersteller);
    }
}

class GigabyteGrafikkarte extends Grafikkarte {
    public GigabyteGrafikkarte(String Herstelle) {
        super("Gigabyte AORUS GeForce RTX 2080 Ti Xtreme Waterforce WB 11GB GDDR6", Herstelle);
    }
}

class GigabyteMainboard extends Mainboard {
    public GigabyteMainboard(String Herstelle) {
        super("Gigabyte X570 AORUS Master ATX AM4 Motherboard ", Herstelle);
    }
}

class GigabyteSSD extends SSD {
    public GigabyteSSD(String Herstelle) {
        super("AORUS RGB NVMe M.2 512GB Internal Gaming SSD ", Herstelle);
    }
}
