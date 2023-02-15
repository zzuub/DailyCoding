package section2;

public class D_22_BubbleSort {
    public int[] swap(int idx1, int idx2, int[] arr) {
        int arrLength = arr.length;

        for(int i = 0; i < arrLength; i++) {
            int swaps = 0;

            for(int j = 0; j < arrLength - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    swaps++;
                    arr = swap(j, j+1, arr);
                }
            }
            if(swaps == 0) {
                break;
            }
        }
        return arr;
    }
}
