import java.util.Arrays;

public class CountSort {
    //its very fastest as it requires O(N + K) in all case but it needs auxiliary space of O(N+K)
    public static void main(String[] args) {
        int[] arr = {8,9,2,3,4,1,6,8,10,11,32,42,22,21,20};
        Csort(arr);
    }

    private static void Csort(int[] arr) {
        //first find the max element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        //create new array of size max+1
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            //this array contains count of numbers occured stored in respective index same as numbers
        }
        //copy back the element in sorted manner in the original array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] > 0){
                while(count[i] != 0) {
                    arr[index] = i;
                    count[i]--;
                    index++;
                }
            }
        }
    }
}
