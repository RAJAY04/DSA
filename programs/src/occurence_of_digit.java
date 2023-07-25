import java.util.Scanner;

public class occurence_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = in.nextInt();
        System.out.print("enter the occurence of a number to check: ");
        int n = in.nextInt();
        int count = 0;
        while (num >0){
            int rem = num % 10;
            if(rem==n){
                count++;
            }
            num = num /10;
        }
        System.out.println(n+" is present "+count+"times");

    }
}
