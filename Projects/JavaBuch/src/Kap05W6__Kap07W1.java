public class Kap05W6__Kap07W1 {
    public static void main(String[] args) {

        double i;

        double j = 1.0;
        for (i = 2; i <= 30; i++) {
            double d = j/(i*i);
            System.out.format(j+"/"+i*i +"=" + "%.3f\n",d);
        }

    }
}
