package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {        
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
//        Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        System.out.println(fourSum(nums,target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            if(i > 0 && nums[i] == nums[i-1])continue;
            for (int j = i + 1; j < n; j++) {
                if(j > i + 1 && nums[j] == nums[j-1])continue;
                int k = j + 1 , l = n -1;
                while( k < l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum > target){
                        l--;
                    }else if(sum < target){
                        k++;
                    }else{
                        List<Integer> temp = Arrays.asList(nums[i] , nums[j] , nums[k] , nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k -1])k++;
                        while(k < l && nums[l] == nums[l + 1])l--;
                    }
                }
            }
        }return ans;
    }
}
