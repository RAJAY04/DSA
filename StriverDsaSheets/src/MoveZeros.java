import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
       int[] nums = {0,1,0,3,12};
//        Output: [1,3,12,0,0]
        moveZeroes(nums);
    }
    //The idea is that we go through the array and gather all zeros on our road.
    //Let's take our example:
    //the first step - we meet 0.
    //Okay, just remember that now the size of our snowball is 1. Go further.
    //Next step - we encounter 1. Swap the most left 0 of our snowball with element 1.
    //Next step - we encounter 0 again!
    //Our ball gets bigger, now its size = 2.
    //Next step - 3. Swap again with the most left zero.
    //Looks like our zeros roll all the time
    //Next step - 12. Swap again:
    //We reached finish! Congratulations!
    public static void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {
                nums[i - snowBallSize] = nums[i];
                nums[i] = 0;
            }
        }
    }


    //// Shift non-zero values as far forward as possible
    //// Fill remaining space with zeros
    //
    //public void moveZeroes(int[] nums) {
    //    if (nums == null || nums.length == 0) return;
    //
    //    int insertPos = 0;
    //    for (int num: nums) {
    //        if (num != 0) nums[insertPos++] = num;
    //    }
    //
    //    while (insertPos < nums.length) {
    //        nums[insertPos++] = 0;
    //    }
    //}


    //this is a brute force method similar to bubble sort and my own solution
//    public static void moveZeroes(int[] nums) {
//        for (int i = nums.length-2; i >=0 ; i--) {
//            for (int j = i; j < nums.length-1 ; j++) {
//                if(nums[j] == 0){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }
}
