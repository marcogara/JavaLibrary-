import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length: ");
        int length = scanner.nextInt();
        System.out.println("Insert length: ");
        int width = scanner.nextInt();
        scanner.close();

        int perimeter = (length + width )*2;
        int surface = length*width;

        System.out.println("Perimeter of rectangle is: "+perimeter);
        System.out.println("Surface of rectangle is: "+surface);

    }
}
