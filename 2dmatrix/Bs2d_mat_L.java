import java.util.Arrays;

public class Bs2d_mat_L {
    public static void main(String[] args) {
        int mat[][]={{10,11,12,13,14},
                {15,25,26,27},
                {28,29,30,31},
                {33,34,38,50}};
        System.out.println(Arrays.toString(search( mat, 50)));
    }
//    search in the rows provided between the columns provided
    private static int[] binary_search(int[][] mat,int row,int cStart,int cEnd ,int target) {
        while(cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(mat[row][mid]==target){
                return new int[]{row,mid};
            }if(mat[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }return new int[]{-1,-1};
    }
    private static int[] search(int[][] matrix,int target){
        int row = matrix.length-1;
        int col = matrix[0].length-1;//be careful matrix may be empty if 2d
        if(row==0){
            return binary_search(matrix,0,0,col-1,target);
        }
        //run the loop till two rows are remaining
        int rStart = 0;
        int rEnd = row-1;
        int cMid=col/2;
        while(rStart<rEnd-1){
            //while this is true we will have more than two rows
            int mid = rStart + ( rEnd+rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }//now we have two rows
        //check weather the target is in col of the two rows
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //search in first half
        if(target<=matrix[rStart][cMid-1]){
             return binary_search(matrix, rStart,0,cMid-1,target);
        }
        //search in second half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]){
            return binary_search(matrix, rStart,cMid+1,col-1,target);
        }
        //search in third half
        if(target<=matrix[rStart+1][cMid-1]){
            return binary_search(matrix, rStart+1,0,cMid-1,target);
        }
        //search in fourth half
        else{
            return binary_search(matrix, rStart+1,cMid+1,col-1,target);
        }
    }
}
