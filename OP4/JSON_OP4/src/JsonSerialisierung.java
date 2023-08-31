import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
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

        List<String> messages = new ArrayList<>();
        messages.add("Erste Nachricht");
        messages.add("zweite Nachricht");
        User user = new User("Ein User", 24,messages);

        javaObjectToJavaScriptObjet(user, "resources/user.json");


        javaScripObjectToJavaObject("resources/user.json");

    }

    // Doku für ObjectMapper: <u><link=https://fasterxml.github.io/jackson-databind/javadoc/2.7/com/fasterxml/jackson/databind/ObjectMapper.html>https://fasterxml.github.io/jackson-databind/javadoc/2.7/com/fasterxml/jackson/databind/ObjectMapper.html</link></u>
    /*
     * Die einfache writeValue-Methode des ObjectMapper ist ein guter Einstiegspunkt.
     * Wir können es verwenden, um ein Java-Objekt in JSON zu parsen oder zu serialisieren.
     *
     * Zum Lesen können wir die readValue-Methode verwenden,
     * um jedes JSON in ein Java Objekt zu de-serialisieren.
     */
    private static void javaObjectToJavaScriptObjet(User user,String pfad) {

        ObjectMapper mapper = new ObjectMapper();

        try{
            // Der Mapper verwendet "Reflection", um aus einem angegebenen Objekt alle Attribute zu finden,
            // damit diese als JSON geschrieben werden können.
            // Über Reflection: <u><link=https://www.baeldung.com/java-reflection>https://www.baeldung.com/java-reflection</link></u>

            // Beispiel für Reflection:
            Method[] methods = user.getClass().getMethods();  // not needed for the working of the method
            System.out.println(methods[0].invoke(user));    // not needed for the working of the method
            System.out.println(Arrays.toString(methods));   // not needed for the working of the method

            //WriteValue-Methode als direkter Aufruf alles in eine Zeile
            //mapper.writeValue(Pfad newFile, user);

            //Abhilfe schaffte PrettyPrinter
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(pfad),user);
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(json);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static User javaScripObjectToJavaObject(String pfad) {

        ObjectMapper mapper = new ObjectMapper();

        try{
            // JSON aus einer Datei auslesen und in Java Object umwandeln
            //Dazu muss der Datentyp des gewünscehten Objektes angegeben werden

            User user = mapper.readValue(new File(pfad),User.class);

                    String s = "{\n" +
                    " \"name\" : \"Ein anderer User\",\n" +
                    " \"age\" : 42, \n" +
                    " \"messages\" : [\"Dies ist eine Nachricht\", \"Und noch eine Nachricht\"]\n" +
                    "}";

                    User user2 = mapper.readValue(s,User.class);
            System.out.println(User.class);
            System.out.println("aus der Datei gelesen: "+ user);
            System.out.println("Aus der String gelesen : " + user2);
            return user;




        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }




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
