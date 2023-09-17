//import java.util.Arrays;
//
//public class RemoveDuplicatesFromSortedArray {
//    public static void main(String[] args) {
//       int[] nums = {1,2,2};
////        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
////        Explanation: Your function should return k = 5, with the first five elements of nums being
////        0, 1, 2, 3, and 4 respectively It does not matter what you leave beyond the returned k
////        (hence they are underscores).
//        System.out.println(removeDuplicates(nums));
//    }
//    public static int removeDuplicates1(int[] nums) {O(N) and O(1)
//        if(nums.length == 0){
//            return 0;
//        }
//        int i = 0;
//
//        for (int j = 0; j < nums.length; j++) {
//            if(nums[j] != nums[i]){
//                i++;
//                nums[i] = nums[j];
//            }
//        }return i+1;
//    }
//    public static int removeDuplicates(int[] nums) {
//        //this is my solution its the most optimal O(N) and O(1)
//        int i = 0 , j = 1;
//        while(j < nums.length){
//            if(nums[i] == nums[j]){
//                j++;
//            }else{
//                if(i+1 != j) {
//                    nums[i+1] = nums[j];
//                    i++;
//                    j++;
//                }else{
//                    i++;
//                    j++;
//                }
//            }
//        }
//        return i+1;
//    }
//}
