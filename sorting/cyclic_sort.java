import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    private static void sort(int[] arr){
        int i =0;
        while( i < arr.length){
            int correct_index = arr[i]-1;
            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }else{
                i++;
            }
        }
    }
}
