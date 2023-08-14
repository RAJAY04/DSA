package AbstractDemo;
//final public abstract class Parent , gives as error because wkt abstract classes need to be overriddene
//and for that we need to extend it but final methods cannot be overridden and hence we cannot
//have a final abstract class


// public abstract class Parent , Parent 2{ , we still cant use multiple inheritance in abstract classes
//to resolve this we use interfaces
  public abstract class Parent {
    //we must declare a class as abstract if it contains one or more than one abstract method

    int age;//we can create variables in abstract classes
    final int VALUE;

    //abstract Parent(); you cant create objects of abstract classes , if you create objects and try to
    //access the abstract methods then it will give us error as there is no body and hence we cant
    //have abstract class objects and constructors


    //wkt abrstract methods must be overriden and static methods are the one which cannot be overridden
    //and hence we cant have abstract static methods

    static void hello(){//we are allowed to create static methods inside the abstract classes
        System.out.println("hello");//as static methods do not rely on the objects
    }

        void normal(){//abstract classes can contain normal methods , these are gonna behave normally
            System.out.println("this is a normal method");//can even override this method if needed
        }


    public Parent(int age) {//we can create constructor of an abstract class
        this.age = age;
        VALUE = 324234;//even though we cant create a object to call a constructor , we initialise a
        //constructor and use super keyword to reference to it
    }

    abstract void carrier();
    abstract void partner();
}
