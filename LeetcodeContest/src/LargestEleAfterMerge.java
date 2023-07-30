public class LargestEleAfterMerge {
    public static void main(String[] args) {
        int[] nums = {2,3,7,9,3};
        System.out.println(maxArrayValue(nums));
//        Output: 21
//        Explanation: We can apply the following operations on the array:
//        - Choose i = 0. The resulting array will be nums = [5,7,9,3].
//        - Choose i = 1. The resulting array will be nums = [5,16,3].
//        - Choose i = 0. The resulting array will be nums = [21,3].
//        The largest element in the final array is 21. It can be shown that we cannot obtain a larger element.
        //Input: nums = [5,3,3]
        //Output: 11
        //Explanation: We can do the following operations on the array:
        //- Choose i = 1. The resulting array will be nums = [5,6].
        //- Choose i = 0. The resulting array will be nums = [11].
        //There is only one element in the final array, which is 11.
        // 
    }

    public static long maxArrayValue(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] ans = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                ans[i] = nums[i] + nums[i + 1];
            }
        }

        return ans[1];
    }
}
