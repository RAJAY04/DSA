package Strings;

public class ReverseWordInaString {
    public static void main(String[] args) {
        String s = "  hello world  ";
//        Output: "world hello"
//        Explanation: Your reversed string should not contain leading or trailing spaces.
        System.out.println(reverseWords(s));
    }

    public static String reverseWords1(String s) {
        //this is the most redable code i found on leetcode which matched my intuition
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = n - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            int j = i - 1;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            sb.append(" ");
            sb.append(s.substring(j + 1, i + 1));
            i = j - 1;
        }
        if (sb.length() > 0) sb.deleteCharAt(0);
        return sb.toString();
    }

    public static String reverseWords(String s) {
        //this is strivers code
        int left = 0;
        int right = s.length() - 1;

        String temp = "";
        String ans = "";

        //Iterate the string and keep on adding to form a word
        //If empty space is encountered then add the current word to the result
        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp += ch;
            } else if (ch == ' ') {
                if (!ans.equals("")) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }

        //If not empty string then add to the result(Last word is added)
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }
}
