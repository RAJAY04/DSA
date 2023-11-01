package Multithreading;
class Counter{
    int count ;
    public synchronized void increment(){
        //synchronized wont allow other thread to use this fn while one thread is using it
        count++;
    }
}
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
       //now whats happening here is we wont get count as 2000
        //the main starts thread ans prints count asap
        //it dosent wait until the thread work is completed

        //so we can ask main until thread joins dont print count

        t1.join();
        t2.join();
        //it throws an exception so remeber to add that

        //still there is no guarantee that we ll get 2000 cz what if both the threads reach at the same time

        System.out.println(c.count);
    }
}
