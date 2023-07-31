public class ReverseNumber_L {
    public static void main(String[] args) {
        rev_1(1824);
        System.out.println(rev_2(1234));
        System.out.println(palindrome(1221));
    }
    static int sum = 0;
    static void rev_1(int n){
        //this is like a bit cheating by declaring the variable outside the function
        if( n == 0 ){
            return;
        }
        int rem = n % 10;
        sum = sum *10 + rem;
        rev_1(n/10);
    }
    static int rev_2(int n){
       //sometimes you may need some additional variables in the function , at that time make
        //another helper function
        int digits = (int)(Math.log10(n))+1;//gives the number of digits
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if( n % 10 == n ){
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10,digits-1) + helper( n/10 , digits -1);
    }
    static boolean palindrome(int n){
        return n == rev_2(n);
    }


}
