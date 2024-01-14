public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nKnights(board, 0, 0, 4);
    }

    public static void nKnights(boolean[][] board, int row, int col, int knight) {
        if (knight == 0) {
            printBoard(board);
            System.out.println();
            return;
        }

        if(row == board.length - 1 && col == board.length){
            return ;
        }

        if(col == board.length){
            nKnights(board,row+1,0,knight);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            nKnights(board,row,col + 1,knight - 1);
            board[row][col] = false;

        }

        nKnights(board,row, col + 1,knight);

    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board,row -2,col -1)){
            if(board[row - 2][col - 1]){
                return false;
            }
        }
        if(isValid(board,row -2,col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }
        if(isValid(board,row - 1,col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }
        if(isValid(board,row -1 ,col  +2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col){
       return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }


    public static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
