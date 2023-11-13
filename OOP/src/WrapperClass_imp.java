public class WrapperClass_imp {
    public static void main(String[] args) {
        //wkt in java there is no pass by reference in primitives
        int x = 10;
        //we see that when we do a. we can see any methods available because its not a object
        Integer A = 20;//starting from java 11 we cant do Integer A = new Integer(20);
        // we can do
//        Integer A = Integer.valueOf(20); but no need
        //but here when we do A. we can see that there are lots of methods available as now
        //it has become a object

        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+" "+b);//we can see that its still not swapped
        //it is just passing the value and its getting swapped inside the function , the
        //original one dosent get effected as its a primitive and not a object
        //soo what if we make a object using Integer wrapper class?
        //even then it wont swap because Integer is final


        //use of final
//        final int INCREASE = 1;//by convention make it all caps if its final
//        INCREASE = 2; this gives error


       final A kunal = new A("new object");
        System.out.println(kunal.name);
       kunal.name = " other name";
/*
        when a non primitive is final you cannot resign it , but you can change the value
        final basically means the reference to the object will always be pointing to it
        but it is possible that the value of the object may be modified
               kunal = new A("new object");
        */
        System.out.println(kunal.name);



        //finalizer
        A obj;
        //soo many objets are created and we know only one object and point 1 reference variable
        for (int i = 0; i < 1000000; i++) {//note.txt that for small number of objects it dosent destroy
            obj = new A("i am a object");
        }

    }
    static void swap( int a , int b){
        int temp = a ;
        a = b;
        b = temp;
    }

}
class A{
    final int num = 10;
    String name;

    public A(String name){// this is a constructor
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        //we cant control the destruction of the objects , but we can tell java to do something when
        //it automatically destroys the object
        System.out.println("Object has been destroyed");
    }

}
