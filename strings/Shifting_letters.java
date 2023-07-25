public class Shifting_letters {
    public static void main(String[] args) {
        String s = "bad";
        int[] shifts = {10,20,30};
//        Output: "rpl" note that i have changed the input later
//        Explanation: We start with "abc".
//                After shifting the first 1 letters of s by 3, we have "dbc".
//                After shifting the first 2 letters of s by 5, we have "igc".
//                After shifting the first 3 letters of s by 9, we have "rpl", the answer.
        System.out.println(shiftingLetters(s,shifts));
    }
    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder ans = new StringBuilder(s);
        int shift = 0;
        for (int i = s.length()-1; i >=0 ;i--){
            shift+=shifts[i]%26;
            ans.setCharAt(i,(char)(((s.charAt(i)-'a')+shift)%26+'a'));
            }
        return ans .toString();
    }
}




//    StringBuilder ans = new StringBuilder(s);//using to store the final ans
////as s.length() == shifts.length , considering both is one and the same
//        for (int i = 0; i <= shifts.length-1; i++) {
//                //outer loop to iterate through the array(shifts) items
//                String temp_str = "";//creating a empty string to hold value after completing each ith iteration
//                for (int j = 0; j <= shifts.length-1; j++) {
//                if ((ans.charAt(j) + shifts[i]) >= 123 && j<=i) {//case to handle if the element exceeds z then we need to start from a
//                int temp= Math.abs(shifts[i]-26);//making sure that temp wont be negative
//                temp_str += (char) (ans.charAt(j) + temp);
//                }else if(j <= i) {
//                temp_str += (char) (ans.charAt(j) + shifts[i]);
//                }
//                else  temp_str += (char) ans.charAt(j);//default case when we dont have to apply the shifts
//                }
//                ans.replace(0,s.length(),temp_str);
//                //we make sure we replace the ans after each iteration to avoid concatenation of the string
//                }return ans.toString();