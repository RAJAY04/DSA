package Strings;
import java.util.Arrays;
///this is a very good problem
//couldnt understand the intuition behind this problem

public class FrequencyOfMostFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1,4,8,13};
        int k = 5;
//        Output: 2
        System.out.println(maxFrequency(nums,k));
    }
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0 , j = 0;
        long sum = 0;
        while(j < nums.length){
            sum += nums[j];
            if(((long) (j - i + 1) * nums[j]) - sum > k){
                sum -= nums[i++];
            }j++;
        }return j - i;
    }



    public int maxFrequency1(int[] nums, int k) {
        // sort the array
        Arrays.sort(nums);
        // We should maintain prefix sum array as long data type
        // because here we have more than integer range if we do 10^5*10^5==10^10
        long[] prefix_sum = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
            prefix_sum[i + 1] = prefix_sum[i] + nums[i];
        int i = 0;
        // Here we intially calculate equal elements
        while (i < nums.length && nums[i] == nums[0])
            i++;
        // Having result variable for max answer
        int result = i;
        while (i < nums.length) {
            int count = getCount(i, nums, prefix_sum, k), st = i;
            while (i < nums.length && nums[i] == nums[st])
                i++;
            // (i-st) is equal to number of equal elements
            result = Math.max(result, count + i - st);
        }
        return result;
    }
    private int getCount(int index, int nums[], long prefix_sum[], int k) {
        int lo = 0, hi = index - 1, count = -1;
        long num = (long) (nums[index]);
        // We should do binary search for log(n) time complexity
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (num * (long) (index - mid) - (prefix_sum[index] - prefix_sum[mid]) > k) {
                lo = mid + 1;
            } else {
                // Maintain largest possible count for every iteration in else loop
                count = index - mid;
                hi = mid - 1;
            }
        }
        // return max count
        return count;
    }

}
