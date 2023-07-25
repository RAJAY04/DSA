import java.util.Arrays;

public class Running_sum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
//        Output: [3,4,6,16,17]
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                ans[i] += nums[j];
            }
        }return ans;
    }
}
