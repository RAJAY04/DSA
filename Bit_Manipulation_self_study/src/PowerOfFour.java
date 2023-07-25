public class PowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
//        Output: true
    }
    public static boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if((n&(n-1))!=0) return false;
        return (n-1)%3==0;
    }
}
