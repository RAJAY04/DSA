package AbstractDemo;

public class Daughter extends Parent{
    //child class must override the abstract methods else it gives error as the abstract method body will
    //be empty in the parent class

    public Daughter(int age) {
        this.age = age;
    }
    @Override
    void carrier() {
        System.out.println("I am going to be a coder");

    }

    @Override
    void partner() {
        System.out.println("I love iron man");

    }
}
