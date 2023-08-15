package Interfaces;

public class Car implements Engine,Brake,Media{
    //there are abstract methods and hence we need to implement those below

    int a = 30;
    @Override
    public void brake() {
        System.out.println("I brake");

    }

    @Override
    public void start() {
        System.out.println("I start engine ");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate");
    }
}
