import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2 ;
        System.out.println("sum is " + sum);

    }
}
