import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,5};
//        Output: [3,5]
//        Explanation:  [5, 3] is also a valid answer.
        System.out.println(singleNumber(nums));
    }
    public static int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        int ans = 0;
        for(int i = 0 ; i < nums.length;i++){
          ans ^=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        int o = 0;
        for( int i : nums){
            if(i !=0 ){
                arr[o++] = i;
            }
        }return arr;
    }
}
