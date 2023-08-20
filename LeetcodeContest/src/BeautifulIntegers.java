public class BeautifulIntegers {
    public static void main(String[] args) {
        //You are given positive integers low, high, and k.
        //
        //A number is beautiful if it meets both of the following conditions:
        //
        //The count of even digits in the number is equal to the count of odd digits.
        //The number is divisible by k.
        //Return the number of beautiful integers in the range [low, high].
        //
        //
        //
        //Example 1:
        //
        int low = 5, high =5, k = 2   ;
        //Output: 2
        //Explanation: There are 2 beautiful integers in the given range: [12,18].
        //- 12 is beautiful because it contains 1 odd digit and 1 even digit, and is divisible by k = 3.
        //- 18 is beautiful because it contains 1 odd digit and 1 even digit, and is divisible by k = 3.
        //Additionally we can see that:
        //- 16 is not beautiful because it is not divisible by k = 3.
        //- 15 is not beautiful because it does not contain equal counts even and odd digits.
        //It can be shown that there are only 2 beautiful integers in the given range.
        System.out.println(numberOfBeautifulIntegers(low,high,k));
    }
    public static int numberOfBeautifulIntegers(int low, int high, int k) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if((i%k)==0 && i > 9){
                if(check_digit(i) ){
                    count++;
                }
            }
        }return count;
    }
    public static boolean check_digit(int num){
        int even = 0, odd = 0;
        while(num > 0){
            if((num%10)%2 == 0){
                even++;
            }else{
                odd++;
            }
            num/=10;
        }return odd == even;
    }
}
