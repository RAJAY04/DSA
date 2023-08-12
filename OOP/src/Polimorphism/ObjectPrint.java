package Polimorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override//this tosString method is overriding the internal method
    public String toString() {//at runtime it determines this function should be run
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
        //we have not told java to print any attribute of the object so java will do something on its own
        //println takes an obj inside it and it will call the value of funtion and further it calls toString
        //ie obj.toString , but when out obj dosent have any toString method ,
        // we know that every class is inherited from a object class in java (extends Object) by default
        // so it calls is own toString method of object class
    }
}
