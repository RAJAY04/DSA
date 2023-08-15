package Interfaces;

public class NiceCar{
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void start_music() {
        player.start();//we can see problem solved now , now we dont say engine.start and no confusion
        //when we create seperate classes for interfaces
    }

    public void stop_music(){
        player.stop();
    }

    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }


}
