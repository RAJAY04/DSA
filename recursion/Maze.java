import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
        System.out.println(maze(3, 3, ""));
        System.out.println(mazeDiagonal(3, 3, ""));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazeObs(0, 0, "", board);
    }

//    static int maze(int row,int col){
//        if(row == 1 || col == 1){
//            return 1;
//        }
//        int count = 0;
//        count += maze(row - 1,col );
//        count += maze(row ,col - 1);
//        return count;
//    }

//    static void maze(int row,int col,String up){
//        if(row == 1 && col == 1){
//            System.out.println(up);
//            return;
//        }
//        if(row > 1) {
//            maze(row - 1, col, up+'D');
//        }
//        if(col > 1) {
//            maze(row, col - 1, up+'R');
//        }
//    }

    static List<String> maze(int row, int col, String up) {
        if (row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        List<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(maze(row - 1, col, up + 'D'));
        }

        if (col > 1) {
            ans.addAll(maze(row, col - 1, up + 'R'));
        }
        return ans;
    }

    static List<String> mazeDiagonal(int row, int col, String up) {
        if (row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        List<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(mazeDiagonal(row - 1, col, up + "D"));
        }

        if (row > 1 && col > 1) {
            ans.addAll(mazeDiagonal(row - 1, col - 1, up + "C"));
        }

        if (col > 1) {
            ans.addAll(mazeDiagonal(row, col - 1, up + "R"));
        }
        return ans;
    }

    static void mazeObs(int row, int col, String up, boolean[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(up);
            return;
        }

        if (!maze[row][col]) {
            return;
        }
        if (row < maze.length - 1) {
            mazeObs(row + 1, col, up + 'D', maze);
        }
        if (col < maze[0].length - 1) {
            mazeObs(row, col + 1, up + 'R', maze);
        }
    }
}

