public class Kap08W9 {

        public static void main(String[] args) {
            System.out.println(fibonacci(50));
        }

        public static long fibonacci(long n) {

            if(n==0)
                return 0;
            else if (n==1)
                return 1;
            else
                // rekursiver Aufruf
                return (fibonacci(n-1))+(fibonacci(n-2));
        }
    }

