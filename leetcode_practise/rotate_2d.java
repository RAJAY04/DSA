    import java.util.Arrays;

    public class rotate_2d {
        public static void main(String[] args) {
            int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    //        Output: [[7,4,1],[8,5,2],[9,6,3]]
            System.out.println(Arrays.deepToString(rotate(matrix)));
        }

        public static int[][] rotate(int[][] matrix) {
              int n = matrix.length;
            for (int i = 0; i < n; i++) {
                int m = matrix[i].length;
                for (int j = 0; j < m; j++) {
                   matrix[i][j]=matrix[j][i];
                }
            }
              return matrix;
        }
    }
