public class SearchNegative {
    public static void main(String[] args) {
        int [][]grid = {{10,9},{6,6}};
//        Output: 8
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int row=grid.length-1;
        int col = 0;
        while(grid[row][col]>0 && col<grid.length-1) {
            if(grid[row][col]>0) {
                col++;
            }
            else break;
        }return search(grid,col) ;
    }
    public static int search(int[][] grid,int s){
        int negative=0;
        for (int i = 0; i< grid.length; i++) {
            for (int j = grid[i].length-1; j>=s ; j--) {
                if(grid[i][j]<0)negative++;
                else break;
            }
        }return negative;

        }
    }
