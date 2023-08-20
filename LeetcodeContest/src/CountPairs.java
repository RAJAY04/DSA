import java.util.List;

public class CountPairs {
    public static void main(String[] args) {
        int[] nums = {-6,2,5,-2,-7,-1,3};
        int target = -2;
//        Output: 3
        System.out.println(countPairs(nums,target));
    }
    public static int countPairs(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]< target){
                    count++;
                }
            }
        }return count;
    }
}
