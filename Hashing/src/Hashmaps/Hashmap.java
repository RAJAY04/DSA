package Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        //creating a hashmap
        //country ( key ) : population ( value )
        HashMap <String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 135);
        map.put("China", 200);
        map.put("USA", 30);
        System.out.println(map);
        //these are unorder and there is no guarantee that the elements will be in the order in which we added them
        map.put("China", 150);
        //if we try to add a duplicate key, then the value of the key is updated
        System.out.println(map);


        //search operations/contains operation
        if(map.containsKey("India")){
            System.out.println("India is present in the map");
        }else {
            System.out.println("India is not present in the map");
        }


        map.get("India");//key exist case
        map.get("Sweden");//key does not exist case
        //if the key does not exist, then it returns null



//iterators
        for(Map.Entry<String,Integer> ele : map.entrySet()){
            //entrySet() returns a set of all the key value pairs
            System.out.println(ele.getKey() + " : " + ele.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " : " + map.get(key));
        }

        //now to remove an element from the hashmap
        map.remove("China");
        System.out.println(map);

    }
}
