
import java.util.Arrays;

public class Contains_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(arr));
    }

    //    public static boolean containsDuplicate(int[] nums) {
//        boolean dup_count= true;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//           if(nums[i]==nums[j]){
//               return dup_count;
//           }
//                }
//            }return false;
//    this is not the optimal solution and leetcode wont accept it
//        }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
