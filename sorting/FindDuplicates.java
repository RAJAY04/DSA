import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
//        Output: 2
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }//until here we implemented cyclic sort algorithm
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }
        return nums.length + 1;
    }

}
