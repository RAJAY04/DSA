public class Palindrome2 {
    public static void main(String[] args) {
        String s = "abaaac";
//check if a string is palindrome with or without removing at most 1 character
        System.out.println(validPalindrome(s));
    }
//we are following a two pointer approach here
    public static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
        }return true;
    }

    public static boolean isPalindrome(String s,int start , int end) {
        while(start<= end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }return true;
    }
}
