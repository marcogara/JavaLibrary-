import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kap08W8 {

    public static void main(String[] args) {
        int [][] test = { {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        // for convenience I transform a 2d array in 1d array Stream.
        
        int[] array = Stream.of(test)        //we start with a stream of objects Stream<int[]>
                .flatMapToInt(IntStream::of) // I'll map each int[] to IntStream
                .toArray();                  //we're now IntStream, just collect the ints to array.
        System.out.println(Arrays.toString(array));
        System.out.println(checkIfContainDoubleEntry(array ,9));

    }
    public static boolean checkIfContainDoubleEntry (int [] x, int numElementsInX ) {
            Set<Integer> set = new HashSet<Integer>();
            for ( int i = 0; i < numElementsInX; ++i ) {
                if ( set.contains( x[i])) {
                    return true;
                }
                else {
                    set.add(x[i]);
                }
            }
            return false;
        }
    }

