

    // illustrate how to call static method a class from a method in the same class

    public class CallingMethodInSameClass {

    public static void main(String[] args) {
        printOne();
        printTwo();
    }

        private static void printTwo() {
            printOne();
            printOne();
        }

        private static void printOne() {
            System.out.println("Hello World!");
        }

    }

