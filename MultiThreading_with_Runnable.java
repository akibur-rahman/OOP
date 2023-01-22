
class MyThreadRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread1");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread2");
        }
    }
}

public class MultiThreading_with_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable r = new MyThreadRunnable(); // creating object of MyThreadRunnable class
        MyThreadRunnable2 r2 = new MyThreadRunnable2(); // creating object of MyThreadRunnable2 class
        Thread t1 = new Thread(r); // Passing the object of MyThreadRunnable class
        Thread t2 = new Thread(r2); // Passing the object of MyThreadRunnable2 class
        t1.start();
        t2.start();
    }
}
