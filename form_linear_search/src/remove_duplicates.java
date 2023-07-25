import java.util.Arrays;

public class remove_duplicates {
    public static void main(String[] args) {
       int[] nums = {1,1,2};
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    private static int removeDuplicates(int[] nums) {
        int pval = Integer.MAX_VALUE;
        int index = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pval) {
                continue;
            } else {
                res[index]=nums[i];
                index++;
                pval = nums[i];
            }

        }
        System.out.println(Arrays.toString(res));
        return index;
    }
}
