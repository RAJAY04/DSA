import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        //in this code we use the sorted value of the string as the key as its unique for a anagrams
        //and arraylist for values
        //if in the begining our map dn containkey ,then we are creting a key value pair with an empty
        //arraylist , and then we just add into it
        if(strs == null || strs.length == 0)return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] ca =  s.toCharArray();
            Arrays.sort(ca);
            String key_str = String.valueOf(ca);
            if(!map.containsKey(key_str)){
                map.put(key_str,new ArrayList<>());
            }
            map.get(key_str).add(s);
        }
        return new ArrayList<>(map.values());
        //Runtime
        //Details
        //5ms
        //Beats 98.81%of users with Java
        //Memory
        //Details
        //46.87MB
        //Beats 54.05%of users with Java

        //time complexity of this code is O(n * k * log(k)), and the space complexity is O(n).
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {
        //here we use the String value of count array as key as its the unique character for anagrams
        //eg :eat " 10001000000000000001000000"
        Map<String,List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0)return new ArrayList<>();
        for(String s : strs){
            char[] ca = new char[26];
            for(char c : s.toCharArray()){
                ca[c - 'a']++;
            }
            String key_str = String.valueOf(ca);
            if(!map.containsKey(key_str))map.put(key_str,new ArrayList<>());
            map.get(key_str).add(s);
        }
        return new ArrayList<>(map.values());
        //6ms
        //Beats 72.52%of users with Java
        //Memory
        //Details
        //46.06MB
        //Beats 99.03%of users with Java

        //time complexity of this code is O(n * k), and the space complexity is O(n).

    }
}
