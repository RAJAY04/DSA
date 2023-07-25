import java.util.ArrayList;
import java.util.List;

public class SplitString {
    public static void main(String[] args) {
        List<String> stringList = List.of("stars.bars.$");
        char separator = '.';
        System.out.println(splitWordsBySeparator(stringList, separator));
//Input: words = ["one.two.three","four.five","six"], separator = "."
//Output: ["one","two","three","four","five","six"]
//Explanation: In this example we split as follows:
//
//"one.two.three" splits into "one", "two", "three"
//"four.five" splits into "four", "five"
//"six" splits into "six"
//
//Hence, the resulting array is ["one","two","three","four","five","six"].
//Example 2:
//Example 3:
//
//Input: words = ["|||"], separator = "|"
//Output: []
//Explanation: In this example the resulting split of "|||" will contain only empty strings, so we return an empty array []
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for (String i : words) {
            StringBuilder word = new StringBuilder();
            for(char j : i.toCharArray()){
                char currentChar = j;
                if (currentChar == separator && j != 0) {
                    if (word.length() > 0) {
                        ans.add(word.toString());
                    }
                    word = new StringBuilder();
                } else if (currentChar >= 'a' && currentChar <= 'z'|| currentChar!=separator) {
                    word.append(currentChar);
                }
            }
            if (word.length() > 0) {
                ans.add(word.toString());
            }
        }
        return ans;
        }
    }
