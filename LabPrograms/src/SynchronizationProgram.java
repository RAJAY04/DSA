class Printer {
    synchronized void printMessage(String message) {
        System.out.print("[");
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.print(message);
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("]");
    }
}

class ThreadDemo extends Thread {
    String message;
    Printer printer;

    ThreadDemo(String message, Printer printer) {
        this.message = message;
        this.printer = printer;
    }

    public void run() {
        printer.printMessage(message);
    }
}

public class SynchronizationProgram {
    public static void main(String[] args) {
        // Create an instance of the Printer class
        Printer printer = new Printer();

        // Create instances of ThreadDemo and start threads
        ThreadDemo thread1 = new ThreadDemo("Learn", printer);
        thread1.start();

        ThreadDemo thread2 = new ThreadDemo("Java", printer);
        thread2.start();

        ThreadDemo thread3 = new ThreadDemo("Programming", printer);
        thread3.start();
    }

}
