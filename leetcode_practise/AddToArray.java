import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
        int k = 512;
//        Output: [1,0,2,1]
//        Explanation: 215 + 806 = 1021
        System.out.println(addToArrayForm(num, k));

    }
//Approach
//Example: `num` = [2,1,5], `k` = 806
//At index 2 num = [2, 1, 811]
//So, `k` = 81 and `num` = [2, 1, 1]
//
//At index 1 num = [2, 82, 1]
//So, `k` = 8 and `num` = [2, 2, 1]
//
//At index 0 num = [10, 2, 1]
//So, `k` = 1 and `num` = [0, 2, 1]
//
//Now `k` > 0
//So, we add at the beginning of num
//`num` = [1, 0, 2, 1]
    public static List<Integer> addToArrayForm(int[] num, int k) {
        //ArrayList:
        //Adding an element at the beginning: O(n) (due to element shifting)
        //LinkedList:
        //Adding an element at the beginning: O(1) (constant time)
        //So, when adding elements at the beginning of the list, LinkedList
        // can perform much better than ArrayList, especially when the list is
        // large and many elements need to be added.
        //arraylist gives tc as better than 7% and linked list as better than 99%
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);//add last digit of sum
            k = (num[i] + k) / 10;//k becomes prev k except the last digit
        }
        //if in case k is remaining in the end add it to first place , in this step linkedlist performs better
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
