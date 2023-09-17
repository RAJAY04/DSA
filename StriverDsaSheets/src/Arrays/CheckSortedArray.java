package Arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int [] nums = {3,5,2,4};
//        Output: true
//        Explanation: [1,2,3,4,5] is the original sorted array.
//                You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
        System.out.println(check(nums));


        //edge cases
        //if all the elements in the array are equal[1,1,1,1,1,1]
        //or [6,10,6] these two cases i got stuck
    }
    public static boolean check(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return true;
        }
        int irregular = 2;
        if (nums[0] < nums[nums.length - 1]) {
            irregular--;
        }
        int i = 0;
        while (true) {
            if (i + 1 < nums.length) {
                if (nums[i + 1] >= nums[i]) {
                    i++;
                } else {
                    irregular--;
                    i++;
                }
                if (irregular == 0) {
                    return false;
                }
            } else break;
        }
        return true;
    }


    //   public boolean check(int[] nums) {
    //        // here we compare all the neighbouring elemnts and check whether they are in somewhat sorted
    //        // there will be a small change due to rotation in the array at only one place.
    //        // so if there are irregularities more than once, return false
    //        // else return true;
    //        int irregularities = 0;
    //        int length = nums.length;
    //        for (int i=0; i<length; i++) {
    //            if (nums[i] > nums[(i + 1) % length])
    //                irregularities += 1;
    //        }
    //        return irregularities > 1 ? false : true;
    //    }
}

