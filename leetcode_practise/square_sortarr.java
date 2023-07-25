import java.lang.reflect.Array;
import java.util.Arrays;

public class square_sortarr {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i]=nums[i]*nums[i];
        }Arrays.sort(nums);
        return nums;
    }
}
