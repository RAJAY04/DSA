public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abaababaab";
        //Output: true
        System.out.println(repeatedSubstringPattern1(s));
    }

    public static boolean repeatedSubstringPattern1(String s) {
        //Time Complexity:
        //O(n) for concatenation and substring check.
        //Space Complexity:
        //O(n) for the concatenated string.
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }

    public static boolean repeatedSubstringPattern(String s) {
        //Time Complexity:
        //O(n^2)
        // ) as we are iterating over half the string and for each length, we are checking the entire string.
        //Space Complexity:
        //O(n) as we are constructing a repeated string of length n.
        if (s.length() == 0 || s.length() == 1) {
            return false;
        }
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int num_repeats = l / i;//number of repeated needed of the current substring to form the full string
                String sub_string = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < num_repeats; j++) {
                    sb.append(sub_string);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
        //The length of the repeating substring must be a divisor of the length of the input string
        //Search for all possible divisor of str.length, starting for length/2
        //If i is a divisor of length, repeat the substring from 0 to i the number of times i is contained in s.length
        //If the repeated substring is equals to the input str return true
    }
}

