import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string that you want to reverse: ");
        String str = in.toString();
        String rev_str = rev_string(str);
        System.out.println("the original string is : " + str);
        System.out.println("the original reversed string is :" + rev_str);

        }
    static String rev_string (String str){
        String rev_string = "";
        for (int i =0; i<str.length();i++) {
            rev_string = str.charAt(i) + rev_string;
        }
        return rev_string;
    }
}
