package packages.staticExample;

public class Human {
        int age;
        String name;
        int salary;
        boolean married;
//        int population; if we dont declare this as static population will be different for all humans
    static int population;
//when a member is declared as static it can be accessed before any of the objects are created and
    //without even refernecing to that object
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;// wkt population is not at all related to object and hence we made it static
        //soo we dont use this keyword here , bcz this refers to object and hence we use classname.population

    //even if we use this. it works , it searches for population variable in object but when it dosent find it
        //there it searches in class template. instead just use class name as its convention
        //it will directly update population value inside the class when we use Human. rather than
        //searching in object propery first and then updating in class template
    }

    static void fun(){//this is not dependent on objects
        greeeting();//you cant use this becasue it requires an instance
        //but the function you are using this in does not depend on instance
    }
    void greeeting(){//we know that something that is not static belongs to an object

    }
}
