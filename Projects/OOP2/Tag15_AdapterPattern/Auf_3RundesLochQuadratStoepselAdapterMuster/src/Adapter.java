public class Adapter extends RundesLoch {

    private final QuadratischerStoepsel quadratischerStoepsel;

    public Adapter(QuadratischerStoepsel stoepsel) {
        super(transformToRadius(stoepsel.getBreite()));
        this.quadratischerStoepsel = stoepsel;
    }

    private static double transformToRadius(double breite) {
        return Math.sqrt(2 * Math.pow(breite, 2)) / 2; // Umwandlung von Seitenlänge zu Radius des umschriebenen Kreises
    }

    public double getRadius() {
        return super.getRadius();
    }
}

