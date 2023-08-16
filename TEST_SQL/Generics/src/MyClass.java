import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

// Zum Thema Generics: https://www.torsten-horn.de/techdocs/java-generics.htm

// Normale Klasse - nicht generisch
class MyClass
{
    // Generische Methode in Nicht-Generischer Klasse
    public <T> void genericMethod(T param1)
    {
        System.out.println("Ich bin eine generische Methode und mein Parameter hat jetzt den Typ " + param1.getClass());
    }
}

// Subklasse um die Schreibweise mit der Wildcard weiter unten ausprobieren zu können
class MySubClass extends MyClass
{}


// Generische Klasse
// Syntax: NameDerKlasse<TypVariable>
// Der Bezeichner der Typ-Variable folgt den Regeln der Variablenbezeichnung.
class MyGenericClass<Type>
{
    // Unsere bereits bekannte List ist auch eine generische Klasse/Interface.
    public List<Type> liste = new ArrayList<>();

    // Variable, die den zugewiesenen Typ annehmen wird.
    public Type myVariable;

    // Generisch und Nicht-Generisch können auch gemischt werden!
    public int myIntVariable;

    public MyGenericClass()
    {
        // Generische Typen sind immer Referenztypen, daher kann null zugewiesen werden.
        myVariable = null;
    }

    // Typ-Variable als Datentyp für Parameter
    public MyGenericClass(Type param)
    {
        myVariable = param;
        System.out.printf("MyVariable %s ist vom Typ %s\n", myVariable, myVariable.getClass().getName());
    }

    // Syntax: Modifier <TypVariable> RückgabeTyp Methodenbezeichner (Parameterliste)
    public <OtherType> void doSomething(Type param1, OtherType param2)
    {
        System.out.printf("param1 %s ist vom Typ %s\n", param1, param1.getClass().getName());
        System.out.printf("param2 %s ist vom Typ %s\n", param2, param2.getClass().getName());
    }

    public void doSomethingElse(List<? extends MyClass> liste)
    // Wildcards (das ?) können wir beim Erstellen von Variablen generischer Klassen verwenden, um Typ-Einschränkungen vorzunehmen.
    // Hier haben wir neben "extends" auch noch "super" als Auswahl.
    // "extends" erlaubt den angegebenen Typen und alle Subklassen, "super" erlaubt nur den angegebenen Typen und dessen Superklassen.
    {
        for (MyClass mc : liste)
            mc.genericMethod("42"); // hier kann der Typ der List-Elemente MyClass oder eine Subklasse davon sein, darum können wir die Methoden aus MyClass aufrufen.
    }
}


class MyUpperRestrictedGeneric<T extends Number> // extends Number: Einschränkung des Typs. Nun dürfen nur Number und Subklassen davon als Typ verwendet werden
{
    public <X extends Number & Comparable<T>> void myGenericMethod(X param1)
    // Die Einschränkung kann sich auf mehrere Typen beziehen, wobei davon höchstens eins eine Klasse sein darf (wir haben schließlich keine Mehrfachvererbung!)
    {

    }
}

// Generisches Interface mit einer Methode
interface IGenericInterface<T>
{
    void method(T param);
}

// Beispiel: Von ArrayList<> erben
// Wird von generischen Klassen geerbt, sollten die erbenden Klassen ebenfalls generisch sein, um den Typ-Parameter (der generische Typ) zur Verfügung zu stellen.
class MyList<T> extends ArrayList<T>
{
    public String text;

    public static void main(String[] args)
    {
        MyClass myclass = new MyClass();
        myclass.genericMethod(42);
        // Typen werden zur Compile-Zeit geprüft und ersetzt. Aus <T> wird <Integer>

        //List<double> liste = new ArrayList<double>(); // Primitive Typen nicht erlaubt!
        List<Double> liste = new ArrayList<Double>();
        liste.add(1.2);

        // Bei der Instanziierung von generischen Klassen kann der Datentyp beim Konstruktor weggelassen werden.
        // Das wird dann als "Diamond-Operator" bezeichnet.
        MyGenericClass<Integer> myGenericClassInt = new MyGenericClass<>(2);
        myGenericClassInt.myVariable = 42;
        myGenericClassInt.liste.add(1);
        myGenericClassInt.doSomething(123456789, "1234");

        // Ohne Wildcard liefert diese Zeile einen Fehler:
        myGenericClassInt.doSomethingElse(new ArrayList<MySubClass>());

        //MyUpperRestrictedGeneric<String> myUpperRestrictedGeneric = new MyUpperRestrictedGeneric<>(); // String ist hier nicht möglich, da T Number sein muss.
        MyUpperRestrictedGeneric<Integer> myUpperRestrictedGeneric = new MyUpperRestrictedGeneric<>(); // Integer erbt von Number, daher ist Integer hier möglich.

        // Instanziierung der eigenen Subklasse von ArrayList<>
        MyList<String> stringList = new MyList<>();
        stringList.text = "Meine tolle Liste";
        stringList.add("Hallo Welt");

        // Weitere Beispiele für generische Typen
        Consumer<Integer> consumer;

        HashMap<Integer, String> hashMap = new HashMap<>();
    }

}


