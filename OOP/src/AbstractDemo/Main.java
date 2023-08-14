package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(28);
        son.carrier();

        Daughter daughter = new Daughter(30);
        daughter.carrier();

        //Parent mom = new Parent() ; error ,you can create objects of an abstract class
        //it asks us to ovveride the abstract methods when we create an object

        Parent.hello();//totally fine
        son.normal();//this too is fine and behaves normally

        Parent obj = new Daughter(34);
    //even though you cannot create objects of the parent class , you can use it as reference varialbes
        //same concept as we have learnt , what it accesses depends on parent and which one is being
        //accessed at run time depends on daughter class
    }
}
