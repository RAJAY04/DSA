public class search2dMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
//        Output: true
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;//n = rows , m = cols
        int row = 0, col = m - 1;//start from top right corner
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {//if target found return true
                return true;
            } else if (matrix[row][col] > target) {//if target is less than current element then move left
                col--;
            } else {//if target is greater than current element then move down
                row++;
            }
        }
        return false;//if target not found return false
    }
}
