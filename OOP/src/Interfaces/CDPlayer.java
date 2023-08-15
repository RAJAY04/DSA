package Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("media start");
    }

    @Override
    public void stop() {
        System.out.println("media stop");
    }
}
