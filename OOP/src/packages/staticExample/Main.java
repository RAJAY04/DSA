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
    }
}
