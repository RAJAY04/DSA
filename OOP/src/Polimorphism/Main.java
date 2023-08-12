package Polimorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes square1 = new Square();//it will have access to the one in the object as called by the constructor



        // Shapes square1 = new Square(); what it is able to access is defined by the type of the reference ,
        //which one its going to access is defined by the type of the object, hence if the Shapes class must
        //contain method area , else it will give error, but it access the object of the Square class

        //when both the type of reference variable and the object are of the same class , then there is no
        //issue and confusion it runs normally
        //but the confusion arises when the type of the reference variable is of the parent class and
        //type of the object is of the subclass

        //the child class defines which one to run and the reference type defines which one to access
        //How java determines this?-> Dynamic method dispatch:mechanism through which a call to an overriden
        //method is resolved at runtime rather than compile time and hence the polymorphism is called
        //dynamic or runtime polimorphism


        //summary of Shapes square1 = new Square(); polymorphism concept
        //in the Shapes i.e parent class if we remove the method area() it gives error because
        //the reference varible is of type Shapes and it will access whatever its accessible in shapes
        //Shapes has no idea what is below it in the child class, but which one to access is determined by
        //java during runtime and obviously the child class method will be accessed due to overriding



        shape.area();
        square.area();
        circle.area();
    }
}



//gpt elaboration
//Polymorphism and Method Inheritance: When you declare a reference variable of the parent class
// (Parent in this case) and instantiate it with an object of the child class (Child), you are
// using a fundamental principle of object-oriented programming called polymorphism. This allows
// you to treat objects of different classes that share a common parent class as instances of that
// parent class.
//
//Method Access through Inheritance: Since the child class Child extends the parent class Parent,
// it inherits all the methods and attributes of the parent class. This includes methods that are
// defined in the parent class. When you create an instance of Child and assign it to a Parent
// reference, you can still access the methods that are inherited from the parent class.
//
//Method Overriding: If the method exists in the parent class and is also overridden in the child
// class, the version of the method in the child class will be executed. This means that even
// though you have a reference of type Parent, if the Child class overrides a method from the
// Parent class, the overridden method in the Child class will be invoked when you call that
// method through the reference.