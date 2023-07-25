import java.util.Arrays;

public class maxProductOfTwoEle {
    public static void main(String[] args) {
        int [] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
//        Output: 12
//        Explanation: If you choose the indices i=1 and j=2 (indexed from 0),
//        you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0]-1;
        } else if (nums.length==0) {
            return 0;
        }else{
            return (nums[nums.length-2]-1)*(nums[nums.length-1]-1);
        }
    }
    }

