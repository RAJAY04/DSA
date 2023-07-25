import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        System.out.print("enter the total numbers of fibonacci numbers: ");
        int n = in.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
            System.out.println(1);
            for (int i = 0; i < n; i++) {
                int n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
}
