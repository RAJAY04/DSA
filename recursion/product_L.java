public class product_L {
    public static void main(String[] args) {
        System.out.println(product(1342));
    }
    public static int product(int n){
        if( n%10==n){//can use if(n == 0)return 1;as base case , but
            return n;//that will not return 0 if last digit is 0 and we want a zero
        }
        return (n%10) * product(n/10);
    }
}
