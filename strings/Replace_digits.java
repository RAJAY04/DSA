public class Replace_digits{
    public static void main(String[] args) {
        String s = "a1c1e1";
//        Output: "abcdef"
//        Explanation: The digits are replaced as follows:
//        - s[1] -> shift('a',1) = 'b'
//                - s[3] -> shift('c',1) = 'd'
//                - s[5] -> shift('e',1) = 'f'
        System.out.println(replaceDigits(s));
    }
    public static String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                ans.append(s.charAt(i));
            }else{
                ans.append((char)((s.charAt(i-1))+(s.charAt(i)-'0')));
            }
        }return ans.toString();
    }
}
