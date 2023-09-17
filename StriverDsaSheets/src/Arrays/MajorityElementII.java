package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
//        Output: [3]
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        // 3*(n/3) = n it is possible that only 3 elements can occir exactly n/3 times in the array
        // if any element is appearing more than n/3 times atmost 2 elements can be the maximun element...
        int cnt1 = 0, cnt2 = 0, ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {//make sure that ele2 != nums[i]else
                // may increment count of one ele even after having the same value in ele 2
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && ele1 != nums[i]) {//make sure that ele1 != nums[i] else
                cnt2 = 1;//may increment count of one ele even after having the same value in ele 1
                ele2 = nums[i];
            } else if (ele1 == nums[i]) cnt1++;
            else if (ele2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }//at this point both ele 1 and ele 2 will hold the values thats probably our ans
        // just run a for loop to cross verify if the two else occur more that floor(n/3)times
        List<Integer> result = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ele1 == nums[i]) cnt1++;
            if (ele2 == nums[i]) cnt2++;
        }
        int expected_times = (int) (nums.length / 3);
        //as wkt only 2 elements can occur more than n/3 times at max
        if (cnt1 > expected_times) result.add(ele1);
        if (cnt2 > expected_times) result.add(ele2);
        return result;
        //O(N) and O(1) Time and Space complexity it takes and is the best solution
    }
}
