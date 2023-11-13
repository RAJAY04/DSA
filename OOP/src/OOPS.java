
public class OOPS {
    public static void main(String[] args) {
        Student ajay = new Student();//Student() is a constructor
        /*
construction defines what happens when the object will be created
        ajay.rollNo=41;
        ajay.name= "ajay";
        ajay.marks=10;
if there are n objects then we need to initialise all the n objects and hence to avoid that
we are doing that work inside a constructor which will do the work for all objects created
*/
        System.out.println(ajay.rollNo);
        System.out.println(ajay.name);
        System.out.println(ajay.marks);



        ajay.greeting();//check name before using changeName method
        ajay.changeName("vijay");
        ajay.greeting();//check name after using changeName method



        Student kunal = new Student( 40 , 34f,"kunal");
        System.out.println(kunal.rollNo);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);



        //passing a object inside constructor
        Student random = new Student(kunal);
        System.out.println(random.name);



        //checking a constructor calling another constructor
        Student random2 = new Student();
        System.out.println(random2.name);



        //we see below how two names point to the same object
        Student one = new Student();
        Student two = one;
        one.name="something something";
        System.out.println(two.name);
        //we can see that changes made via one will effect two and vice versa
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
        /*
        we need a way to add values of the above properties object by object
        hence we need one word to access every object
        */


        //lets say we want to create another constructor that takes value from another object
        Student(Student other){
            this.name = other.name;//other will be replaced by the object we pass
            this.rollNo = other.rollNo;
            this.marks = other.marks;
        }

        /*
        note.txt: if we dont specify any constructor at all then java has a default constructor that sets
        the default value ,eg null
                Student(){//dosent take arguments and sets all values of objects created as defined below
                    this.name="ajay";
                    this.marks=10;
                    this.rollNo=41;
        the this keyword is used for any object we create , eg if we create a object named ajay
        then the this is replaced by ajay and all the initialisation takes place
        we see that both the constructors have the same name hence depending on if you pass the
        arguments or not it will call the constructor respectively this is called constructor overloading
        */


        Student() {
            //internally its : Student( 0,100f,"Default");
            this (0,100f,"Default");
        }//this means the constructor which is calling here , in this case
        //this is getting replaced with Student() with specified arguments




        //            rollNo = rollNo;
//            marks = marks;this keyword basically means what object you are reffering to
//            name = name; this gives error when name is same hence we can use this keyword here
        Student(int rollNo , float marks , String name){
            this.rollNo = rollNo;
            this.marks = marks;
            this.name = name;
            /*
            this is the correct way of initialising objects , we can create as much objects we want
            by passing the arguments as specified in the constructor body
            we can see that when we have changed the argument name slightly now it works
            hence the conclusion is better use this keyword , as it work even if the name is same;
            */
        }
    }

