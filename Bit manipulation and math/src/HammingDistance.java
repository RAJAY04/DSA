public class HammingDistance {
    public static void main(String[] args) {
       int x = 1, y = 4;
//        Output: 2
//        Explanation:
//  1   (0 0 0 1)
//  4   (0 1 0 0)
//         ↑   ↑
//        The above arrows point to positions where the corresponding bits are different.
        System.out.println(hammingDistance(x,y));
    }
//    public int hammingDistance(int x, int y) {
//        int res = 0;
//        int m = x^y;                  // take the xor of two numbers , it will convert 2 numbers into 1 iteratable num
//        while(m != 0){                // count the no of "1"s
//            if((m&1) == 1)
//                res++;
//            m = m>>1;
//        }
//        return res;
//    }
    public static int hammingDistance(int x, int y) {
        int count=0;
        int res = x ^ y;
        while(res!=0){
            if((res&1)==1)count++;
            res>>=1;
//            if((x&1)!=(y&1))count++;
//            x>>=1;
//            y>>=1;
        }return count;
    }
}
//As we know that
//0^0=0
//0^1=1
//1^0=1
//1^1=0
//When we take the XOR of two Numbers the place at which they are different gives 1 in Binary
//Example
//57^12
//Binary of 57 is 111001
//Binary of 12 is 001100
//when we take their XOR
//111001
//001100
//-----------
//110101
//------------
//Now we can count the number of places at which 1 occurs using Kernighan's Algorithm
//which will give us the Hamming Distance
//
//class Solution {
//    public int hammingDistance(int x, int y) {
//        int res=x^y;
//        int count=0;
//        while(res!=0)
//        {
//            int rsb=res&-res;
//            res-=rsb;
//            count++;
//        }
//        return count;
//
//    }
//}
//Brian Kernighan's Algorithm
//The main idea behind this algorithm is that when we subtract one from any number,
// it inverts all the bits after the rightmost set bit i.e. it turns 1 to 0 and 0 to 1.
//Note: The rightmost set bit also gets inverted along with the numbers right to it.
//The time complexity of the algorithm is O(log(n)), where n is the number whose set bits need
// to be calculated. We can see that the time complexity of this algorithm is the same as the brute
// force method, it is because we are here seeing the worst-case scenario of the algorithm.
//But when we see the best case or average case scenario the time complexity of this algorithm
// is way faster compared to the brute force method.
//The space complexity of the algorithm is O(1).
