import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if (e - s < 2) {
            return;
        }

        int m = s + (e - s) / 2;

        mergeSort(arr, s, m);//first part
        mergeSort(arr, m, e);//second part

        merge(arr, s, m, e);//merge two sorted parts
    }

    public static void merge(int[] arr, int s, int m, int e) {
        int[] temp = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {//merge
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < m) {//add remaining values of first array
            temp[k++] = arr[i++];
        }

        while (j < e) {//add remaining values of second array
            temp[k++] = arr[j++];
        }

        for (k = 0; k < temp.length; k++) {//copy and to original array
            arr[s + k] = temp[k];
        }
    }

//    static int[] mergeSort(int[] arr){
//        if(arr.length == 1) {
//            return arr;
//        }
//        int mid = arr.length / 2;
//        //here a new object array is created it nt doing it inplace hence its stored in left and right
//        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return merge(left,right);
//    }
//    public static int[] merge(int[] left , int[] right ){
//        int[] merged = new int[left.length + right.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i < left.length && j < right.length){
//            if(left[i] < right[j]){
//                merged[k] = left[i];
//            i++;
//            }else{
//                merged[k] = right[j];
//                j++;
//            }
//            k++;
//        }
//        //it may be possible that one of the array may not be over
//        //then copy the remaininig elements
//        //any 1 of the below 2 while loops will be executed
//        while( i < left.length){
//            merged[k] = left[i];
//            i++;
//            k++;
//        }
//        while( j < right.length){
//            merged[k] = right[j];
//            j++;
//            k++;
//        }
//        return merged;
//    }
}
