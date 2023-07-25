
import java.util.Arrays;
public class two_sumbs {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }


//    simple approach , we use binary search in unique way , we initialise start
//            and end as usual but we keep on decreasing the start and end
//    pointers here,rather than changing the mid ,hence no elements are skipped
    public static int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        while (s <= e) {
            if (numbers[s] + numbers[e] > target) {
                e--;
            } else if (numbers[s] + numbers[e] < target) {
                s ++;
            } if(numbers[s] + numbers[e]==target){
                return new int[]{s+1,e+1};
            }

        }return new int[]{-1, -1};
    }
}
