import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }


    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }


    private static void merge(int[] arr, int low, int mid, int high) {
        // temp array to store sorted elements
        int[] temp = new int[high - low + 1];

        // indices for left, right and temp arrays
        int i = low, j = mid + 1, k = 0;

        // iterate over both halves until one half is exhausted
        while (i <= mid && j <= high) {
            // compare elements and add smaller to temp
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        // add remaining left half to temp
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // add remaining right half to temp
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (int p = 0; p < temp.length; p++) {
            arr[low + p] = temp[p];
        }

    }


}



