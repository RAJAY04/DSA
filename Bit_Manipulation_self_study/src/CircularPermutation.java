import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircularPermutation {
    public static void main(String[] args) {
        int n = 2, start = 3;
//        Output: [3,2,0,1]
//        Explanation: The binary representation of the permutation is (11,10,00,01).
//                All the adjacent element differ by one bit. Another valid permutation is [3,1,0,2]
        System.out.println(Arrays.toString(new List[]{circularPermutation(n, start)}));
    }
    public static List<Integer> circularPermutation(int n, int start) {
        //same code as greycode problem just need to rotate the list such that the start become the first element
        List <Integer> ans = new ArrayList<>();
        int total_num = 1 << n;
        for( int i = 0 ; i < total_num; i++){
            int j = i ^ ( i>>1) ^ start;
            ans.add(j);
        }return ans;
    }
}
