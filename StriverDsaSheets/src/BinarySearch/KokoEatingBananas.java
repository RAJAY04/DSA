package BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
//        Output: 4
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int high = Integer.MIN_VALUE , n = piles.length;
        for( int i = 0 ; i < n ; i ++) {
            high = Math.max(high, piles[i]);
        }
        int low = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int total_hrs = findTime(piles, mid);
            if (total_hrs <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int findTime(int[] piles, int hourly) {
        int total_hrs = 0 , n = piles.length;
        for (int i = 0; i < n; i++) {
            total_hrs += Math.ceil((double) piles[i] /(double) hourly);
        }
        return total_hrs;
    }


//    public static int minEatingSpeed1(int[] piles, int h) {
//        int max_k = Integer.MIN_VALUE;
//        for (int pile : piles) {
//            max_k = Math.max(max_k, pile);
//        }
//        for (int i = 1; i <= max_k; i++) {
//            int req_time = findTime(piles, i);
//            if (req_time <= h) return i;
//        }
//        return -1;
//    }


}
