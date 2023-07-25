import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
        int[] ans = rotate(nums,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
                ans[(i+k)%n]=nums[i];
            }
        return ans;
    }
}
