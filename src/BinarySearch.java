import java.util.Arrays;

public class BinarySearch {

    public static int BinarySearch(int n, int[] array) {
        System.out.println("Array:");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + ",");
        }
        System.out.println("");

        // find midpoint
        int midpoint = (int) Math.floor(array.length / 2);
        int midpointVal = array[midpoint];
        System.out.println("Midpoint: " + midpoint);
        System.out.println("Midpoint Value: " + midpointVal);

        // base cases
        if (midpointVal == n) {
            return midpointVal;
        }
        if (array.length == 0) {
            return -1;
        }
        if (array.length == 1 && midpointVal != n) {
            return -1;
        }

        // binary search
        if (n > midpointVal) {
            return BinarySearch(n, Arrays.copyOfRange(array, midpoint+1, array.length));
        } else if (n < midpointVal) {
            return BinarySearch(n, Arrays.copyOfRange(array, 0, midpoint));
        } else {
            return -1;
        }
    }

}
