import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the character to print: ");
        char c = in.next().trim().charAt(0);
        System.out.println("the entered character is "+ c);
    }
}
