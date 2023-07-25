import java.util.Arrays;

public class sortby_parity {
    public static void main(String[] args) {
        int [] nums = {3,1,2,4};
//        Output: [2,4,3,1]
//        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
        //sort such that all even come in the begening and odds in the end
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
        int [] nums1 = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums1)));
//        Output: [4,5,2,7]
//        Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
//        Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
//        Return any answer array that satisfies this condition.
//        Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
    }
    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                swap(nums,i,j++);
            }
        }
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            if(s%2==0 && nums[s]%2==0){
                s+=2;
            }else if (nums[e] % 2 != 0 && e % 2 != 0) {
                e -= 2;
            } else {
                swap(nums,s,e);
                e-=2;
                s+=2;
            }
        }
        return nums;
    }
    public static int[] sortArrayByParity(int[] nums) {
        int even = 0 ;
        int odd =  1 ;

        while(even < nums.length && odd < nums.length){

            if(nums[even]%2 != 0){
                swap(nums , even , odd);
                odd += 2 ;
            } else{
                even += 2 ;
            }
        }

        return nums ;
    }
}
    //int o = 0;
//    int O= nums.length-1;
//    int [] output = new int [nums.length];
//        for (int i = 0; i < nums.length; i++) {
//        if(nums[i]%2==0){
//        output[o++]=nums[i];
//        }else{
//        output[O--]=nums[i];
//        }
//        }return output;