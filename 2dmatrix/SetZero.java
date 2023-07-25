import java.util.Arrays;

public class SetZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
//        Output: [[1,0,1],[0,0,0],[1,0,1]]
         bestsetZeros(matrix);
    }


    //long explaination , if cant understand then see yt
    public static void bestsetZeros(int[][] matrix){
        boolean col0 =true;
        int rows=matrix.length,cols=matrix[0].length;
        for (int i = 0; i < rows ; i++) {
            if(matrix[i][0]==0)col0=false;
            for (int j = 1; j < cols; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
        for (int i = rows-1; i >0; i--) {
            for (int j = cols-1; j >0 ; j--) {
                if(matrix[i][0]==0||matrix[0][j]==0)matrix[i][j]=0;
                if(!col0)matrix[i][0]=0;
            }
        }System.out.println(Arrays.deepToString(matrix));
    }
    public static void setZeroes(int[][] matrix) {
        int[] col = new int[matrix.length];
        Arrays.fill(col,-1);
        int o=0;//creating an filling en empty array to store col values where 0 occured
        //need to fill bcz if we dont fill by default it will contain 0 and problematic
        for (int i = 0; i < matrix.length; i++) {//this section finds the value of cols for which 0 occured
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0){
                    col[o++]=i;
                    break;
                }
            }
        }
        //fills the adjacents ele with 0 if found 0
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }//this section changes the whole row to 0 if found 0 in that row
        for (int i = 0; i < matrix.length; i++) {
            if(col[i]==-1)break;
            else Arrays.fill(matrix[col[i]],0);
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
