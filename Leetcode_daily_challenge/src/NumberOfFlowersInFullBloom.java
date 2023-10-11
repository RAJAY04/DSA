import java.util.Arrays;
//revisit this question, very important and good one


public class NumberOfFlowersInFullBloom {
    public static void main(String[] args) {
       int[][] flowers = {{1,6},{3,7},{9,1},{4,13}};
       int [] people = {2,3,7,11};
//        Output: [1,2,2,2]
//        Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
//        For each person, we return the number of flowers in full bloom during their arrival.
        System.out.println(Arrays.toString(fullBloomFlowers(flowers,people)));
    }
    public static int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] res = new int[persons.length];

        for (int i = 0; i < persons.length; i++) {
            int t = persons[i];
            int started = binarySearchUpperBound(start, t);
            int ended = binarySearchLowerBound(end, t);
            res[i] = started - ended;
        }

        return res;
    }

    private static int binarySearchUpperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private static int binarySearchLowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}
