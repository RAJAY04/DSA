import java.util.Arrays;
import java.util.Scanner;

public class max_val_of_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("The entered array is: ");
        System.out.println(Arrays.toString(arr));
        int max=Max(arr);
        System.out.println("The max element is "+max);
    }

    private static int Max(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
