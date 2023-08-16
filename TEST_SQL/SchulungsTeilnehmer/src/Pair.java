import java.util.ArrayList;
import java.util.Objects;

public class Pair <A,B>
{
private A valueO;
private B value1;

    public A getValueO() {
        return valueO;
    }

    public void setValueO(A valueO) {
        this.valueO = valueO;
    }

    public B getValue1() {
        return value1;
    }

    public void setValue1(B value1) {
        this.value1 = value1;
    }

    public void of(A valueO, B value1)
    {
        this.valueO = valueO;
        this.value1 = value1;

    }

    public ArrayList<Pair> toArray()
    {

        ArrayList<Pair> array = null;
        for (Pair element  : array   )
        {
            element.getValueO();
            array.add(element);
            element.getValue1();
            array.add(element);
        }

        return array;
    }

 /*   @Override
    public String toString()
    {
        return String.valueOf(ValueO) + String.valueOf(getValue1());
    }
    */
}

/* Aufgabe 0 (Basics)
    Eine generische Klasse "Pair" mit zwei verschiedenen Typ-Parametern (A und B)
    Zwei private Attribute, um Werte abspeichern zu können (value0 von Typ a und value1 von Typ B)
    Getter- und Setter-Methoden
    Eine öffentliche, statische "of(A value0, B value1)"-Methode, welches ein Objekt von Pair erzeugt und den Attributen die Werte zuweist.
    Eine Methode "toArray()", welche value0 und value1 als Object Array zurückgibt
    Eine toString()-Methode, welche beide values als String zurückgibt.
 */


/*
package aufgaben;

        import java.util.Arrays;

class Pair<A,B>
{
    private A value0;
    private B value1;

    public A getValue0()
    {
        return value0;
    }

    public void setValue0(A value0)
    {
        this.value0 = value0;
    }

    public B getValue1()
    {
        return value1;
    }

    public void setValue1(B value1)
    {
        this.value1 = value1;
    }

    public Object[] toArray()
    {
        return new Object[] {value0, value1};
    }

    public static <A, B> Pair<A, B> of(A value0, B value1)
    {
        Pair<A, B> p = new Pair<A, B>();
        p.value0 = value0;
        p.value1 = value1;

        return p;
    }

    @Override
    public String toString()
    {
        return String.format("(%s, %s)", value0, value1);
    }
}

public class Lösung_0
{

    public static void main(String[] args)
    {
        Pair<Integer, String> pair = Pair.of(123, "ABC");
        System.out.println(pair);
        System.out.println(Arrays.toString(pair.toArray()));
    }
}
*/
