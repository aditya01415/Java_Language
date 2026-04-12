// Task 1: Runnable implementation for Thread 1
class MyTask1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                // Pause thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle thread interruption
                System.out.println(e);
            }
        }
    }
}

// Task 2: Runnable implementation for Thread 2
class MyTask2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                // Pause thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle thread interruption
                System.out.println(e);
            }
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {

        // Create instances of both tasks
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();

        // Create threads and assign tasks
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start both threads (run concurrently)
        t1.start();
        t2.start();
    }
}

