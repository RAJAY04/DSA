public class matrix_diagonal_sum {
    public static void main(String[] args) {
        int[][] mat = {{7,3,1,9},
                       {3,4,6,9},
                       {6,9,6,6},
                       {9,5,8,5}};
//        Output: 55
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
            for (int i = 0; i < n; i++){
                sum+=mat[i][i];
                sum+=mat[i][n-i-1];
            }if(n%2==1){
            int mid = n/2;
            sum-=mat[mid][mid];
        } return sum;

    }
}
