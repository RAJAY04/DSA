import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfValuesWithIndicesHavingKSetBits {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5,10,1,5,2);
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(arr,k));
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        int temp;
        int i = 0;
        int n = nums.size();
        while(i < n){
            int count = 0;
            temp = i;
            while(temp > 0){
                temp = temp & (temp - 1);
                count++;
            }
            if(count == k){
                sum += nums.get(i);
            }
            i++;
        }return sum;
    }
}
