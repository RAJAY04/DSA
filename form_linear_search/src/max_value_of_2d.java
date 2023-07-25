//program to find the max value of a 2d array
public class max_value_of_2d {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int max_val = max(matrix);
        System.out.println(max_val);
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }return max;
    }
}
