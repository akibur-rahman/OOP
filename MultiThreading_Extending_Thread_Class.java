
class Thread1 extends Thread { // Extending Thread class
    public void run() { // Overriding run() method of Thread class
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread1: " + i); // printing the value of i
        }
    }
}

class Thread2 extends Thread { // Extending Thread class
    public void run() { // Overriding run() method of Thread class
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2: " + i);
        }
    }
}

public class MultiThreading_Extending_Thread_Class {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(); // Creating object of Thread1 class
        Thread2 t2 = new Thread2(); // Creating Object of Thread2 class
        t1.start(); // Starting the thread
        t2.start(); // Starting the thread
    }
}
