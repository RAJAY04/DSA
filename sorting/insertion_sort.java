import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++){
        //only go till arr.length-2 because j will be out of bound
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                    //lhs will be already sorted in previous iterations
                }

            }

        }
    }
}
