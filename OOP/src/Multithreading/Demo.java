package Multithreading;
//
//class A implements Runnable{
//    public void run() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("hi");
//            try {
//                Thread.sleep(1000);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//            }
//    }
//}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class Demo {
    public static void main(String[] args) {
//        Runnable obj1 = new A();
        Runnable obj1 = new Runnable() {//anonimus class can be used when no class A
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable obj2 = new B();

        //we have to give reference Runnbale and not class cz Thread has no idea about A or B
//        Thread t1 = new Thread();
//        Thread t2 = new Thread();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
//        System.out.println(obj1.getPriority());
//        obj1.setPriority(10);
//        System.out.println(obj1.getPriority());

    }

}
