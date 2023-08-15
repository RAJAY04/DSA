import java.util.Arrays;

public class Longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "foul", "flight"};
//        Output: "fl"
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) {
                c++;
            } else break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
