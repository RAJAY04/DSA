public class pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
//        Output: 1024.00000
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
        //in the brute force method we must solve this ny O(N) multiplying x , n times eg if x = 1.0 and
        //n = 43589 , it will be very ineffecient
        //we use binary representation of a number to optimise
        //Basic Idea is to divide the work using binary representation of exponents
        //i.e. is to keep multiplying pow with x, if the bit is odd, and multiplying x with itself until we get 0
        //We will use very 1st example of 1st Approach i.e.
        //x = 7, n = 11 and pow = 1
        //Here, we have to calculate 7^11
        //Binary of n i.e. (11)10 is (1011)2
        //1   0   1   1
        //2^3  2^2  2^1  2^0   <-- Corresponding place values of each bit
        //
        //OR we can also write this as
        //1 0 1 1
        //8 4 2 1 <-- Corresponding place values of each bit
        //
        //Now, 7^8 × 7^2 × 7^1 == 7^11 as 7^(8 + 2 + 1) == 7^11
        if(n < 0){
            n *= -1;
            x = 1 / x;
        }

        double pow = 1;

        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }

            x *= x;
            n >>>= 1;

        }

        return pow;
    }
}
