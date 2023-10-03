package Strings;

import java.util.Arrays;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "cccaaa";
//        Output: "aaaccc"
//        Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//                Note that "cacaca" is incorrect, as the same characters must be together.
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        // freq array to store frequency of each character
        int[] freq = new int[256];

        // build up freq array
        for(char c : s.toCharArray()){
            freq[c]++;
        }

        // ans array to store result
        char[] ans = new char[s.length()];

        int idx = 0; // index for ans array

        // while ans array not filled up
        while(idx < s.length()){

            // find current max frequency char
            int max = 0;
            int maxIdx = 0;
            for(int i = 0 ; i < 256 ; i++){
                if(freq[i] > max){
                    max = freq[i];
                    maxIdx = i;
                }
            }

            // append max char to ans array
            // decrement freq count
            while(freq[maxIdx] > 0){
                ans[idx++] = (char)maxIdx;
                freq[maxIdx]--;
            }
        }

        return new String(ans);
    }
}
