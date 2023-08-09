import java.util.Arrays;

public class MinimiseMaxDiffOfPairs {
    //struggling to understand the qn check some other day
    public static void main(String[] args) {
        int [] nums = {10,1,2,7,1,3};
        int p = 2;
        //Output: 1
        //Explanation: The first pair is formed from the indices 1 and 4, and the second pair is formed from the indices 2 and 5.
        //The maximum difference is max(|nums[1] - nums[4]|, |nums[2] - nums[5]|) = max(0, 1) = 1. Therefore, we return 1.
        System.out.println(minimizeMax(nums,p));
    }
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length, left = 0 , right = nums[n-1] - nums[0];
        while(left < right){
            int mid = left + ( right - left )/2;
            int count = 0;
            for (int i = 1; i < n && count < p; i++) {
                if( nums[i] - nums[i - 1] <= mid){
                    count++;
                    i++;
                }//else you cant add break because you never know, num may be 9-8 which is less
            }
            if(can_form_pairs(nums,mid,p)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    //i have broken down into functions to make it easy
    public static boolean can_form_pairs(int[] nums, int mid , int p){
        int count = 0;
        for (int i = 1; i < nums.length && count < p; i++) {
            if( nums[i] - nums[i - 1] <= mid){
                count++;
                i++;
            }//else you cant add break because you never know, num may be 9-8 which is less
        }
        return count >= p;
    }
}

// public int minimizeMax(int[] nums, int p) {
//    Arrays.sort(nums);
//        int n = nums.length, left = 0 , right = nums[n-1] - nums[0];
//        while(left < right){
//            int mid = left + ( right - left )/2;
//            int count = 0;
//            for (int i = 1; i < n && count < p; i++) {
//                if( nums[i] - nums[i - 1] <= mid){
//                    count++;
//                    i++;
//                }//else you cant add break because you never know, num may be 9-8 which is less
//            }
//            if(count >= p){
//                right = mid;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
