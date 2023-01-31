package section2;

import java.util.Arrays;

public class D_12_ReverseArr {
    public int[] reverseArr(int[] arr){
        if(arr.length == 0) {
            return new int[]{};
        }

        int[] start = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] end = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] dest = new int[start.length + end.length];

        System.arraycopy(start, 0, dest, 0, start.length);
        System.arraycopy(end, 0, dest, start.length, end.length);

        return dest;
    }
}
