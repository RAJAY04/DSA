public class PowerOfTwo {
    public static void main(String[] args) {
        int n =8;
//        Output: true
//        Explanation: 20 = 1
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if( n==0 || n%2!=0 ) return false;
        return isPowerOfTwo(n/2);
    }
}
