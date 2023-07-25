public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
//        Output: 3
//        Explanation: The numbers in the range [1,2] are all in the array.
         System.out.println(firstMissingPositive(nums));
    }
    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    public static int firstMissingPositive(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                return j+1;
            }
        }return nums.length+1;
    }
}
