package Polimorphism;

public class Circle extends Shapes{

@Override//this gives error if the below method is not overriding , it is an annotation
    void area(){
        //this will run when the obj of Circle class is created
        //hence it is overriding the parent method
        System.out.println("area is pi * r * r");
    }
}
