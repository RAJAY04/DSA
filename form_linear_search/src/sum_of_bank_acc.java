import java.util.Arrays;
//program to find the sum of internal arrays
public class sum_of_bank_acc {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[] sum = sum(matrix);
        System.out.println("The sum of the internal arrays is "+ Arrays.toString(sum));
    }
    static int[] sum(int[][] arr) {
        int[] sum_arr = new int[arr.length];
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
                sum_arr[row] = sum;
            }
        } return sum_arr;
    }
}
