package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human ajay = new Human(34,"ajay");
       // Human twin = new Human(ajay);
        //we r just creating the copy of the other but it takes time for processig as we are using new
        //keyword instead we can using new method of cloning
        //in java. lang package there is a interface called clonable we must implement that by the class
        //whose close we want to create


//note that when u use clone as it throws something u need to specify that
        Human twin = (Human) ajay.clone();//Casting: The reason you're seeing (Human)
        // in front of ajay.clone() is because the clone() method returns an Object type,
        // not necessarily a Human type. The clone() method is declared in the Object class,
        // and it returns an object of the same class as the object you're cloning.
        // Therefore, you need to explicitly cast the result of ajay.clone() to the Human type.
        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 200;
        System.out.println(Arrays.toString(ajay.arr));
        System.out.println(Arrays.toString(twin.arr));
        //ajay arr also changed

        //but when we made it as a deep copy twin changed but not ajay


    }
}
