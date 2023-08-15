package ExtendInterfaces2;

public interface A {

    static void greeting(){
        System.out.println("hey i am static method");
    }
    default void fun(){//starting from jdk 8 we can have default implementation
        System.out.println("I am in A");
    }
}
