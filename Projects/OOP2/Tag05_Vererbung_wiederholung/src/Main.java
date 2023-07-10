import java.util.ArrayList;

public class Main
{
    public static void fuettereAlleTiere(ArrayList<Tier> tiere)
    {
        for(Tier t : tiere)
        {
            t.fressen("Futter");
            t.verdauen();
        }
    }

    public static void main(String[] args)
    {
        // Tier tier = new Tier();
        // tier.laufen();
        // tier.fressen("Trockenfutter");

        Katze katze = new Katze();
        // katze.fressen("Katzenfutter");
        // katze.laufen();

        Hund hund = new Hund();
        // hund.laufen();
        // hund.fressen("Hundefutter");
        // hund.bellen();

        // Beispiel für Polymorphie:
        //Tier tier1 = new Tier();
        Tier tier1 = new Katze();
        tier1 = new Hund();

        // katze.laufen();
        tier1 = new Katze();
        // tier1.laufen();

        tier1 = new Hund();
        // tier1.fressen("Gemüse");
        tier1 = null;

        // Jede Katze, jeder Hund ist ein Tier und passt daher in die Liste:
        ArrayList<Tier> tiere = new ArrayList<>();
        // tiere.add(new Tier());
        tiere.add(new Hund());
        tiere.add(new Katze());
        tiere.add(new Hund());
        tiere.add(new Katze());

//        for(Tier element: tiere)
//        {
//            element.fressen("Ding");
//            element.laufen();
//
//            if(element instanceof Katze)
//            {
//                ((Katze)element).schnurren();
//            }
//        }

//        // Das geht nicht, da jede Katze, jeder Hund ein Tier ist, aber nicht
//        // jedes Tier ist eine Katze zum Beispiel:
//        Katze meineKatze = new Tier();
        Main.fuettereAlleTiere(tiere);
        Tier tier = new Hund();
    }
}

 abstract class Tier
{
    public void fressen(String futter)
    {
        System.out.println("Ich fresse " + futter);
    }

    public void laufen()
    {
        System.out.println("Ich laufe...");
    }

    // abstrakte Methoden sind wie ein Vertrag, sie schreiben vor, dass jede abgeleitete Klasse diese Methode
    // mit dem exakten Namen, Rückgabetyp und den exakten Parametern implementiert werden muss. Alle Klassen die
    // von die Tier ableiten wollen sind vertraglich verpflichtet die Methode zu implementieren.
    public abstract void verdauen();
}

class Katze extends Tier
{
    public void schnurren()
    {
        System.out.println("Schnurrr, grrmmmml, schnurrr!");
    }

    @Override
    public void laufen()
    {
        System.out.println("Ich schleiche wie eine Katze.");
    }

    @Override
    public void verdauen()
    {
        System.out.println("Miau - ich verdaue katzenartig!");
    }

    @Override
    public void fressen(String futter)
    {
        System.out.println("Ich schnurre während des Fressens. Miau");
    }
}

class Hund extends Tier {
    public void bellen() {
        System.out.println("WUFF!!!");
    }

    @Override
    public void verdauen() {
        System.out.println("Wuff - ich verdaue hundeweise!");
    }
}