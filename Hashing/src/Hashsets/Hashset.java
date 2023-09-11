package Hashsets;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        //there is no guarantee that the elements will be in the order in which we added them
        //cant add duplicate values


//search operations/contains operation
        set.contains(1); //true
        if (set.contains(1)) {
            System.out.println("1 is in the set");
        }
        if (!set.contains(4)) {
            System.out.println("4 is not in the set");
        }


        //deleting
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("1 is not in the set as we removed it earlier");
        }


        //size of the set
        System.out.println("size of the set is: " + set.size());

        //print all elements
        System.out.println(set);


        //we know that we cant have any index of the elements in the set, hence we cant iterate over it
        //normally,hence we try out import java.util.Iterator;
        //we can use the iterator to iterate over the set
        Iterator it = set.iterator();
        //hasNext() returns true if there is a next element in the set
        //next() returns the next element in the set

        while (it.hasNext()) {
            System.out.println(it.next());
            //we dont have to update the iterator as it automatically updates itself
        }
    }


}
