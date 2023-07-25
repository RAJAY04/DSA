import java.util.ArrayList;
import java.util.List;
//leetcode medium : https://leetcode.com/problems/gray-code/description/
//The gray code sequence has the property that the binary representation of every adjacent integer differs by only one bit.
//The first integer is 0 and the last integer differs from the first integer by only one bit.
public class GrayCodeGenerator {
    public static void main(String[] args) {
        int n = 3; // Replace with the desired value of 'n'
        List<Integer> grayCodeList = generateGrayCode(n);
        System.out.println(grayCodeList);
    }

    public static List<Integer> generateGrayCode(int n) {
        List<Integer> grayCodeList = new ArrayList<>();
        int totalNumbers = 1 << n;
// we iterate from 0 to (2^n - 1)
        for (int i = 0; i < totalNumbers; i++) {
            int grayCode = i ^ (i >> 1);
            grayCodeList.add(grayCode);
        }

        return grayCodeList;
    }
}
//Time complexity: O(2^n)
//Space complexity: O(2^n)

