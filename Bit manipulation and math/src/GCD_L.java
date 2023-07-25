public class GCD_L {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(hcf(4,8));
    }
    static int gcd(int a , int b){
        if(a==0)return b;
        //this base case bcz , gcd(0,300)?->300 hence the ans
        return gcd(b%a,a);
    }
    static int hcf( int a , int b){
        return a*b/gcd(a,b);
    }
}
