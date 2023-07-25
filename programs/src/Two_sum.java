import java.util.Arrays;

//Q.Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class Two_sum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] arr2 = new int[1];
        arr2=Two_sum(nums,target);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] Two_sum(int[] arr,int target) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( target == arr[i] + arr[j] ) {
                    arr1 = new int[]{i,j};
                    return arr1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
