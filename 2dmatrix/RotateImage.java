import java.util.Arrays;
import java.util.Collections;

public class RotateImage {
    public static void main(String[] args) {
        int [][]matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
//        Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        //transpose of the matrix
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int m = matrix[i].length;
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }//reverse each array
        for (int i = 0; i < n; i++) {
            int m = matrix[i].length;
            for (int j = 0; j < (int)n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
                System.out.println(Arrays.deepToString(matrix));
            }
        }


    }
}
