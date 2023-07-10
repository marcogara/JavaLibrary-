public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        RundesLoch rundesLoch = new RundesLoch(20.0);

        RunderStoepsel runderStoepsel = new RunderStoepsel(21);

        // rundesLoch.pruefeObStoepselPasst(runderStoepsel);

        // System.out.println(rundesLoch.pruefeObStoepselPasst(runderStoepsel));

        QuadratischerStoepsel quadratischerStoepsel = new QuadratischerStoepsel(4);

        Adapter quad = new Adapter(quadratischerStoepsel);


    }
}
