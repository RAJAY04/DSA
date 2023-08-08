package packages.a;

import static packages.b.Message.message;
//due to package a and b we can now create two different classes with the same name, this is the use of packages
//packages are like container for classes it helps in keeping classname in compartment like structrue
public class Greeting {
    //here messages is a function thats inside other .java class and it can be used here due to the import statement
    public static void main(String[] args) {
        System.out.println("hello world");
        message();
    }
}
