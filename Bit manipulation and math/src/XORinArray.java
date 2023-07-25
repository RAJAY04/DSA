public class XORinArray {
    public static void main(String[] args) {
        int n = 4, start = 3;
//        Output: 8
//        Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
//        Where "^" corresponds to bitwise XOR operator.
        System.out.println(xorOperation(n,start));
        System.out.println(3^5^7^9);
    }
    public static int xorOperation(int n, int start) {
        int ans = start;
        int next = start;
        for(int i = 0; i< n-1;i++){
            next+=2;
            ans ^= next;
        }return ans;
        //TC=O(N) SC=O(1)
    }
}
