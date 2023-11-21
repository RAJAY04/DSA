import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] array = new int[n];
            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                try {
                    array[i] = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("InputMismatchException: Please enter a valid integer.");
                    return;
                }
            }

            int smallest = array[0];
            for (int num : array) {
                if (num < smallest) {
                    smallest = num;
                }
            }

            System.out.println("Performing division by the smallest element in the array:");

            for (int i = 0; i < n; i++) {
                try {
                    int result = array[i] / smallest;
                    System.out.println("Result of element at index " + i + " divided by smallest element: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException: Division by zero is not allowed.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException: Accessing an index outside the array bounds.");
                }
            }

            System.out.print("Enter the index to access an element from the array: ");
            int index = scanner.nextInt();

            try {
                System.out.println("Element at index " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Index out of array bounds.");
            }

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid number of elements.");
        } finally {
            scanner.close();
        }
    }
}
