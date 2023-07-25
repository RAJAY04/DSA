import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
//        Write a program to print the sum of negative numbers, sum of positive even numbers
//        and the sum of positive odd numbers from a list of numbers (N) entered by the user.
//        The list terminates when the user enters a zero.
        int sum_of_negative= 0;
        int sum_of_even_positive= 0;
        int sum_of_odd_positive=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i= 0 ; i < n ; i ++) {
            System.out.print("Enter the "+(i+1)+" element: ");
            arr[i] = in.nextInt();
        }
        for (int j : arr) {

            if (j < 0) {
                sum_of_negative += j;

            } else {
                if (j % 2 == 0) {
                    sum_of_even_positive += j;
                } else {
                    sum_of_odd_positive += j;
                }
            }
        }
        System.out.println("Sum of negative numbers is: "+ sum_of_negative);
        System.out.println("Sum of even positive numbers is: "+ sum_of_even_positive);
        System.out.println("Sum of odd positive numbers is: "+ sum_of_odd_positive);
    }
}
