public class MagicNumber_L {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ans(n));
    }
//magic number= convert the number into binary ( which automatically happens ) and in that take
//binary digits one by one from the end and multiply with power of 5s
//eg: 6=111->1*5+1*(5*5)+1*(5*5*5), the approach here is & the number with 1 , which gives us the last binary digit
//multiply the powers of 5 respectively and >> at the end of the loop to move on to next digit

    private static int ans(int n) {

        int ans =0;
        int base=5;
        int last;
        while(n>0){
            last=n&1;
            n=n>>1;
            ans+=last*base;
            base*=5;
        }return ans;
    }
}
