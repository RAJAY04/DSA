import java.util.Arrays;

public class MinimumNumberOfOperationsToMakeArrayContineous {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6};
//        Output: 1
//        Explanation: One possible solution is to change the last element to 4.
//        The resulting array is [1,2,3,5,4], which is continuous.
        System.out.println(minOperations(nums));

    }

    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count = Integer.MAX_VALUE, j = 1, dup = 0;
        int[] dupArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] <= nums[i] + nums.length - 1) {
                if (nums[j] == nums[j - 1]) ++dup;
                dupArr[j] = dup;
                j++;
            }
            count = Math.min(count, i + (nums.length - j) + dup - dupArr[i]);
        }
        return count;
    }
    public static int minOperations1(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the input array in ascending order
        int m = 1;

        // Remove duplicate elements in the sorted array
        for (int i = 1; i < n; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[m++] = nums[i];
            }
        }

        int ans = n;

        // Use a sliding window to find the minimum number of operations
        for (int i = 0, j = 0; i < m; ++i) {
            while (j < m && nums[j] - nums[i] <= n - 1) {
                ++j;
            }
            ans = Math.min(ans, n - (j - i));
        }

        return ans;

    }


    }
