package section3;

public class D_36_InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int target = index;

            while (target > 0 && arr[target - 1] > arr[target]) {
                int temp = arr[target - 1];

                arr[target - 1] = arr[target];
                arr[target] = temp;

                target--;
            }
        }
        return arr;
    }
}
