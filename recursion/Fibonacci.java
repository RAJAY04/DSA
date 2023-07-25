public class Fibonacci {
    public static void main(String[] args) {
        int ans = Fibo(4);
        System.out.println(ans);
    }

    private static int Fibo(int n) {
        if( n<2) {
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
    //    private static int Fiboformula(int n){
//            return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
//    //refer notes for the derivation of this formula.can remove the second term as it is less dominating but we wont get the precise ans
//    }
}

















