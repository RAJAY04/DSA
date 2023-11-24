import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator extends Thread {
    public static int number = 0;
    private int iterations;

    public RandomNumberGenerator(int iterations) {
        this.iterations = iterations;
    }

    public void run() {
        Random rand = new Random();
        for (int i = 0; i < iterations; i++) {
            number = rand.nextInt(100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquarePrinter extends Thread {
    private int iterations;

    public SquarePrinter(int iterations) {
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Square of " + RandomNumberGenerator.number + " is " + RandomNumberGenerator.number * RandomNumberGenerator.number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubePrinter extends Thread {
    private int iterations;

    public CubePrinter(int iterations) {
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Cube of " + RandomNumberGenerator.number + " is " + RandomNumberGenerator.number * RandomNumberGenerator.number * RandomNumberGenerator.number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int iterations = scanner.nextInt();

        RandomNumberGenerator t1 = new RandomNumberGenerator(iterations);
        SquarePrinter t2 = new SquarePrinter(iterations);
        CubePrinter t3 = new CubePrinter(iterations);

        t1.start();
        t2.start();
        t3.start();

        scanner.close();
    }
}
