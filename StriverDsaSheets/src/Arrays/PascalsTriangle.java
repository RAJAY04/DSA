package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {//striver video solution
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row , pre = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {//if its first col or last col add 1
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }pre = row;//we need previous row to compute next
            res.add(row);
        }
        return res;
    }


    public List<List<Integer>> generate1(int numRows) {//recursive soln
        //base case if the numRows is only 1
        //just return it in a 2d-list
        if (numRows == 1) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> a = new ArrayList<>();
            a.add(1);
            res.add(a);
            return res;
        }

        List<List<Integer>> faith = generate(numRows - 1); //this call is to bring us all rows from 1 to numRows-1

        //our job is to just append the last row by following the pascal's triangle pattern
        List<Integer> b = new ArrayList<>();
        b.add(1);

        if (faith.size() > 0) {
            List<Integer> c = faith.get(faith.size() - 1);
            for (int i = 0; i < c.size() - 1; i++) {
                b.add(c.get(i) + c.get(i + 1));
            }
        }

        b.add(1);
        faith.add(b);

        return faith;

    }
}

