import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {8,2,4,6,-1,-5,0,-8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    private static int get_max_pos(int[] arr, int s, int e){
        int max_pos=s;
        for (int i = s; i <=e ; i++) {
            if(arr[i]>arr[max_pos]){
                max_pos=i;
            }
        }return max_pos;
    }
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap
           int last=arr.length-i-1;
           int max= get_max_pos(arr,0,last);
           swap(arr,max,last);
        }
    }
}

