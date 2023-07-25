//program to reverse a array
import java.util.Arrays;
import java.util.Scanner;

public class Swapp {
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
        int s=0;
        int e = n-1;
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
        System.out.print("The reversed array is: ");
        System.out.println(Arrays.toString(arr));
        }


     static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
     }
}
