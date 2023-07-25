import java.util.Arrays;

public class search_2dmat {
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},
                     {15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}};
//        this is not a strictly sorted matrix
//                confition for strictly sorted matrix ,the last elemtent of the
//                previous row must be strictly greater than the firsst element of th enext row
//if it was strictly sorted we could have applied bs
        System.out.println(Arrays.toString(search_2d(mat, 37)));
    }

    private static int[] search_2d(int[][] mat, int target) {
        int row=0;
        int col=mat.length-1;
        while(col>=0 && row <mat.length){
            if(mat[row][col]==target){
                return new int[]{row,col};
            }else if(mat[row][col]>target){
                col--;
            }else{
                row++;
            }
        }return new int[] {-1,-1};
    }
}
