public class Song {
    private String sTitel;
    private int iDauerSekunde;
    private String sInterpreter;

    public Song(String sTitel, int iDauerSekunde, String sInterpreter) {
        this.sTitel = sTitel;
        this.iDauerSekunde = iDauerSekunde;
        this.sInterpreter = sInterpreter;
    }

    public String getsTitel() {
        return sTitel;
    }

    public void setsTitel(String sTitel) {
        this.sTitel = sTitel;
    }

    public int getiDauerSekunde() {
        return iDauerSekunde;
    }

    public void setiDauerSekunde(int iDauerSekunde) {
        this.iDauerSekunde = iDauerSekunde;
    }

    public String getsInterpreter() {
        return sInterpreter;
    }

    public void setsInterpreter(String sInterpreter) {
        this.sInterpreter = sInterpreter;
    }


    public void spielen() {
        System.out.printf("Titel: %s - Interpreter: %s - Dauer: %s %n", sTitel,sInterpreter,getiDauer());

    }

    private Object getiDauer() {
        return String.format("%02d:%02d",getiDauerSekunde() /60,getiDauerSekunde()%60 );

    }
}
