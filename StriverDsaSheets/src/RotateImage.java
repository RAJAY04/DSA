public class RotateImage {
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        Output: [[7,4,1],[8,5,2],[9,6,3]]
    }
    //brute force solution includes crating a ans array and placing the elements in its place
    //but this is not the optimal solution
    
    //the optimal solution is to transpose the matrix and then reverse it
    //this is the optimal solution
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //transpose
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        //reverse
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n/2 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1]= temp;
            }
        }
    }
}
