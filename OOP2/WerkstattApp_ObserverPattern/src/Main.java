/*
This code is meant for educational purposes not for production use, it may contain Bugs and errors.
Feel free to modify use it for personal learning or teaching.
Not intended for distribution as a commercial product.
Thanks.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Fahrzeug alfa = new Fahrzeug("B-NG-3452");

        // Use of toString Method
        System.out.println(alfa);

        Kunde k1 = new Kunde("Albert",234,"+1503214432543");

        // Use of toString Method to Kunde class
        System.out.println(k1);

        System.out.println();

        Werkstatt werkstatt = new Werkstatt();

        werkstatt.addAuftrag(alfa,k1);

        // This method return all Contracts from the Werkstatt and there is not formatting atm
        System.out.println(werkstatt.getAuftraege());

        alfa.addObserver(k1);
        alfa.addObserver(werkstatt);

        System.out.println("Gleich ist das Alfa fertig ! ");

        alfa.setBearbeitet(true);

        alfa.notifyObserversAutoIstBereit();

    }

}