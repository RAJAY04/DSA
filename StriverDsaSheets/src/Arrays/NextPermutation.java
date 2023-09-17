package Arrays;

import java.util.Arrays;
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {0,1,2,5,3,3,0};
//        Output: [0,1,3,0,2,3,5]
//        Explanation: The next greater permutation of nums is [0,1,3,0,2,3,5].
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;//n- 2 because we are comparing i with i + 1
        // Find the first decreasing element from the end (pivot)
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }//i points to the pivot
        // Find the next greater element than the pivot
        if(i >= 0){
            int j = n - 1;
            while(j >= 0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums , i , j);// swap the pivot with the next greater element
        }
        reverse(nums , i + 1);// reverse the array from i + 1 to the end
//space complexity: O(1) , time complexity: O(n)
    }
    public static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums , int start){
        int i = start , j = nums.length - 1;
        while(i < j){// reverse the array from i to j
            swap(nums , i , j);
            i++;
            j--;
        }
    }
}
