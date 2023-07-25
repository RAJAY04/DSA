import java.util.Arrays;

public class missing_number {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    private static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=i){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }


}



//    private static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int sum = 0;
//        for (int i :nums) {
//           sum+=i;
//        }return (n*(n+1)/2)-sum;
//   }