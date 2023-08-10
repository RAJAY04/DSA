package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight (BoxWeight other ){
        super(other);
        weight = other.weight;//note that the other that we are passing above is a BoxWeight type
        //but the copy constructor that takes arguments is of the box type
        //even though the other is BoxWeight type but the reference type is of box hence it will have access
        //to box type as what is accessible depends on type of the reference variable

        //this is same concept as previous file
        //Box box5 = new BoxWeight(2,3,4,8);
        //        System.out.println(box5.w);
        //
        //        //there are many variables in bot child and parent classes
        //        //you are given access to the variables that are in the reference type i.e BoxWeight
        //        //hence you should have access to weight variable
        //        //this also means that ones you are trying to access should be initialised
        //        //but when the object is itself of type parent class, how will you call the constructor of child class
        //        //that is why gives error when we access weight
    }

    public BoxWeight(double l, double h, double w, double weight) {
        //note that if we dont call super(l, h, w); then the default super clss constructor will be called


         //even if any of the variable was private we can initialise but cant assess using . operator but we cant access
        //the reason we can initialise that is because the method below the constructor of the parent class
        super(l, h, w);//it is basically saying call the parent class constructor
        //used to initialise values present in parent class
        //this.weight = weight;
        //this.l=l;
       // super(l, h, w); it gives an error if u use it here as parent class dosent care about what
        //child class contains , but child class do care about parent class contents and hence
        //child class says hey , initialise the parent class contents first

        //super can be used to access super class variables instead of this keyword
        //say we have variables names weight in both child and super class
        //when we use super.variable it is explicitely specifing to super class weight variable and not the subclass variable
    }
}
