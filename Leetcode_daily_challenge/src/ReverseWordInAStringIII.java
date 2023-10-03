public class ReverseWordInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
//        Output: "s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s) {
        //this is my solution with tc O(N^2)
        StringBuilder sb = new StringBuilder();
        int i = 0 , j;
        int n = s.length();
        while(i < n){
            if(s.charAt(i) != ' '){
                i++;
            }else{
                j = i - 1;
                i++;
                while(j >= 0 && s.charAt(j) != ' ' ){
                    sb.append(s.charAt(j--));
                }sb.append(' ');
            }
        }i--;
        while( i >= 0 && s.charAt(i) != ' '){
            //add s.charAt(i) != ' ' after i >= 0 because s.charAt(i) will give error before checking 2nd condnm
            sb.append(s.charAt(i--));
        }
        return sb.toString();
    }

    public static String reverseWords1(String s) {
        //this is a leetcode soln with tc O(N)
        int l = 0, r = 0, n = s.length();
        char[] c = s.toCharArray();
        for (int i = 0; i < n; i++) {
            // looking for the space index
            if (c[i] == ' ' || i == n - 1) {
                // r is the index before the space
                // if s[i] is space, then we want to reverse s[l : i - 1]
                // if s[i] is the last character, then we want to reverse s[l : i]
                r = i == n - 1 ? i : i - 1;
                // swap the character
                // e.g. s = `Let's` where l is 0 and r is 4
                // Let's -> set'L -> s'teL
                while (l < r) {
                    char tmp = c[l];
                    c[l] = c[r];
                    c[r] = tmp;
                    l++;
                    r--;
                }
                // update left pointer which is i + 1
                // i.e. the first index of the next word if applicable
                l = i + 1;
            }
        }
        return new String(c);
    }
}
