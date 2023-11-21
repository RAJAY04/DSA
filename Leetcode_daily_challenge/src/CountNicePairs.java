import java.util.HashMap;
import java.util.Map;
//Map is an interface that defines the basic methods that a map should have.
//HashMap is a specific implementation of the Map interface.

public class CountNicePairs {
    public static void main(String[] args) {
       int[] nums = {13,10,35,24,76};
        System.out.println(countNicePairs(nums));
    }
    public static int countNicePairs(int[] nums) {
        int mod = 1000000007;
        Map<Integer, Long> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = transform(nums[i]);
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0L) + 1);
        }

        long ans = 0;
        for (long num : freqMap.values()) {
            if (num > 0) {
                ans = (ans % mod + (num * (num - 1) / 2L) % mod) % mod;
            }
        }

        return (int) ans;
    }

    public static int transform(int num) {
        int temp = num;
        if (num % 10 == 0) {
            num /= 10;
        }
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum *= 10;
            sum += rem;
            num /= 10;
        }
        return sum - temp;
    }
}
