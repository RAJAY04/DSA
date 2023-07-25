public class Square_root {
    public static void main(String[] args) {
        int x = 8;
//
        System.out.println("the square root of "+x+" is "+mySqrt(x));
    }

    private static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int first = 1, last = x;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == x / mid) {//use basic math to reduce calculations
                return mid;
            } else if (mid > x / mid) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}
