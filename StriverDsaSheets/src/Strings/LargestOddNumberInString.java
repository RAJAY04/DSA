package Strings;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "10133890";
//        Output: "1013389"
//        note that we have to return largest valued odd integer
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        //we get the largest odd number when we check of the odd digit from the end , dosent matter
        //what is the first digit
        for (int i = num.length() -1; i >= 0 ; i--) {
            if((num.charAt(i) - '0')%2 != 0){
                return num.substring(0,i + 1);
            }
            //Since substring(beginIndex, endIndex) returns the substring from beginIndex to endIndex - 1,
            // we need to pass i + 1 as the endIndex to include the odd digit itself.
        }return "";
    }
}
