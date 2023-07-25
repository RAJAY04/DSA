public class PowOfTwo_L {
    public static void main(String[] args) {
        //wkt a number can be said as a power of 2 if and only if it has only one 1 in its binary representation
        //hence when we and a number n with n-1 we get 0 if it has only one 1 .
        //eg: 10000&01111=0;
        int n = 2;
        //note fix for n=0= false
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
