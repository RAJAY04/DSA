public class SplitArrLargestSum {
    public static void main(String[] args) {
       int[] nums = {1,4,4};
       int k = 3;
       // Output: 18
//        Explanation: There are four ways to split nums into two subarrays.
//        The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
        System.out.println(splitArray(nums,k));
    }
    public static int splitArray(int[] nums, int k) {
        //The answer to any test case will always lie between the max value element of the given
        // array (lower boundary of binary search) and sum of all array elements (upper boundary
        // of binary search) inclusive of the boundaries. This is because:
        //
        //After splitting, there will be at least one subarray which will be containing the max
        // element of the array. This subarray
        // could either just contain the max element or have more elements alongside the max element.
        //The answer can never go beyond the total sum of all the array elements.**
        int high = nums[0] , low = nums[0];
        for (int i = 1; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while(low <= high){
            int mid = low + ( high - low)/2;
            if(CountK(nums,k,mid) > k){
                //if partition we made is more than k , it means that we need to increase the value
                //of mid in order to store more elements in order to reduce the partition
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }return low;
    }

    private static int CountK(int[] nums, int k, int max_sum) {
        int subarray_sum = 0 , partition = 1;
        //remember to start the partition from 1
        for (int i = 0; i < nums.length; i++) {
            if( subarray_sum + nums[i] > max_sum){
                partition++;
                subarray_sum = nums[i];
            }else{
                subarray_sum += nums[i];
            }
            if(partition > k)return partition;//little optimisation
        }return partition;
    }
}
