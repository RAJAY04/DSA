public class OddEven_L {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }
    //the last digit of a binary number is called as the least significant bit and that gives us
    //wheather the number is even or odd, if 1 its odd and if 0 its even , hence we & a number with 1 to get the last digit
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
