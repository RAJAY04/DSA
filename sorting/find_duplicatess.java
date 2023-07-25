import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_duplicatess {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
//        Output: [2,3]
        System.out.println(findDuplicates(nums).toString());
    }
    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    public static List<Integer> findDuplicates(int[] nums) {
           List<Integer> ans = new ArrayList<>();
           int i = 0;
           while(i < nums.length){
               int correct_index = nums[i]-1;
               if(nums[i]!=nums[correct_index]){
                   swap(nums,i,correct_index);
               }else i++;
           }
        for (int j = 1; j <= nums.length; j++) {
            if(nums[j-1]!=j){
                ans.add(nums[j-1]);
            }
        }
        return ans;
    }
}
