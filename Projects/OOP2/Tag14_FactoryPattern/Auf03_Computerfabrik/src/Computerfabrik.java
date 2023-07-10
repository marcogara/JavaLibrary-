abstract class Computerfabrik {
    public abstract Computerteil erstelleComputerTeil(String art);
}

class MSIFabrik extends Computerfabrik {
    @Override
    public Computerteil erstelleComputerTeil(String art) {
        switch (art) {
            case "Grafikkarte":
                return new MSIGrafikkarte("MSI");
            case "Mainboard":
                MSIMainboard msiMainboard = new MSIMainboard("MSI");
                return msiMainboard;
            case "SSD":
                return new MSISSD("MSI");
            default:
                return null;
        }
    }
}

class GigabyteFabrik extends Computerfabrik {
    @Override
    public Computerteil erstelleComputerTeil(String art) {
        switch (art) {
            case "Grafikkarte":
                return new GigabyteGrafikkarte("Gigabyte");
            case "Mainboard":
                return new GigabyteMainboard("Gigabyte");
            case "SSD":
                return new GigabyteSSD("Gigabyte");
            default:
                return null;
        }
    }
}

