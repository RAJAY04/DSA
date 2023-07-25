public class PowerOfThree {
    public static void main(String[] args) {
        int n = 11;
//        Output: true
//        Explanation: 27 = 33
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n % 2 == 0 || n == 0 ||n%3 !=0|| n % 5 == 0)
            return false;//note that the constraints givevn is n will be in 3 to power+-31
        //there is no power of 3 which is divisible by 5 until 3 to power 35
        return isPowerOfThree(n / 3);

    }
}

//        leetcode ans,if(n == 0) return false;
//                if(n == 1) return true;
//
//                if(n % 3 != 0) return false;
//
//                return isPowerOfThree(n/3);
