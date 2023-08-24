import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr , int s , int e){
        if(e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        //here a new object array is not created hence we just call the function
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr, s , mid , e);
    }
    public static void mergeInPlace(int[] arr, int s , int m , int e ){
        int[] merged = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j < e){
            if(arr[i] < arr[j]){
                merged[k] = arr[i];
                i++;
            }else{
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array may not be over
        //then copy the remaininig elements
        //any 1 of the below 2 while loops will be executed
        while( i < m){
            merged[k] = arr[i];
            i++;
            k++;
        }
        while( j < e){
            merged[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < merged.length; l++) {
            arr[s + l] = arr[l];
        }
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        //here a new object array is created it nt doing it inplace hence its stored in left and right
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left , int[] right ){
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                merged[k] = left[i];
            i++;
            }else{
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array may not be over
        //then copy the remaininig elements
        //any 1 of the below 2 while loops will be executed
        while( i < left.length){
            merged[k] = left[i];
            i++;
            k++;
        }
        while( j < right.length){
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }
}
