public class Roboter {
    public int iBatterieLaufzeit;
    public String sAufgabe;

    public Roboter(int iBatterieLaufzeit, String sAufgabe) {
        this.iBatterieLaufzeit = iBatterieLaufzeit;
        this.sAufgabe = sAufgabe;
    }

    public int getiBatterieLaufzeit() {
        return iBatterieLaufzeit;
    }

    public void setiBatterieLaufzeit(int iBatterieLaufzeit) {
        this.iBatterieLaufzeit = iBatterieLaufzeit;
    }

    public String getsAufgabe() {
        return sAufgabe;
    }

    public void setsAufgabe(String sAufgabe) {
        this.sAufgabe = sAufgabe;
    }

    public boolean istBatterieLaufzeitNiedrig()
    {
    return iBatterieLaufzeit < 2;
    }

    public void führeAufgabeAus()
    {
        if(!istBatterieLaufzeitNiedrig())
        {
            System.out.println(getsAufgabe());
            iBatterieLaufzeit--;
        }
        else
            System.out.println("Ich muss aufgeladen werden. ");

    }
}
