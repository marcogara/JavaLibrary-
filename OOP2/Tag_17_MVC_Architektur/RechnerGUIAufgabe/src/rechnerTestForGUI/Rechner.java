package rechnerTestForGUI;


public class Rechner {
    private final RechnerGUI rechnerGUI;
    private int zahl1;
    private int zahl2;
    private RechnenOperationen rechnenOperationen;

    public Rechner(RechnerGUI rechnerGUI) {
        this.rechnerGUI = rechnerGUI;
    }

    public void setOperation(Operation operation) {
        switch (operation) {
            case ADDITION:
                rechnenOperationen = new Addition();
                break;
            case SUBTRACTION:
                rechnenOperationen = new Subtraktion();
                break;
            case MULTIPLICATION:
                rechnenOperationen = new Multiplikation();
                break;
            case DIVISION:
                rechnenOperationen = new Division();
                break;
        }
    }

    public void setZahl1(int zahl1) {
        this.zahl1 = zahl1;
    }

    public void setZahl2(int zahl2) {
        this.zahl2 = zahl2;
    }

    public double calculate() {
        return rechnenOperationen.berechnen2Zahlen(zahl1, zahl2);
    }

    public enum Operation {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION
    }

    public interface RechnenOperationen {
        double berechnen2Zahlen(int zahl1, int zahl2);
    }

    public static class Addition implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 + zahl2;
        }
    }

    public static class Subtraktion implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 - zahl2;
        }
    }

    public static class Multiplikation implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 * zahl2;
        }
    }

    public static class Division implements RechnenOperationen {
        @Override
        public double berechnen2Zahlen(int zahl1, int zahl2) {
            return zahl1 / (double) zahl2;
        }
    }
}






















