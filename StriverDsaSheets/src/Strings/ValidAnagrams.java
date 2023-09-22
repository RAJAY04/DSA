package Strings;

import java.util.Arrays;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s = "rat", t = "car";
//        Output: false
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        //here we are just using 1 array instead of 2
        if(s.length() != t.length())return false;
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i] != 0)return false;
        }
        return true;
    }
    public static boolean isAnagram1(String s, String t) {
        if(s.length() != t.length())return false;
        int n = s.length();
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for (int i = 0; i < n; i++) {
            arr1[s.charAt(i)]++;
            arr2[t.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if(arr1[i] != arr2[i])return false;
        }
        return true;

    }
}
