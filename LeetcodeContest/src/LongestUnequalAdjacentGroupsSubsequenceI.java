import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public static void main(String[] args) {
       int n = 4;
       String[] words = {"a","b","c","d"};
       int[] groups = {1,0,1,1};
//        Output: ["a","b","c"]
//        Explanation: A subsequence that can be selected is [0,1,2] because groups[0] != groups[1] and groups[1] != groups[2].
//                So, a valid answer is [words[0],words[1],words[2]] = ["a","b","c"].
//        Another subsequence that can be selected is [0,1,3] because groups[0] != groups[1] and groups[1] != groups[3].
//                This results in [words[0],words[1],words[3]] = ["a","b","d"].
//        It is also a valid answer.
//        It can be shown that the length of the longest subsequence of indices that satisfies the condition is 3.
        System.out.println(getWordsInLongestSubsequence(n,words,groups));
    }
    public static List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        List<Integer> subsequence = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i == 0 || groups[i] != groups[i - 1]) {
                int error = 0;
                if(i != 0 && words[i].length() == words[i - 1].length()){
                    for(int i = 0 ; i < words[i].length() ; i++){
                        if(words[i].charAt(i).equals(words[i - 1].charAt(i))){
                            continue;
                        }else error++;
                    }
                    if(error <= 0){
                        subsequence.add(i);
                    }
                }

            }
        }
        for (int index : subsequence) {
            result.add(words[index]);
        }

        return result;
    }
}
