package Inheritance;

public class Box {
    double l ;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
//lets say you want to make a cube when passing a side length
    Box(double side){

        //super();//it dosent give error because its refering to the object class,internal implementation of java says
        //Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
