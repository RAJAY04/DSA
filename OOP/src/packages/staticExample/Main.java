package packages.staticExample;

public class Main {
    public static void main(String[] args) {
        Human ajay = new Human(19,"Ajay prabhu",1000000,false);
        Human vjay = new Human(19,"Vjay prabhu",100000,false);
        System.out.println(ajay.population);//here we are trying to access a static variable via object
        System.out.println(vjay.population);//hence it is showing warning
        System.out.println(Human.population);//here we see that warning are removed
        System.out.println(Human.population);//hence always use class name when we perform any
        //kind of operations on static variable , its by convention
        //now it shows 2 as the output after we made population as static , else it would have given 1


        Main funn = new Main();
        funn.fun2();//greeting method will be a part of funn bcz its inside fun2
    }

    void fun2() {
        //wkt every thing that you write will be called inside a static method in the end (PSVM)
        greeting();//here it wont give an error as it goes inside main and object will be created
    }

    static void fun(){//this is not dependent on objects
        // greeting();//gives error,you cant use this becasue it requires an instance
        //but the function you are using this in does not depend on instance

        //you cant use non static stuff without referencing their instances in a static context
        //hence below i am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){//we know that something that is not static belongs to an object
        //fun();//having a static member inside non static is completely fine
        System.out.println("hello world");
    }
}
