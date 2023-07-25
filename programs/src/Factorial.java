public class Factorial {

    public static void main(String[] args) {
        int num = 4;
        int factorial = fact(num);
        System.out.println(factorial);

    }
static int fact(int n){
//factorial without recursion
    int fact = 1;
    while( n > 0){
         fact *= n;
         n--;
    }return fact;
        //        if (n == 1 || n == 0){
//            return 1;
//        }else{
//            return n * fact(n-1);
//        }
}
}
