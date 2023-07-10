/*
Implementieren Sie int calculate (int x, y, z). Sofern x, y und z alle größer als
null sind, soll die Methode (x+y)/z zurückgegeben, andernfalls den Wert o.
 */

public class Kap08W3 {
    public static void main(String[] args) {

        int x = 3, y= 5, z=2, c;
        c = calculate(x,y,z);
        System.out.println(c);

    }
    public static int calculate(int p1, int p2, int p3) {
        System.out.println(p1 + " " + p2 + " " + p3);

        if (!(p1 == 0 || p2 == 0 || p3 == 0))
            return (p1 + p2)/ p3;

        return 0;
    }

    }

