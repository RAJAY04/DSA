package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){//we will store the elements in the map
            int more_needed = target - nums[i];//we will check if the more_needed element is present in the map
            if(map.containsKey(more_needed)){//if present we will return the index of the more_needed element and the current element
                return new int[] {map.get(more_needed),i};
            }
            map.put(nums[i],i);//if not present we will store the current element and its index in the map
        }return new int[] {-1,-1};
    }//time complexity = O(n) and space complexity = O(n)
}
