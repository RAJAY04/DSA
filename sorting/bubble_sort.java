import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        //run the loop n-1 steps
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            //for each step each item will come at last respective index
              swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j - 1] > arr[j]){
                     int temp = arr[j];
                     arr[j]= arr[j-1];
                     arr[j-1]=temp;
                     swap=true;
                }
            }
            //for a value of i no swapp occured hence break the loop
            if(!swap){
                break;
            }
        }
    }
}
