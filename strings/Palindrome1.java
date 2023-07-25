public class Palindrome1 {
    public static void main(String[] args) {
        String s = "0A0";
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                ans.append((char)(s.charAt(i)+32));
            }else if (s.charAt(i)>=97 && s.charAt(i)<=122) {
                ans.append(s.charAt(i));
            }else if( s.charAt(i)>=48 && s.charAt(i)<=57){
                ans.append(s.charAt(i));
            }

        }//dont compare string builder directly to string convert them to any one type
        String original = ans.toString();
        String reversed = ans.reverse().toString();
        System.out.println(original);
        System.out.println(reversed);
            return original.equals(reversed);
    }}

//    public boolean isPalindrome(String s) { two pointer approach
//        if (s.isEmpty()) {
//            return true;
//        }
//        int start = 0;
//        int last = s.length() - 1;
//        while(start <= last) {
//            char currFirst = s.charAt(start);
//            char currLast = s.charAt(last);
//            if (!Character.isLetterOrDigit(currFirst )) {
//                start++;
//            } else if(!Character.isLetterOrDigit(currLast)) {
//                last--;
//            } else {
//                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
//                    return false;
//                }
//                start++;
//                last--;
//            }
//        }
//        return true;
//    }
