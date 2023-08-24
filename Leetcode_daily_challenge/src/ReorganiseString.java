public class ReorganiseString {
    public static void main(String[] args) {
        // rearrange the characters of s so that any two adjacent characters are not the same.
        //Return any possible rearrangement of s or return "" if not possible.
        String s = "aaaabc";
        System.out.println(reorganizeString(s));
    }
    public static String reorganizeString(String s) {
        int [] freq = new int[26]; //to Store Frequency of each alphabet
        char [] arr = s.toCharArray();

        for(int i = 0;i<arr.length;i++){  //store the frequency
            freq[arr[i] - 'a']++;
        }

        int max = 0,letter = 0;

        for(int i = 0;i<26;i++){  //find the max frequency
            if(freq[i] > max){
                max = freq[i];
                letter = i;
            }
        }

        if(max > (s.length() + 1)/2) return ""; //if max is more than half then not possible

        int idx = 0;
        char [] res = new char[s.length()];

        while(freq[letter] > 0){   //distribute the max freq char into even indices
            res[idx] = (char)(letter + 'a');
            idx += 2;
            freq[letter]--;
        }

        for(int i = 0;i<26;i++){
            while(freq[i] > 0){
                if(idx >= s.length()) idx = 1; //all even indices filled, so switch to odd indices
                //if suppose the majority ele does not fill all the even places then its getting filled
                //by other minority elements, then when all the even index are filled it starts filling
                //the odd elements and hence the if statement is necessary and you cannot do idx= 1 before
                //the for loop
                res[idx] = (char)(i + 'a');
                idx += 2;
                freq[i]--;
            }

        }

        return String.valueOf(res);
    }
}
