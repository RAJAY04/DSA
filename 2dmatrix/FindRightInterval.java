import java.util.Arrays;

public class FindRightInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3},{3,4}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));

    }
    public static  int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        for(int i=0; i<intervals.length; i++)
            result[i] = search(intervals[i][1], intervals);
        return result;
    }

    private static int search(int num, int[][] intervals){
        int idx = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i< intervals.length; i++){
            if(intervals[i][0] >= num && intervals[i][0] < min){
                idx = i;
                min = intervals[i][0];
            }
        }
        return idx;
    }
}
// my below code didnt pass all the test cases even after 2 hrs of coding and hence i cheated a little
// public static int[] findRightInterval(int[][] intervals) {
//        int[] arr = new int[intervals.length];
//        if( intervals.length == 0 || intervals.length ==1 ) {
//            return new int[]{-1};
//        }
//        int[][] sorted_intervals = Arrays.copyOf(intervals,intervals.length);
//        Arrays.sort(sorted_intervals,(a, b) -> Integer.compare(a[1], b[1]));
//        int i = 0 , j = 1;
//        System.out.println(Arrays.deepToString(sorted_intervals));
//        while(j < sorted_intervals.length) {
//            if (sorted_intervals[i][1] <= sorted_intervals[j][0]) {
//                int[] index = find_index(intervals,sorted_intervals[i], sorted_intervals[j]);
//                arr[index[0]] = index[1];
//                i++;
//                j=i+1;
//            }else{
//                j++;
//            }if(i==sorted_intervals.length-1){
//                for (int k = 0; k < sorted_intervals.length ; k++) {
//                    if( sorted_intervals[i][0] == intervals[k][0] && sorted_intervals[i][1] == intervals[k][1] ){
//                        arr[k]=-1;
//                    }
//                }break;
//            } if(sorted_intervals[i][1] > sorted_intervals[j-1][0] && j == sorted_intervals.length-1) {
//                for (int k = 0; k < sorted_intervals.length ; k++) {
//                    if( sorted_intervals[j-1][0] == intervals[k][0] && sorted_intervals[j-1][1] == intervals[k][1] ){
//                        arr[k]=-1;
//                        break;
//                    }
//                }
//            }
//        }
//   return arr;
//    }
//
//    static int[] find_index( int[][] intervals , int[] arr1 , int[] arr2){
//        int[] ans = new int[2];
//        for (int i = 0; i < intervals.length; i++) {
//            if(intervals[i][0] == arr1[0] && intervals[i][1] == arr1[1] ){
//                ans[0]=i;
//            }
//            if(intervals[i][0] == arr2[0] && intervals[i][1] == arr2[1] ){
//                ans[1]=i;
//            }
//        }
//    return ans;
//    }
