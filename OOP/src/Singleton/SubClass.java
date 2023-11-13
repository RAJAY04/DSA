package Singleton;

import AccessControls.A;
//this is a example to elaborate use of protected members inside a differnt package

public class SubClass extends A {

    public SubClass(int num, String name) {//this is a constructor
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(43,"ajay");


        int n = obj.num;//we can see that when the reference variable and the constructor is of the type A class
        /*
        we cant access num , but when the obj is of the type SubClass we can access it even though its outside
        the package and protected

        note.txt: we can access protected data in different package only when we are accessing it with a subclass ,
        not evn the class itself

        Because the class A does not know who is inheriting it but the SubClass knows about A , A does
        not know that its been used inside a subclass as it dosent even have a idea about the existance
        of the subclass hence we cant use A
        */

    }

    class SubSubClass extends SubClass{

        public SubSubClass(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            SubClass obj = new SubClass(43,"ajay");
            int n = obj.num;//here we can access it as its a subclass of subclass
        }
    }

    class SubClass2 extends A{
        /*
        note.txt that SubClass has no idea about SubClass2 as it extends from A . when the time SubClass
        will be executing , the SubClass2 may not even have been written and hence S2 will be confused
        who changed its internal members as both dont have idea about each other
        */

        protected SubClass2(int num, String name) {
            super(num, name);
        }

        public static void main(String[] args) {
            SubClass obj1 = new SubClass(43,"ajay");
            int n = obj1.num;//here we can access it as its a subclass of subclass
        }
    }

}
