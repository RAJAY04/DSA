public class IntegerBreak {
    public static void main(String[] args) {
        int n = 10;
//        Output: 36
//        Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
        System.out.println(integerBreak(n));
    }
    //the mathematical approach is the most effecient one , this problem can also be solved by dynamic
//programming approach

    public static int integerBreak1(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int quotient = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            return (int) Math.pow(3, quotient);
        } else if (remainder == 1) {
            return (int) (Math.pow(3, quotient - 1) * 4);
        } else {
            return (int) (Math.pow(3, quotient) * 2);
        }
    }

        public static int integerBreak(int n) {
        if(n <= 1)return 0;
        if(n == 2)return 1;
        if(n == 3)return 2;
        int result = 1;
        while(n > 4){
            result *= 3;
            n -= 3;
        }
        result *= n;
        return result;
    }
}
