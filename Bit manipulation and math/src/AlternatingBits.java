public class AlternatingBits {
    public static void main(String[] args) {
        int n = 10;
//        Output: true
//        Explanation: The binary representation of 5 is: 101
        System.out.println(hasAlternatingBits(n));
    }

    public static boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n>>=1;
        while (n > 0) {
            if(prev==(n&1))return false;
            prev=n&1;
            n>>=1;
        }return true;
    }
}
