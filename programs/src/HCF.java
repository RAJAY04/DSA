import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = in.nextInt();
        int hcf;
        hcf = hcf(n1, n2);
        int lcm;
        lcm = lcm(n1,n2,hcf);
        System.out.println("Hcf is : " + hcf);
        System.out.println("lcm is : " + lcm);
    }

    private static int lcm(int n1, int n2, int hcf) {
        return (n1*n2)/hcf;
    }

    private static int hcf(int n1, int n2) {
        while (n2 > 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n1;
    }
}
