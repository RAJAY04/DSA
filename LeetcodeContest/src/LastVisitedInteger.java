import java.util.ArrayList;
import java.util.List;

public class LastVisitedInteger {
    public static void main(String[] args) {
       String[] words = {"1","2","prev","prev","prev"};
//        Output: [2,1,-1]
//        Explanation:
//For "prev" at index = 2, last visited integer will be 2 as here the number of consecutive
//"prev" strings is 1, and in the array reverse_nums, 2 will be the first element.
//For "prev" at index = 3, last visited integer will be 1 as there are a total of
//two consecutive "prev" strings including this "prev" which are visited, and 1 is the second last visited integer.
//=For "prev" at index = 4, last visited integer will be -1 as there are a total of three
//=consecutive "prev" strings including this "prev" which are visited, but the total number of
// integers visited is two.
        System.out.println(lastVisitedIntegers(List.of(words)));
    }
    public static List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> rev_nums = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int prev_count = 0;

        for (int i = 0; i < words.size(); i++) {
            if ("prev".equals(words.get(i))) {
                prev_count++;
                if (prev_count <= rev_nums.size()) {
                    ans.add(rev_nums.get(rev_nums.size() - prev_count));
                } else {
                    ans.add(-1);
                }
            } else {
                int num = Integer.parseInt(words.get(i));
                rev_nums.add(num);
                prev_count = 0;
            }
        }

        return ans;
    }
}
