import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathsPrint(0, 0, "", board,path,1);
    }
    static void allPaths(int row, int col, String up, boolean[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(up);
            return;
        }

        if (!maze[row][col]) {
            return;
        }
        //i am considering this block in my path
        maze[row][col] = false;

        if (row < maze.length - 1) {
            allPaths(row + 1, col, up + 'D', maze);
        }
        if (col < maze[0].length - 1) {
            allPaths(row, col + 1, up + 'R', maze);
        }
        if (row > 0) {
            allPaths(row - 1, col, up + 'U', maze);
        }
        if (col > 0) {
            allPaths(row, col - 1, up + 'L', maze);
        }
        //here is where the functions gets over
        //so before function gets removed also remove the changes
        //that were made in the function
        maze[row][col] = true;
    }

    static void allPathsPrint(int row, int col, String up, boolean[][] maze,int[][] path,int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            //last step is also a stepp so add it
            path[row][col] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(up);
            System.out.println();

            return;
        }

        if (!maze[row][col]) {
            return;
        }
        //i am considering this block in my path
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            allPathsPrint(row + 1, col, up + 'D', maze,path,step + 1);
        }
        if (col < maze[0].length - 1) {
            allPathsPrint(row, col + 1, up + 'R', maze,path,step + 1);
        }
        if (row > 0) {
            allPathsPrint(row - 1, col, up + 'U', maze,path,step + 1);
        }
        if (col > 0) {
            allPathsPrint(row, col - 1, up + 'L', maze,path,step + 1);
        }
        //step we dont have to backtrack because its a primitive and it will be same in that function call


        //here is where the functions gets over
        //so before function gets removed also remove the changes
        //that were made in the function
        maze[row][col] = true;
        path[row][col] = 0;


    }
}
