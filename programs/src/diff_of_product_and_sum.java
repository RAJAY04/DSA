import java.util.Scanner;

public class diff_of_product_and_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the number: ");
        int num = in.nextInt();
        int product = 1;
        int sum = 0;
        int rem;
        while (num>0){
           rem = num % 10;
           product *= rem;
           sum += rem;
           num = num / 10;
        }
        System.out.println("the product of the digits is "+ product);
        System.out.println("the sum of the digits is "+ sum);
        System.out.println("the difference between the product of digits and the sum of digits is "+ (product-sum));
    }
}

