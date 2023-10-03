import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr ={5,3,8,7,9,0,1,3};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        int mid = low + ( high - low )/2;
        if(low >= high)return;
        //mergesort the left half
        mergeSort(arr,low,mid);
        //mergesort the right half
        mergeSort(arr,mid+1,high);
        //merge both the arrays
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low , j = mid + 1 , k = 0;
        while(i <= mid && j <= high){
            temp[k++] = arr[i] >= arr[j] ? arr[j++] : arr[i++];
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[low + l] = temp[l];
        }
    }
}
