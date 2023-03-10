package section3;

public class D_38_MergeSort {
    public int[] mergeSort(int[] arr) {
        sort(arr);
        return arr;
    }

    public int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public void sort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);

        int leftIdx = left;
        int rightIdx = mid + 1;
        int index = left;

        while(leftIdx <= mid && rightIdx <= right) {
            if(temp[leftIdx] <= temp[rightIdx]) {
                arr[index++] = temp[leftIdx++];
            } else {
                arr[index++] = temp[rightIdx++];
            }
        }

        for(int i=0; i<=mid-leftIdx; i++) {
            arr[index+i] = temp[leftIdx+i];
        }
    }
}
