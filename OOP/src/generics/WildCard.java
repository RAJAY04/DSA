package generics;

import java.util.Arrays;
import java.util.List;

//https://docs.oracle.com/javase/tutorial/java/generics/types.html generics doccumentaion
//CustomGenericArrayList
public class WildCard<T extends Number> {


    public void get(List<? extends Number> list){//now we can pass numbers and its subclass
// this is called wild card
        // public void get(List<Number> list) here yoy can only pass Number type

    }
    //here T should either be of Number of subclass of NUmber type
    //now lets create our own arraylist
   private Object[] data;//we want it to be modified only via methods, hence private
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
//checkig of generics happens as compile time and object creation at runtime
    //public CustomGenericArrayList() {
      //  this.data = new T[DEFAULT_SIZE];//in byte code during runtime if we dont know the value of T
        //wdk what object to create for this , we make use of object type now

    //since objext is the main one we can caste to that type , even internal arraylist utilises this
   // }
    public WildCard() {
        this.data = new Object[DEFAULT_SIZE];

    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy the old items
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];//here in bigger(less restricted) type we are adding smaller(more restricted)
            // type that fine and we are not casting it
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;//initially we have made size of data = DEFAULT_SIZE
        //hence this equality works
    }

    public T remove(){
        T removed = (T)(data[--size]);//here in more restricted type we are adding less restricted, hence type caste
        return removed; //when we decrease the size the index value decreases but the element is not
        //removed , it will be overriten when we add the item in case
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index , T value){
        data[index] = value;//no required casting again
    }

    @Override
    public String toString() {//alt+insert ->toString()
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       WildCard<Integer> list = new WildCard<>();
        for (int i = 0; i < 15; i++) {
            list.add(2 * i);
        }
        System.out.println(list);

    }
}
