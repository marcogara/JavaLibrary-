import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStreams {

    public static void main(String[] args) {

        List<String> stringListe = new ArrayList<>();

        stringListe.add("ersten String");
        stringListe.add("zweite String");

        //mit einem Iterator auf die Element einer Liste zugegriffen. Dieser Dieser durchwandert
        // systematisch mit next () die Datenstruktur
        Iterator<String> it = stringListe.listIterator();

        while (it.hasNext())
        {
            System.out.println((String)it.next());
        }

        //Auch die foreach schleife nutzt den Iterator. Eine Ausgabe ist nur in der vorgegebenen
        // Reihenfolge möglich.
        // Die foreach-schleife arbeitet also die Datenstruktur sequentiell, also nach und nach
        // Es ist nicht möglich diesen Job auf mehrere Kerne der CPU zu verteilen // parallelisierung
        for (String tmp : stringListe)
            System.out.println(tmp);

        // stringListe.forEach(str -> System.out.println(str));
        // Stream-Interface seit java 8 IN Collection-Framework implementiert
        // Mit Java 8 ist zum java.util-Package die Stream API hinzugenommen
        //erlaubt den parallelen Zugriff
        //bring insgesamt neben. forEach() 40 Methode mit sich
        // ist funktionell - arbeitet viel mit Lamba ausdrücke

        List<Integer> integerList = new ArrayList<>();

        for(int i=0; i<=100;i++)
        {
            integerList.add(i);
        }

        // integerList.forEach(integer -> System.out.println(integer));

        integerList.forEach(s ->{if(s>10) System.out.println(s);});

        integerList.stream().filter(s -> s%7==0).forEach(System.out::println);

        // :: Referenz -> erspart Schreibearbeit bei Lambda-Ausdrücke
        // schaltet man .stream vor die forEach-Methode, erfolgt die Abarbeitung sequuentiell,
        // die Rehinfolge der Elemente wird eingehalten
        // .parallelStream() vor froEach sorgt für eine Paralellisierung der Abarbeitung, mehrere
        // Kernel der CPU können gemainsam den Job erledigen, allredings mit der Folge, dass die
        // Reihenfolge nicht mehr unbedingt gewahrt wird.

        System.out.println("#####################################################");

        integerList.parallelStream().forEach(s ->{if(s>10) System.out.println(s);});

        integerList.stream().filter(s ->{if(s%7==0) System.out.println(s);
            return false;
        });



























    }
}
