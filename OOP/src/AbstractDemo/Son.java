package AbstractDemo;

public class Son extends Parent{
//child class must override the abstract methods else it gives error as the abstract method body will
    //be empty in the parent class


    public Son(int age) {
        super(age);//it allowes to call the abstract class constructor using super keyword
    }

    @Override
    void carrier() {
        System.out.println("I am going to be a doctor");

    }

    @Override
    void partner() {
        System.out.println("I love black widow");

    }
}
