package BinarySearch;

public class MinDaysToMakeMBouqets {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2, k = 3;
//        Output: 3
//        Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
//        We need 3 bouquets each should contain 1 flower.
//                After day 1: [x, _, _, _, _]   // we can only make one bouquet.
//        After day 2: [x, _, _, _, x]   // we can only make two bouquets.
//        After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
        System.out.println(minDays(bloomDay,m,k));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((double) m * k > n) return -1;
        int max_day = bloomDay[0];
        for (int i = 1; i < n; i++) {
            max_day = Math.max(max_day, bloomDay[i]);
        }
        int low = 1, high = max_day;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (currentBouqets(bloomDay, k, mid, m) < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int currentBouqets(int[] bloomDay, int k, int days, int m) {
        int bouqet_count = 0, curr_k = 0, i = 0;
        while (i < bloomDay.length) {
            if(bloomDay[i] <= days){
                curr_k++;
            }else {
                curr_k = 0;
            }
            if(curr_k == k){
                bouqet_count++;
                curr_k = 0;
            }
            if(bouqet_count >= m)return bouqet_count;
            i++;
        }return bouqet_count;
    }

    public static int minDays1(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((double) m * k > n) return -1;
        int max_day = bloomDay[0];
        for (int i = 1; i < n; i++) {
            max_day = Math.max(max_day, bloomDay[i]);
        }
        for (int i = 1; i <= max_day; i++) {
            if (currentBouqets(bloomDay, k, i, m) == m) {
                return i;
            }
        }return -1;
    }


}
