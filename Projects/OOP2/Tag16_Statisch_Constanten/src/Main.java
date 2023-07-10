import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Hyundai");

        // Statische Member zur Klasse und werden dementsprechend über Klassennamen aufgerufen.
        System.out.println(Auto.KREISZAHL_PI);

        // In Java geht auch bad practice. Das bitte nicht machen, den statischen Member über das Objekt ansprechen.
        System.out.println(Auto.KREISZAHL_PI);

        Auto auto1 = new Auto("Honda");
        Auto auto2 = new Auto("Mercedes");

        double a = Math.random();

        System.out.println(a);

        for (Auto element : Auto.alleInstanziiertenAutos) {
            System.out.println(element.getAutoMarke());
        }

        System.out.println("Anzahl aller produzierten Autos: " + Auto.anzahlProduzierterAutos);
    }
}

// Static:
// Statische Member sind überall sichtbar und überall aufrufbar und statische member sind aber da (im Speicher)
// Statische Member sind nicht speicherschonend.
// Statisch ist keine OOP, da diese Member nicht an einem Objekt gebunden sind, sondern zur Klasse gehören.
class Auto {
    // Beispiel, wie manche Entwickler z.B. einsetzen. z.B. um alle instanziierten Objekte dieser Klasse zu sammeln.
    // Wird eine Collection mit static und final qualifiziert, dann bedeutet das nur, dass die Referenz auf die Liste
    // unveränderlich ist. Das bedeutet die Referenz zeigt immer auf diesselbe Liste.

    // Konstanten in Java:
    // Konstanten: unveränderbare Daten. Diese werden gerne als statische Attribute in einer Klasse eingetragen.
    // Konstante Pi: der Wert ist unveränderlich. Eine Naturkonstante:
    // Wie gehen nun Entwickler mit Konstanten um im Quellcode?
    // - Manche haben mit statischen Membern weniger Probleme. Die sehen das sehr pragmatisch und tragen diese einfach in die Klasse ein, wenn Sie sie brauchen.
    // - Manche Entwickler bilden eine Klasse, wo alle Konstanten gesammelt werden. Gilt allgemein aber als Bad Practice:
    // Solche Sammelklassen haben die Tendenz zugemüllt zu werden und zu wachsen. Sind kaum wartbar.
    // - Noch schlimmer: Statt eine Klasse, ein Interface mißbrauchen um die statischen Member zu sammeln.
    // Enums sind dafür da Konstanten aufzunehmen. Das ist sicherlich die beste Lösung. Enums sind eine Sammlung von Konstanten.
    // Konstanten in Java werden mit dem Keyword static und final qualifiziert.
    // JAVA KONVENTION: Die Bezeichner aller Konstanten werden als Screaming Snake Case geschrieben. D.h. jeder Buchstabe
    // groß und jedes neue Wort mit Unterstrich:
    public static final double KREISZAHL_PI = 3.1415;
    static final ArrayList<Auto> alleInstanziiertenAutos = new ArrayList<>();
    // Eine statische Variable die festhält wieviele Autos jemals produziert wurden. Dies wäre ein Grund für ein
    // statisches Feld:
    static int anzahlProduzierterAutos = 0;
    private final String automarke;

    Auto(String automarke) {
        this.automarke = automarke;
        Auto.anzahlProduzierterAutos++;
        Auto.alleInstanziiertenAutos.add(this);

        // final keyword bei Listen, heißt die Referenz zeigt immer auf dasselbe ListObjekt:
        // Eine Neuzuweisung der Referenz wird durch das final keyword verhindert. Folgende Anweisung ist also nicht möglich:
        // alleInstanziiertenAutos = new ArrayList<>();

    }

    public String getAutoMarke() {
        return this.automarke;
    }
}


// Was könnten Gründe für statische Member einer POJO Klasse sein?
// Wir können Attribute statisch machen, wenn dieses Attribut unveränderlich sein soll und für ALLE Autos gelten soll.
// Beispiel: PS-Anzahl zu Kw umzurechnen. (Ein PS ist 0,75 kw).
// Z.B eine Variable, die mitzählt wieviele Autos aus dieser Klasse instanziiert wurden: