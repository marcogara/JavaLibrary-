import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // TeilnehmerDatenbank db = new TeilnehmerDatenbank();

        // db.selectTeilnehmer().forEach(teilnehmer -> System.out.println(teilnehmer.getId()));

        ArrayList<Teilnehmer<Integer,String>> teilnehmer =TeilnehmerDatenbank.selectTeilnehmer();

        for (Teilnehmer tn : teilnehmer ) {

            System.out.println( tn.getId());
            System.out.println(tn.getName());

        }


        Pair pair = new Pair();

        pair.of(21,"test");

        // pair.toString();

        System.out.println(pair.toString());

        }
    }
