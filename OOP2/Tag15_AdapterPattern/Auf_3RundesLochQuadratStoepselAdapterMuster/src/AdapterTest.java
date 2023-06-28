public class AdapterTest {


    public void testPruefeObStoepselPasst() {
        RundesLoch rundesLoch = new RundesLoch(5);
        QuadratischerStoepsel quadratischerStoepsel = new QuadratischerStoepsel(7);

        Adapter adapter = new Adapter(quadratischerStoepsel);

        // System.out.println(rundesLoch.pruefeObStoepselPasst(quadratischerStoepsel)); // Originaler quadratischer Stoepsel passt nicht ins runde Loch
        System.out.println(rundesLoch.pruefeObStoepselPasst(adapter)); // Der Adapter als Runder Stoepsel passt ins runde Loch
    }
}



