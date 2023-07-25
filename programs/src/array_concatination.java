import java.util.Arrays;

public class array_concatination {
    public static void main(String[] args) {
      int[] nums = {1,2,1};
        System.out.println(Arrays.toString(concatinate(nums)));
    }
    static int[] concatinate( int[] nums){
        int n = nums.length;
        int[] sum = new int[2*n];
        for (int i = 0; i < n; i++) {
            sum[i]= nums[i];
        }
        for (int i = 0; i < n; i++) {
            sum[i+n]=nums[i];
        }return sum;

    }
}
