
import java.util.Arrays;
public class QuickSort {

    // Main driver method
    public static void main(String[] args) {

        // Initialize unsorted array
        int[] arr = {5,4,3,2,1};

        // Print array before sorting
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // Call quickSort method to sort the array
        qs(arr,0,arr.length-1);

        // Print sorted array
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }

    // Quick sort method
    public static void qs(int[] arr, int low, int high){
        if(low >= high) {
            return; // Base case
        }
        //we can also just write if(low<high) instead of if(low>=high) and inside this
        // we can specify body of the function instead of specifying the base case seperately
            // Find pivot position
            int pivot = partition(arr,low,high);

            // Recursively sort left sublist
            qs(arr,low,pivot-1);

            // Recursively sort right sublist
            qs(arr,pivot+1,high);
    }

    // Partition method to find pivot position
    public static int partition(int[] arr, int low, int high){

        // Select last element as pivot
        int pivot = arr[high];

        // Indexes to partition array
        int i = low, j = high;

        // Partition loop
        while (i < j) {

            // Increment i while element is less than pivot
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            // Decrement j while element is more than pivot
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            // Swap elements if indexes haven't crossed
            if (i < j) {
                swap(arr,i,j);
            }
        }

        // Swap pivot to partition point
        swap(arr,low,j);

        // Return partition point index
        return j;
    }

    // Utility method to swap array elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}