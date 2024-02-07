import java.util.Arrays;

public class BinarySearch {
    public long recursiveTime;
    public long iterativeTime;

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

    public static String iterativeBinarySearch(int n, int[] array) {
        long startTime = System.currentTimeMillis();


        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (n < array[middle]) {
                end = middle - 1;
            }

            if (n > array[middle]) {
                start = middle + 1;
            }

            if (n == array[middle]) {
                String text = "Found: " + n;

                long finishTime = System.currentTimeMillis();
                long elapsed = finishTime - startTime;
                System.out.println("Elapsed: " +  elapsed + " milliseconds.");

                return text;
            }
        }
        String text = n + " was not found.";

        long finishTime = System.currentTimeMillis();
        long elapsed = finishTime - startTime;
        System.out.println("Elapsed: " +  elapsed + " milliseconds.");

        return text;
    }

}
