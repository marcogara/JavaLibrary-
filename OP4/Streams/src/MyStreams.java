import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStreams {

    public static void main(String[] args) {

        List<String> stringListe = new ArrayList<>();

        stringListe.add("ersten String");
        stringListe.add("zweite String");

        // Ursprünglich wurde mit einem Iterator auf die Elemente einer Liste zugegriffen. Dieser durchwandert
        //systematisch mit next() die Datenstruktur von Anfang bis Ende

        Iterator<String> it = stringListe.listIterator();

        while (it.hasNext())
        {
            System.out.println((String)it.next());
        }

        //Auch die forEach-Schleife nutzt den Iterator. Eine Ausgabe ist nur in der vorgegebenen Reihenfolge möglich.
        //Die foreEach-Schleife arbeitet also die Datenstruktur sequentiell, also nach und nach, ab. Es ist nicht möglich,
        // diesen Job auf mehrere Kerne der CPU zu verteilen - ihn also zu parallelisieren
        for (String tmp : stringListe)
            System.out.println(tmp);

        //Stream-Interface seit Java8 im Collection-Framework implementiert
        //erlaubt den parallelen Zugriff
        //bringt insgesamt neben .forEach() 40 Methoden mit sich
        // ist funktionell - arbeitet viel mit Lamda ausdrücken
        List<Integer> integerList = new ArrayList<>();

        for(int i=0; i<=100;i++)
        {
            integerList.add(i);
        }

        // integerList.forEach(integer -> System.out.println(integer));

        integerList.forEach(s ->{if(s>10) System.out.println(s);});

        integerList.stream().filter(s -> s%7==0).forEach(System.out::println);

        //:: Referenz -> erspart Schreibarbeit bei Lamda-Ausdrücken
        //schaltet man .stream() vor die forEach()-Methode, erfolgt die Abarbeitung seqentiell - d.h. die
        // Reihenfolge der Elemente wird eingehalten
        //.parallelStream() vor for-Each sorgt für eine Paralellisierung der Abarbeitung, mehrere Kernel der CPU können
        // gemeinsam den Job erledigen, allerdings mit der Folge, dass die Reihenfolge nicht mehr unbedingt gewahrt wird.

        System.out.println("#####################################################");

        integerList.parallelStream().forEach(s ->{if(s>10) System.out.println(s);});

        integerList.stream().filter(s ->{if(s%7==0) System.out.println(s);
            return false;
        });





























    }
}
