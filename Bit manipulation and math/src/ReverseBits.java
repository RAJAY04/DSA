public class ReverseBits {
    public static void main(String[] args) {
        int n = 43261596;
//        Output:    964176192 (00111001011110000010100101000000)
//        Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
//                so return 964176192 which its binary representation is 00111001011110000010100101000000.
        System.out.println(reverseBits(n));
        System.out.println(reverseBits1(n));
        System.out.println(reverseBits2(n));
    }
    public static int reverseBits(int n) {
        if (n==0)return 0;
        int rem =0;
        //ans=0<<31 both are one and the same , bcz when you | it with a 32 bit remainder the rest
        // places will be filled automatically with 0;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            rem = n&1;//extracts the last bit
            rem<<=31-i;//as we want to reverse the bits we take the first bit and place it at lhs
            ans = rem|ans;//1000|0000 = 1000
            n>>=1;//ensure that the last bit changes after each for loop
        }return ans;
    }

    //    this method is copied from solns and is very less efficient
    public static int reverseBits1(int n) {
        if (n == 0) return 0;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) == 1) result++;
            n >>= 1;
        }
        return result;
    }

    public static int reverseBits2(int num) {

        num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
        num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
        num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4);
        num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2);
        num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1);

        return num;

    }
}
