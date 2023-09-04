import java.util.Arrays;

public class FindPeakElementII {
    public static void main(String[] args) {
        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
//        int[][] mat1 = {{53,10,55},{52,50,51},{54,30,56}};
//        Both 30 and 32 are peak elements so [1,1] and [2,2] are both acceptable answers.
         System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {

        // n = number of rows
        int n = mat.length;

        // m = number of columns
        int m = mat[0].length;

        // Initialize start and end indexes
        int low = 0;
        int high = m - 1;

        while(low <= high) {

            // Calculate mid index
            int mid = low + (high - low)/2;

            // Initialize max value and index
            int max = 0;
            int max_idx = -1;

            for(int i = 0; i < n; i++) {

                // Update max and max_idx if element > max
                if(mat[i][mid] > max){
                    max = mat[i][mid];
                    max_idx = i;
                }
            }

            // Check if mid is peak

            // If mid > 0 and left element > current,
            // search left half
            if(mid > 0 && mat[max_idx][mid-1] > mat[max_idx][mid]) {
                high = mid - 1;

                // If mid < last and right element > current,
                // search right half
            } else if(mid < m-1 && mat[max_idx][mid+1] > mat[max_idx][mid]) {
                low = mid + 1;

                // Otherwise, mid is peak
            } else {
                return new int[]{max_idx, mid};
            }

        }

        // No peak found
        return new int[]{-1, -1};
    }
}
