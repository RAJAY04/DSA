import java.util.Arrays;

public class RearrangeArrayElements {
    public static void main(String[] args) {
       int[] nums = {3,1,-2,-5,2,-4};
//        Output: [3,-2,1,-5,2,-4]
//        Explanation:
//        The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
//        The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
//        Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0 , k = 1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                ans[j] = nums[i];
                j += 2;
            }else{
                ans[k] = nums[i];
                k += 2;
            }
        }
    return ans;
    }
}
