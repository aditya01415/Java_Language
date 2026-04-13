public class EvenOddThreads {

    private static int counter = 1;
    private static final Object lock = new Object(); // Lock object for synchronization

    // Thread to print even numbers every 2 seconds
    static class EvenThread implements Runnable {
        @Override
        public void run() {
            int evenNumber = 2;
            while (true) {
                System.out.println("[Even Thread] Even number: " + evenNumber);
                evenNumber += 2; // Move to next even number
                try {
                    Thread.sleep(2000); // Wait 2 seconds before next print
                } catch (InterruptedException e) {
                    // Thread interrupted, stop execution
                    System.out.println("[Even Thread] Interrupted.");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    // Thread to print odd numbers every 5 seconds
    static class OddThread implements Runnable {
        @Override
        public void run() {
            int oddNumber = 1;
            while (true) {
                System.out.println("[Odd Thread]  Odd number:  " + oddNumber);
                oddNumber += 2; // Move to next odd number
                try {
                    Thread.sleep(5000); // Wait 5 seconds before next print
                } catch (InterruptedException e) {
                    // Thread interrupted, stop execution
                    System.out.println("[Odd Thread] Interrupted.");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Create even and odd threads with names
        Thread evenThread = new Thread(new EvenThread(), "Even");
        Thread oddThread  = new Thread(new OddThread(),  "Odd");

        System.out.println("Starting Even Thread (prints every 2 seconds)...");
        System.out.println("Starting Odd Thread  (prints every 5 seconds)...");

        // Start both threads
        evenThread.start();
        oddThread.start();

        try {
            // Main thread waits 20 seconds before stopping both threads
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Interrupt both threads after 20 seconds to stop them
        System.out.println("Stopping threads after 20 seconds...");
        evenThread.interrupt();
        oddThread.interrupt();
    }
}
