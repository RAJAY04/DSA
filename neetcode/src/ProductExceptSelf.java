import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        //Output: [24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf1(nums)));


    }
    public int[] productExceptSelf2(int[] nums) {// best approach with tc and sc as O(N) & O(1)
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {//First Pass: Left-to-Right Accumulation of product
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {//Second Pass: Right-to-Left Accumulation
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }

    public static int[] productExceptSelf1(int[] nums) {//ans accepted but we didnt follow the rule
        int[] arr = new int[nums.length];//that we cant use / operator
        int pro = 1;
        int pro_without_zero = 1;
        int zero_count = 0;
        for (int i = 0; i <nums.length; i++) {
            pro *= nums[i];
            if(nums[i] == 0){
                zero_count++;
            }else{
                pro_without_zero *= nums[i];
            }
        }
        if (zero_count > 1) {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = 0;
            }
        }else if (zero_count == 1) {
            for (int i = 0; i < nums.length; i++) {
               if( nums[i] != 0){
                   arr[i] = pro;
               }else{
                   arr[i] = pro_without_zero;
               }
            }
        }else{
            for (int i = 0; i < nums.length; i++) {
                arr[i] = pro/nums[i];
            }
        }
        return arr;
    }
    public static int[] productExceptSelf(int[] nums) {//tle error
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j){
                    continue;
                }
                else{
                    arr[i] *= nums[j];
                }
            }
        }return arr;
    }
}
