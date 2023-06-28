// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Mit Adapter : " + NeueAPI.calculateSum(new int[]{2, 3, 4}));

        System.out.println(Adapter.calculateSum(new int[]{2, 9, 4}));

        System.out.println("Ohne Adapter : " + LegacyAPI.addNumbers(2, 4));

    }
}
