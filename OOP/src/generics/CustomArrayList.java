package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    //now lets create our own arraylist
   private int[] data;//we want it to be modified only via methods, hence private
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        //copy the old items
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;//initially we have made size of data = DEFAULT_SIZE
        //hence this equality works
    }

    public int remove(){
        int removed = data[--size];
        return removed; //when we decrease the size the index value decreases but the element is not
        //removed , it will be overriten when we add the item in case
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index , int value){
        data[index] = value;
    }

    @Override
    public String toString() {//alt+insert ->toString()
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //ArrayList list = new ArrayList<>();//inbuilt array list as wk
        //wkt how a arraylist works , it doubles the size of the arraylist when we exceed the
        //size and copy the existing elements to doubles list
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
   //     System.out.println(list);//we print it in object way as we have overriden toString above
        for (int i = 1; i < 12; i++) {
            list.add(i);
        }
        System.out.println(list);

        //now the problem with our custom arraylist is that we are only able to operate on
        //integer items , whereas inbuilt arraylist gives all data types
        ArrayList<Integer> list2 = new ArrayList<>();//<Integer> these are generics which help
        //us specify the type of data item
    }
}
