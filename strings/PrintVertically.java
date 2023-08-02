import java.util.ArrayList;
import java.util.List;

public class PrintVertically {
    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";
        System.out.println(printVertically(s));
    }

    public static List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String[] words = s.split(" ");
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(word.length(), maxLength);
        }

        StringBuilder temp = new StringBuilder();
        for (int j = 0; j < maxLength; j++) {
            //the length of the ans array is equal to max length of the word
            temp.setLength(0); // Clear the StringBuilder for each column
            for (int i = 0; i < words.length; i++) {
                if (j < words[i].length()) {
                    temp.append(words[i].charAt(j));
                } else {
                    temp.append(" ");
                }
            }
            ans.add(remove(temp.toString()));//we could also use inbuilt function to remove trailing spaces
            //temp.toString().stripTrailing()
            //we need to remove all the trailing spaces that occur after the string
        }

        return ans;
    }
    // This method is used to remove trailing spaces..
    // The pointer iterates from end of the string unless it finishes the count of null spaces
    // and then creates a separate character array of length excluding the trailing spaces .
    public static String remove(String t){
        int ptr = t.length()-1;
        while(t.charAt(ptr) == ' '){
            ptr--;
        }//we get the index of first non space character form the end in the above loop
        char c[] = new char[ptr+1];//create a array of length after removing trailing spaces in end
        //store the original string in a array ch
        for(int i = 0; i < ptr+1 ; i++){//copy each character until the found index
            c[i] = t.charAt(i);
        }
        return String.valueOf(c);
    }
}
