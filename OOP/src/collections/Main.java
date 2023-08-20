package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //we can see that List extends collection, collections is basically set of common methods that are
        //used by different data structures by extending it
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> vector= new Vector<>();
        //same methods availble even in vector as it extends collection , just multiple threads cant access
        //vector objects at the same time , its synchronised and slower than arraylist which is unsynchronised

        list.add(43);
        list.add(41);
        list1.add(44);
        list1.add(42);
        System.out.println(list1);
        System.out.println(list);
        //we can see that List is a parent and object is of type child
    }
}
