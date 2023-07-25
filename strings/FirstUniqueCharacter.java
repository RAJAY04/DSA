public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
//    Output: 0
        System.out.println(firstUniqChar2(s));
    }
    public static int firstUniqChar2(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;//stores the frequency of each alphabet
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;//check for the alphabet whose frequency is one and that occur first
        return -1;//TC->O(N) most efficient one among all the codes
    }
    public int firstUniqChar1(String s) {
        // Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
        //        O(N^2) nested loops, the indexOf and lastIndexOf hasO(N)which is nested inside for loop
        // SC ->O(1) constant variables are used

        //similar code
        // for(char c : s.toCharArray()){
        //            int index = s.indexOf(c);
        //            int lastIndex = s.lastIndexOf(c);
        //            if(index == lastIndex)
        //                return index;
        //        }
        //        return -1;
    }
    public static int firstUniqChar(String s) {
        //this is my solution
        int unique = -1;
        for (int i = 0; i < s.length(); i++) {
            boolean not_unique = true;
            unique =i;
            for (int j = 0; j < s.length(); j++) {
                if( i==j )continue;
                if(s.charAt(unique) == s.charAt(j)){
                    not_unique = false;
                    break;
                }
            }if( not_unique ) return unique;
            else if ( i == s.length()-1) {
                return -1;
            }
        }return unique;
//        TC -> O(N^2) nested loops
        //SC ->O(1) constant variables are used
    }
}
