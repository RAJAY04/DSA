package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        //all there ref variables are pointing to just one same object
        //here there is no way we can call a constructor and thus no new obj can be created
    }
}
