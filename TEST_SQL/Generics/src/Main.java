
public class Main {
    public static void main(String[] args) {

        Generics generics = new Generics();

        generics.setStraße('d');
        generics.setPostleitzeit(18);

        // generics.setAdresse("m",34);

        generics.getStraßedatenTyp();
        generics.getPostdatenTyp();

        System.out.println(generics.getStraßedatenTyp());

        System.out.println(generics.getPostdatenTyp());

        System.out.println("EOF");

        }
    }
