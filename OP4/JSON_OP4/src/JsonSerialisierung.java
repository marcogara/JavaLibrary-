import java.util.List;

// Ein JSON Tutorial
// <u><link=https://www.w3schools.com/js/js_json_intro.asp>https://www.w3schools.com/js/js_json_intro.asp</link></u>
// Ein Online Editor zum Erstellen und Bearbeiten von JSON-Dokumenten
// <u><link=https://jsoneditoronline.org/#right=local.soximu&left=local.yasiwa>https://jsoneditoronline.org/#right=local.soximu&left=local.yasiwa</link></u>

/*
 * JSON (JavaScript Object Notation) ist ein einfaches Datenaustauschformat, das häufig in Web-Anwendungen verwendet wird.
 * Es ist sowohl leicht zu lesen/schreiben als auch sprachunabhängig.
 * Ein JSON-Wert kann ein anderes JSON-Objekt, ein Array, eine Zahl, eine Zeichenfolge,
 * ein boolescher Wert (true/false) oder null sein.
 *
 * Die Arbeit mit JSON-Daten in Java kann einfach sein, aber – wie fast alles
 * in Java – gibt es viele Optionen und Bibliotheken, aus denen wir wählen
 * können.
 */

// Jackson ist eine Mehrzweck-Java-Bibliothek zur Verarbeitung von JSON-Daten.

// Maven-Abhängigkeit
//<dependency>
//<groupId>com.fasterxml.jackson.core</groupId>
//<artifactId>jackson-databind</artifactId>
//<version>2.13.3</version>
//</dependency>
// Oder Download hier: <u><link=https://github.com/FasterXML/jackson-core/wiki>https://github.com/FasterXML/jackson-core/wiki</link></u>
// Oder hier: <u><link=https://repo1.maven.org/maven2/com/fasterxml/jackson/core/>https://repo1.maven.org/maven2/com/fasterxml/jackson/core/</link></u>

// Importieren von Bibliotheken, z.B. den MySQL Connector:
// <u><link=https://www.jetbrains.com/help/idea/library.html>https://www.jetbrains.com/help/idea/library.html</link></u>

// fasterxml.jackson.databind importieren!

public class JsonSerialisierung {

    public static void main(String[] args) {



    }


    private static void javaObjectToJavaScriptObjet(User user,String pfad) {

    }
}












class User {

    //Fields
    private String name;
    private int age;
    private List<String> messages;

    //Konstruktor
    public User(String name, int age, List<String> messages) {
        this.name = name;
        this.age = age;
        this.messages = messages;
    }

    // Für die de-serialisierung wird der Standard-Konstruktor benötigt
    public User(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", messages=" + messages +
                '}';
    }
}
