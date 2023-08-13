package Polimorphism;

public class Shapes {
    //public final class Shapes { if you do this it prevents inheritance and polymorphism
    //it is efficient as it saves time for the compiler to decide which call to resolve first
    //final methods cant be overridden and hence it should be resolved first

    //overriding happens during run time , java decides which one to resolve and
    // hence it is called late binding
    //however since the final method cant be overridden , call can be resolved during compile time
    //itself and its called early binding

    //note that if you declare a class as final , implicitly its methods will also be final

    void area(){
        System.out.println("I am in shapes");
    }
}
