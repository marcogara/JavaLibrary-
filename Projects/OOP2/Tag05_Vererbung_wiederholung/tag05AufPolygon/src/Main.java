
public class Main {
    public static void main(String[] args) {

        Square square1 = new Square();
        Square square2 = new Square();

        square1.width=5;
        square2.width=8;

        System.out.println("square is larger than squar1 ? "+ square1.isLargerThan(square1));

        System.out.println(square1.getArea(4,2));

        Triangle triangle = new Triangle();

        System.out.println(triangle.getArea(4,2));

        Rectangle rectangle1 = new Rectangle();

        rectangle1.height =2;
        rectangle1.width=8;

        Rectangle rectangle2 = new Rectangle();

        rectangle2.height =2;
        rectangle2.width=7;

        System.out.println(  "rect1 is larger than rect2 ? " +     rectangle1.isLargerThan(rectangle2));

        }

}






