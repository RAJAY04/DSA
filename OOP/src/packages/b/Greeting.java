package packages.b;

import static packages.b.Message.message;

public class Greeting {
    //here messages is a function thats inside other .java class and it can be used here due to the import statement
    public static void main(String[] args) {
        System.out.println("hello world");
        message();
    }
}
