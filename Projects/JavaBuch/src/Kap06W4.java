public class Kap06W4 {

    // pag.118

    public static void main(String[] args) {

         long [][] array = new long[10][10];

        for (long x = 0; x < array.length; x++) {

            for (long y = 0; y < array[0].length; y++) {

                long z = (x + 1) * (y + 1);
                array[Math.toIntExact(x)][Math.toIntExact(y)] = z;
            }
        }

                for (long i = 0; i < array.length; i++) {

                    for (long j = 0; j < array.length; j++) {

                        System.out.print(array[Math.toIntExact(i)][Math.toIntExact(j)] + " ");
                    }
                    System.out.println();

                }
            }
        }







