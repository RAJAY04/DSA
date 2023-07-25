import java.util.Arrays;

public class height_checker {
    public static void main(String[] args) {
        int [] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));

    }
    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s]= arr[e];
        arr[e]=temp;
    }
    private static int heightChecker(int[] heights) {//insertion sort is being used
       int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i]=heights[i];
        }
        for (int i = 0; i < heights.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(heights[j]<heights[j-1]){
                    swap(heights,j,j-1);
            }else{
                    break;
                }

        }
       }
        int error = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!=expected[i]){
                error++;
            }
        }return error;

    }
}
