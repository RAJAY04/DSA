import java.util.Arrays;

public class KthLargestEle {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
//        Output: 5
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {//come back to solve this problem after finishing
        Arrays.sort(nums);//quicksort and then quick select method and also after completing heap ds
        return nums[nums.length - k];
    }
}
