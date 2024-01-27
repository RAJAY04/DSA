import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    static List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);

        System.out.println("Generated Parentheses for n = " + n + ":");
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static List<String> generateParenthesis(int n) {
        int l = 0, r = 0;
        backtrack(n, l, r, new StringBuilder());
        return res;
    }

    public static void backtrack(int n, int l, int r, StringBuilder sb) {
        if (n == r && r == l) {
            res.add(sb.toString());
            return;
        }
        if (l < n) {
            sb.append("(");
            backtrack(n, l + 1, r, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(r < l){
            sb.append(")");
            backtrack(n, l, r + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
