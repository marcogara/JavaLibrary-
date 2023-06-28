public class RundesLoch {
    private final double radius;

    public RundesLoch(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean pruefeObStoepselPasst(Adapter stoepsel) {
        return stoepsel.getRadius() <= radius;
    }
}
