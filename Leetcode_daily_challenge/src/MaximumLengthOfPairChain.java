import java.util.Arrays;

public class MaximumLengthOfPairChain {
    public static void main(String[] args) {
        int[][]pairs = {{-10,-8},{8,9},{-5,0},{6,10},{-6,-4},{1,7},{9,10},{-4,7}};
//        Output: 3
        System.out.println(findLongestChain(pairs));
    }
    public static int findLongestChain(int[][] pairs) {
        // We sort the array on the basis of the second elements in the pairs
        // It yields us more optimal solution than if we sort it based on the first elements in the pairs
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        //concept of comparator in java
        //If a[0] < b[0], it will return a negative value, indicating a should come before b in sorted order.
        //
        //If a[0] > b[0], it will return a positive value, indicating b should come before a.
        //
        //If a[0] == b[0], it will return 0, indicating no change in order.
        int prev_end = pairs[0][1];  // keep a pair recorded for comparison during each iteration
        int len = 1;                // maximum length of chain by default is going to be atleast 1
        for (int i = 1; i < pairs.length; i++) {
            // if current pair's 1st element is strictly greater than previous pair's 2nd element
            if ( prev_end < pairs[i][0]) {
                len++;                  // length increments
                prev_end = pairs[i][1];    // current pair becomes last/previous pair for upcoming pairs
            }
        }

        return len;     // return the length achieved so far
    }
}

// TC: O(n * logn) + O(n) => O(n * logn)
// SC: O(1)
