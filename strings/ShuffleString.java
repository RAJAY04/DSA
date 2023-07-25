public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        System.out.println(restoreString(s,indices));
//        Output: "leetcode"
//        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
    } public static String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(indices[i]);
            ans.append(str);
        }return ans.toString();
    }
}
