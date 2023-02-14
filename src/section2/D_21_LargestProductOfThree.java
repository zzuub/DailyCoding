package section2;

import java.util.Arrays;

public class D_21_LargestProductOfThree {
    public int largestProductOfThree(int[] arr) {
        Arrays.sort(arr);

        int arrLength = arr.length;

        int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
        int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];

        return Math.max(candidate1, candidate2);
    }
}
