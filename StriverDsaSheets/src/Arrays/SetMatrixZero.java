package Arrays;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int col0 = 1;
        int n = matrix.length;
        int m = matrix[0].length;
//        int[] row = new int[n]; -> matrix[0][..]
//        int[] col = new int[m]; -> matrix[..][0]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    //mark the ith row
                    matrix[i][0] = 0;
                    //mark the jth column only if j != 0
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        //now once we are done marking the rows and columns
        //we iterate over the matrix except the first row and column
        //and change the elements to zero if the row or column is marked
        //1st step
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    //check for col & row
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        //2nd step
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
            //3rd step
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void setZeroes2(int[][] matrix) {
        //this is a better solution
        //space complexity: O(n + m) , time complexity: O(n*m)
        //intuition : we use two arrays one for the rows and one for the columns
        //if we find a zero we mark the row and column as 1
        //then we iterate over the matrix and change all the elements in the row and column to zero
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != 0 && (row[i] == 1 || col[j] == 1)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void setZeroes1(int[][] matrix) {
        //this is a brute force solution
        //space complexity: O(1) , time complexity: O(n^3)
        //intuition : if we find a zero we mark all the elements in the row and column as -1
        //then we iterate over the matrix and change all the -1 to 0
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    //mark all the elements in the row  as -1
                    for (int k = 0; k < m; k++) {//can make this as mark row function
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -1;
                        }
                    }
                    //mark all the elements in the column as -1
                    for (int k = 0; k < n; k++) {//can make this as mark column function
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
