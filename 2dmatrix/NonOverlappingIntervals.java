    import java.util.Arrays;

    public class NonOverlappingIntervals {
        public static void main(String[] args) {
            int[][] intervals = {{0,2},{1,3},{2,4},{3,5},{4,6}};
            //intervals = [[1,2],[2,3],[3,4],[1,3]]
            //Output: 1
            //Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
            System.out.println(eraseOverlapIntervals(intervals));
        }
        public static int eraseOverlapIntervals(int[][] intervals) {
            if(intervals.length==1||intervals.length==0)return 0;
            //soting part
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));//
            //here we use a lamda expression, if a[1] - b[1]this return a positive valuse which means that a should come after b and vice versa , if it returns 0 then no swap is occured.
            int i =0;
            int j =1;
            int count = 0 ;
            while(j<intervals.length){
                if(intervals[i][1]<=intervals[j][0]) {
                    i=j;
                    j++;
                }else {
                    j++;
                    count++;
                }
            }
        return count;
        }
    }
