package Interfaces;

public class Main {
    public static void main(String[] args) {
        //Car car = new Car();
        //car.a;//can access
        //Engine car1 = new Car();//interface type reference variable
        //car1.a;// error, we cant access a because what we access depends on the type of reference variable

//        car.acc();
//        car.start();
//        car.stop();


       // Media carMedia = new Car();
        //carMedia.stop();//output = I stop engine
        //we can see that , when we tried to stop media , the engine stopped
        //its a bit of problem , lets see how to create seperate classes for interfaces

        NiceCar car = new NiceCar();
        car.start();//power engine start
        car.start_music();// media start
        car.UpgradeEngine();
        car.start();//  electric engine starts
    }
}
