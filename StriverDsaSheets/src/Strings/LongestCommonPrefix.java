package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
            String[] strs = {"flower", "foul", "flight"};
//        Output: "fl"
            System.out.println(longestCommonPrefix(strs));
        }

        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String s1 = strs[0];
            String s2 = strs[strs.length-1];
            int idx = 0;
            while(idx < s1.length() && idx < s2.length()){
                if(s1.charAt(idx) == s2.charAt(idx)){
                    idx++;
                } else {
                    break;
                }
            }
            return s1.substring(0, idx);
        }
        //Checking only the first and last string is sufficient because any common prefix shared by
    // all strings must be a prefix of both the first and last strings.

    //this code takes advantage of the fact that the longest common prefix among all strings
    // in the array must start with the first string and end with the last string, making it
    // unnecessary to compare all the strings in the array individually.
}
