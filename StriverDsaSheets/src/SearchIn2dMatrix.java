public class SearchIn2dMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 4;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        // m = number of rows in matrix
        int n = matrix.length;

        // n = number of columns in matrix
        int m = matrix[0].length;

        // Set starting index to 0
        int low = 0;

        // Set ending index to last index in flattened matrix
        int high = m * n - 1;

        while (low <= high) {

            // Calculate mid index in flattened matrix
            int mid = low + (high - low) / 2;

            int row = mid / m ,col = mid % m;//idx/length of row gives row and idx%length of row gives col

            // Get element at mid index by mapping to [row][col]
            if (matrix[row][col] == target) {
                //idx/m gives row and idx%m gives col
                return true;

                // If target is less than element at mid, search lower half
            } else if (target < matrix[row][col]) {

                high = mid - 1;

                // If target is more than element at mid, search upper half
            } else {

                low = mid + 1;
            }

        }return false;
    }
}
