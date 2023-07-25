import java.util.Arrays;

public class sort_colors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
//        Output: [0,0,1,1,2,2]
          sortColors(nums);
    }
    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    public static int get_max_ele_index(int arr[], int e){
        int max = 0;
        for (int i = 0; i <=e ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }return max;
    }

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int max = get_max_ele_index(nums,last);
            swap(nums,max,last);
        }
        System.out.println(Arrays.toString(nums));
    }
}
