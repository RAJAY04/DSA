public class ChampagneTower {
    public static void main(String[] args) {
        int poured = 2, query_row = 1, query_glass = 1;
//        Output: 0.50000
        System.out.println(champagneTower(poured,query_row,query_glass));
    }
    public static double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[query_row+1][query_row+1];//query_row+1 is the max number of glasses in a row
        tower[0][0] = poured;     //query_row+1 is the max number of glasses in a row
        for(int row = 0 ; row < tower.length; row++){//tower.length is the number of rows
            for(int col = 0 ; col <= row; col++){//row is the number of glasses in a row
                double glass = tower[row][col];//tower[row][col] is the amount of champagne in the current glass
                if(glass > 1){    //if the current glass has more than 1 cup of champagne
                    tower[row][col] = 1;//then the current glass can only contain 1 cup of champagne
                    if(row < tower.length - 1){//if the current glass is not in the last row
                        double half = (glass - 1)/2;//then the excess champagne will be split evenly between the two glasses below it
                        tower[row + 1][col] +=half;//the glass below and to the left
                        tower[row + 1][col + 1] += half;//the glass below and to the right
                    }
                }
            }

        }return tower[query_row][query_glass];//return the amount of champagne in the glass at the given row and column
    }
}
