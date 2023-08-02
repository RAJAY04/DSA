
public class Main {
    public static void main(String[] args) {
        Student ajay = new Student();//Student() is a constructor
        //construction defines what happens when the object will be created
//        ajay.rollNo=41;
//        ajay.name= "ajay";
//        ajay.marks=10;
        //if there are n objects then we need to initialise all the n objects and hence to avoid that
        //we are doing that work inside a constructor which will do the work for all objects created
        System.out.println(ajay.rollNo);
        System.out.println(ajay.name);
        System.out.println(ajay.marks);
        ajay.greeting();
        ajay.changeName("vijay");
        ajay.greeting();


        Student kunal = new Student( 40 , 34f,"kunal");
        System.out.println(kunal.rollNo);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        }
}
    class Student{
        int rollNo = 38;//default value;
        String name;
        float marks;

        void greeting(){//this is a function
            System.out.println("hello my name is "+this.name);//it will assume this keyword is present even if we dont specify
        }
        void changeName(String newName){//this is a function
            name = newName;
        }
        //we need a way to add values of the above properties object by object
        //hence we need one word to access every object

        Student(){
            this.name="ajay";
            this.marks=10;
            this.rollNo=41;
            //the this keyword is used for any object we create , eg if we create a object named ajay
            //then the this is replaced by ajay and all the initialisation takes place
        }
        //we see that both the constructors have the same name hence depending on if you pass the
        //arguments or not it will call the constructor respectiveely this is called constructor overloading
        Student(int rollNo , float marks , String name){
//            rollNo = rollNo;
//            marks = marks;
//            name = name; this gives error when name is same hence we can use this keyword here
            this.rollNo = rollNo;
            this.marks = marks;
            this.name = name;
//we can see that when we have changed the argument name slightly now it works
//hence the conclusion is better use this keyword , as it work even if the name is same;
        }
    }

