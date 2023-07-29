public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
        System.out.println(lengthOfLongestSubstring(s));
    }
    //using hashmap will greatly reduce the time complexity , this has very bad time complexity
    //we use 2 pointer approach to track the substring
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        } else if (s.length()==1) {
            return 1;
        }
        int length = 1;
        int i = 0;
        int j = 1;
        while( j < s.length()){
            int temp = j-1;
            boolean check = true;
            while(temp >= i) {
                if (s.charAt(temp) == s.charAt(j)) {
                    check = false;
                }
                temp--;
            }if(check){
                j++;
                length =Math.max(length,j-i);
            }else{
                i++;
                length =Math.max(length,j-i);
            }
        }return length;
    }
}
