package section3;

public class D_37_RadixSort {
    public int[] radixSort(int[] arr) {
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]){
                maxValue = arr[i];
            }
        }

        for (int digit = 1; digit <= maxValue; digit *= 10) {
            arr = countingSort(arr, digit);
        }
        return arr;
    }

    public int[] countingSort(int[] arr, int digit) {
        int[] temp = new int[arr.length];
        int[] counting = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int num = (arr[i] / digit) % 10;
            counting[num]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int num = (arr[i] / digit) % 10;
            counting[num]--;
            temp[counting[num]] = arr[i];
        }

        return temp;
    }
}
