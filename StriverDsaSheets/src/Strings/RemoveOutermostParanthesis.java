package Strings;

public class RemoveOutermostParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
//        Output: "()()()()(())"
        System.out.println(removeOuterParentheses(s));
    }

    //this is mine solution nearly equal to other solution
    public static String removeOuterParentheses(String s) {
        if(s.length() <= 2 )return "";
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && counter == 0) {
                counter++;
            }else if (s.charAt(i) == '(' && counter > 0) {
                sb.append('(');
                counter++;
            } else if (s.charAt(i) == ')' && counter == 1) {
                counter--;
            } else if (s.charAt(i) == ')' && counter > 1) {
                counter--;
                sb.append(')');
            }
        }
        return sb.toString();
    }


    //this is leetcode copied solution
    public String removeOuterParentheses1(String s) {
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        int openLeft = 0;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }
}
