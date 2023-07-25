public class SwapWithXOR {
    public static void main(String[] args) {
        int a = 5 , b = 4 ;
        System.out.println(a);
        System.out.println(b);
        a = a ^ b ;
        b = b ^ a;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
