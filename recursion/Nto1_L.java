public class Nto1_L {
    public static void main(String[] args) {
        funAndRev(5);
    }
//  fun(n--);//infinite recursion , stack overflow error! use --n  
    private static void fun(int n) {
        //to print n to 1
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    public static void funRev(int n){
        //to print 1 to n
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.print(n+" ");
    }
    public static void funAndRev(int n){
        //to print n to 1 and n to 1
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        funAndRev(n-1);
        System.out.print(n+" ");
    }

}
