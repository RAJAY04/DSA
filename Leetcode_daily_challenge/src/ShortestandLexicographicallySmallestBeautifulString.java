public class ShortestandLexicographicallySmallestBeautifulString {
    //its not perfect solution as it just finds the smallest beautiful string and not
    //lexiographically smallest so find the solution
    public static void main(String[] args) {
//        String s = "100011001";
        String s = "001110101101101111";
        int k = 10;
//        Output: "11001"
//        Explanation: There are 7 beautiful substrings in this example:
//        1. The substring "100011001".
//        2. The substring "100011001".
//        3. The substring "100011001".
//        4. The substring "100011001".
//        5. The substring "100011001".
//        6. The substring "100011001".
//        7. The substring "100011001".
//                The length of the shortest beautiful substring is 5.
//        The lexicographically smallest beautiful substring with length 5 is the substring "11001".
        System.out.println(shortestBeautifulSubstring(s, k));
    }
//we are solving this question using slinding window technique
    public static String shortestBeautifulSubstring(String s, int k) {
        int i = 0;
        int onesCount = 0;
        int minLen = Integer.MAX_VALUE;
        String result = "";

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '1') {
                onesCount++;
            }

            while (onesCount >= k) {
                if (j - i + 1 < minLen) {
                    String temp = s.substring(i, j + 1);
                    if (result.isEmpty() || temp.compareTo(result) < 0) {
                        result = temp;
                    }
                    minLen = j - i + 1;
                }

                if (s.charAt(i) == '1') {
                    onesCount--;
                }

                i++;
            }
        }

        return result;
    }

}
