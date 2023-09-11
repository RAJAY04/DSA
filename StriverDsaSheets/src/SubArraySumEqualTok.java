import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualTok {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
//        Output: 2
        System.out.println(subarraySum(nums, k));
    }

    //when the array contains both +VE and _VE given below is the most optimal
    //solution , else if there was no _VE number then we could use 2 ptr and greedy
    //where we increase 1 pointer until sum <= k and if it increases k , we decrease
    //the sum by increasing the first pointer
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);//it handles the base case, where the prefix sum is 0.
        int pre_sum = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            pre_sum += nums[i];
            int remove = pre_sum - k;
            cnt += map.getOrDefault(remove, 0);
            //map.get() will return null if the key is not found. This can cause
            // NullPointerExceptions if we try to use the return value directly.
            //
            //map.getOrDefault() allows us to provide a default value to return if
            // the key is not found. This avoids having to handle null checks separately.
            map.put(pre_sum, map.getOrDefault(pre_sum, 0) + 1);


        }
        return cnt;
    }

    public static int subarraySum1(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }
        return count;
    }
}
