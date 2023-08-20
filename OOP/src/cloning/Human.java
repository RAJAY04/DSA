package cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3};
    }

//    public Human(Human other){
//        this.name = other.name;
//        this.age = other.age;
//
//    }
    public Object clone() throws CloneNotSupportedException{
        //this is shallow copy
        return super.clone();//this throws some exception hence we should sepecify that above
    }
    //if we dont implement the clonable interface it will generate CloneNotSupportedException

    //even though the clonable interface dn have any abstract method its just telling jvm that we are
    //using the clone in the object of type human
}
