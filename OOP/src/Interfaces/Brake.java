package Interfaces;

public interface Brake {
    void brake();
    //void start();//even though the start already exist in other interface , it dosent matter
    //because we define the body of the abstract class while calling it
//hence it dosent matter which one is being overridden , even though it was possible in abstract classes
    //but here multiple inheritance is allowed
}
