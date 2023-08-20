public class MakeStringSubsequence {
    public static void main(String[] args) {
        //String str1 = "dpcoxkxuxgusju", str2 = "lqduoshhjkcgoq";
        String str1 = "zc", str2 = "ad";
        // Output: true
        System.out.println(canMakeSubsequence(str1,str2));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }
        int j = 0, i = 0;
        while (i < str1.length()) {
            if (str1.charAt(i) >= 'a' && str1.charAt(i) < 'z') {
                if (str1.charAt(i) == str2.charAt(j) || (str1.charAt(i) + 1 == str2.charAt(j))) {
                    j++;
                    i = 0;
                }
            } else {
                if (str1.charAt(i) == str2.charAt(j) || 'a' == str2.charAt(j)){
                    j++;
                    i = 0;
                }
            }i++;
        } return j == str2.length();
    }
}
