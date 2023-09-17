package Arrays;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//    Output: [[1,6],[8,10],[15,18]]
//    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    //sorting the array on the basis of start time
        //now we will merge the intervals
        List<int[]> ans = new ArrayList<>();//this will store the merged intervals
        //adding the first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        int i = 1;//starting from the second interval
        while(i < intervals.length){
            int next_start = intervals[i][0];
            int next_end = intervals[i][1];
            // next interval start is smaller than prev end and array is sorted
            // so these two internal can merge

            if(next_start <= end){
                end = Math.max(end,next_end);
            }
            else{
                ans.add(new int[]{start,end});
                start = next_start;
                end = next_end;
            }
            i++;
        }

        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
//        int[][] res = new int[ans.size()][];
//        for (i = 0 ; i < ans.size(); i ++) {
//            int[] a = new int[2];
//            for (int j = 0; j < 2; j++) {
//                a[0] = ans.get(i)[0];
//                a[1] = ans.get(i)[1];
//            }
//            res[i] = a;
//        }return res;
    }

}
