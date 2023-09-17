package Arrays;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] nums = {-1,-2};
        //Output: 6
        //Explanation: The subarray [4,-1,2,1] has the largest sum 6.
        System.out.println(maxSubArray(nums));
        System.out.println(Arrays.toString(maxSubArrayIndex(nums)));
    }


    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);

            if(sum<0) sum = 0;//consider empty subarray if the ans is -ve
        }

        return max;
    }


    public static int maxSubArray1(int[] nums) {//brute force Tc O(N^3) Sc O(1)
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += nums[k];
                    max = Math.max(sum,max);
                }
            }
        }return max;
    }

    public static int maxSubArray2(int[] nums) {//brute force better one Tc O(N^2) Sc O(1)
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(sum,max);
            }
        }return max;
    }

    //follow up questions find the index of start and end of max subarray
    //or return the subarrays itself
    public static int[] maxSubArrayIndex(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        int[] index = new int[2];
        int start = -1 , end = -1;
        for(int i=0 ; i<n ;i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            end++;

            if (sum < 0) {
                sum = 0;//consider empty subarray if the ans is -ve
                start = i;
                end = i;
            }
        }
        index[0] = start;
        index[1] = end;
        return index;
    }
}