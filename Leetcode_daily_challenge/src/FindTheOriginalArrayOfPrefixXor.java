import java.util.Arrays;

public class FindTheOriginalArrayOfPrefixXor {
    public static void main(String[] args) {
       int[] pref = {5,2,0,3,1};
//        Output: [5,7,2,3,2]
//        Explanation: From the array [5,7,2,3,2] we have the following:
//        - pref[0] = 5.
//                - pref[1] = 5 ^ 7 = 2.
//                - pref[2] = 5 ^ 7 ^ 2 = 0.
//                - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
//                - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
        System.out.println(Arrays.toString(findArray(pref)));
    }
    //ntuition
    //Do this first:
    //Given pref, find arr that
    //pref[i] = arr[0] + arr[1] + ... + arr[i]
    //pref is prefix sum of arr
    //
    //The solution is simple:
    //
    //for(int i = A.size() - 1; i > 0; --i)
    //    A[i] -= A[i - 1];
    //return A;
    //Now we are doing something similar for this problem.
    //
    //
    //Explanation
    //Since pref is the prefix array,
    //it's calculated from arr one by one,
    //we can doing this process reverssely to recover the original array.
    //
    //Since
    //pref[i] = pref[i-1] ^ A[i]
    //so we have
    //pref[i] ^ pref[i-1] = A[i]
    //
    //So we simply change - to ^ in the intuition solution
    //
    //The reverse operation of + is -
    //The reverse operation of ^ is still ^
    //More general, we can apply this solution to prefix of any operation.
    //
    //
    //Complexity
    //Time O(n)
    //Space O(n)
    public static int[] findArray(int[] pref) {
        for(int i = pref.length -1; i > 0; i-- ){
            pref[i] ^= pref[i - 1];
        }
        return pref;
    }
}
