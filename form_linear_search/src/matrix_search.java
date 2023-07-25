import java.util.Arrays;
//program to search index position of the target element
public class matrix_search {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 20;
        int[] ans = search(matrix,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }return new int[]{-1, -1};
    }
}