import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> dist= List.of(1,2,3);
        double hour = 2.7;
        //Output: 3
        //Explanation: At speed 3:
        //- The first train ride takes 1/3 = 0.33333 hours.
        //- Since we are not at an integer hour, we wait until the 1 hour mark to depart. The second train ride takes 3/3 = 1 hour.
        //- Since we are already at an integer hour, we depart immediately at the 2 hour mark. The third train takes 2/3 = 0.66667 hours.
        //- You will arrive at the 2.66667 hour mark.
        System.out.println(minSpeedOnTime(dist,hour));
        }
    public static boolean isPossible(List<Integer> dist, int speed, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.size(); i++) {
            double d = dist.get(i) * 1.0 / speed;
            if (i != dist.size() - 1)
                ans = ans + Math.ceil(d);
            else
                ans += d;
            if (ans > hour)
                return false;
        }
        return ans <= hour;
    }

    public static int minSpeedOnTime(List<Integer> dist, double hour) {
        int i = 1;
        int j = (int) 1e7;
        int minSpeed = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (isPossible(dist, mid, hour)) {
                minSpeed = mid;
                j = mid - 1;
            } else
                i = mid + 1;
        }
        return minSpeed;
    }
}