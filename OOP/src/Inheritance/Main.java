package Inheritance;

public class Main {
    public static void main(String[] args) {
        //Box box = new Box(2,2,2);//search for a constructor that takes 3 arguments and initialise objects
        //Box box1 = new Box(box);//searches for a box that takes another box

        //System.out.println(box1.l+" "+box1.h+" "+box1.w);//is l or any other variable was private
        // then we could only acces it in its folder

        //note that parent class cant access the members of the child class
        //Box box3 = new BoxWeight();
        //it is the type of reference varialbe that determines what members can be accessed and
        //not the type of the object
        //here box3 can only access Box variables and not BoxWeight variabele
        //box3.weight gives an error as it cant access
        //in other words
        //when a reference to subclass object is assigned to superclass reference variable you can
        //only acces the variables of the super class(Box)


        //Box box5 = new BoxWeight(2,3,4,8);
        //System.out.println(box5.w);

        //there are many variables in bot child and parent classes
        //you are given access to the variables that are in the reference type i.e BoxWeight
        //hence you should have access to weight variable
        //this also means that ones you are trying to access should be initialised
        //but when the object is itself of type parent class, how will you call the constructor of child class
        //that is why gives error
//        BoxWeight box4 = new Box();
//        System.out.println(box4);


        //multilevel inheritance
        BoxWeight box = new BoxPrice(5,8,200);
        //BoxPrice constructor is called that takes 3 args,then it will go above and above
    }
}
