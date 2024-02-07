import java.util.Arrays;

public class BinarySearch {

    public static String BinarySearch(int n, int[] array) {
        // Binary Search [Recursion]
        // start timer
        long start = System.currentTimeMillis();

        // find midpoint
        int midpoint = (int) Math.floor(array.length / 2);
        int midpointVal = array[midpoint];

        // base cases
        if (midpointVal == n) {
            String text = "Found: " + midpointVal;

            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            System.out.println("Elapsed: " +  elapsed + " milliseconds.");

            return text;
        }
        if (array.length == 0) {
            String text = n + " was not found.";

            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            System.out.println("Elapsed: " +  elapsed + " milliseconds.");

            return text;
        }
        if (array.length == 1 && midpointVal != n) {
            String text = n + " was not found.";

            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            System.out.println("Elapsed: " +  elapsed + " milliseconds.");

            return text;
        }

        // binary search
        if (n > midpointVal) {
            return BinarySearch(n, Arrays.copyOfRange(array, midpoint+1, array.length));
        } else if (n < midpointVal) {
            return BinarySearch(n, Arrays.copyOfRange(array, 0, midpoint));
        } else {
            String text = n + " was not found.";

            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            System.out.println("Elapsed: " +  elapsed + " milliseconds.");

            return text;
        }
        //-----------------------------------

        //Binary Search [Iterative]

        //-----------------------------------
    }

}
