import java.util.Arrays;

public class DecodedXORarray {
    public static void main(String[] args) {
        int [] encoded = {1,2,3};
        int first = 1;
//        Output: [1,0,2,1]
//        Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
        System.out.println(Arrays.toString(decode(encoded,first)));
    }

    public static int[] decode(int[] encoded, int first) {
        //Space Complexity is O(1) , TC = O(n)
        //We don't include the returned data structure as a part of Space Complexity.
        // Only auxiliary data structure and the recursive stack space is considered.
        //a XOR b = c, we know the values of a and c. we use the formula to find b -> a XOR c = b
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            ans[i + 1] = ans[i] ^ encoded[i];
        }
        return ans;
    }
    public static int[] decode1(int[] encoded, int first) {
        //the brute force solution TC=O(n*m) , SC=O(n)
        int[] ans = new int[encoded.length+1];
        ans[0]=first;
        for (int i = 0; i < encoded.length; i++) {
            int j = 0;
            while(true){
                if((ans[i]^j)==encoded[i]){
                    ans[i+1]=j;
                    break;
                }else j++;
            }
        }return ans;
    }
}
