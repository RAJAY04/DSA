public class Palindrome_num {
    public static void main(String[] args) {


        int num = 12321;
        System.out.println(palindrome(num));
    }

    private static boolean palindrome(int num) {
        int temp = num;
        int sum=0;
        int rem;
        while( num != 0) {
            rem = num % 10;
            sum*=10;                 //note that not to multiply 10 in the first iteration,
            sum += rem;              //else there will be a extra 0 at the end of reversed number.
            num = num / 10;
        }
        return temp == sum;
    }
}