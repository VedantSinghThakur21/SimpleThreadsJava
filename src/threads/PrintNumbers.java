package threads;

// Thread to print numbers from 1 to 5
public class PrintNumbers implements Runnable {

    // Override the run() method to define the thread's task
    @Override
    public void run() {
        // Loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print the current number
            System.out.println("Number: " + i);
            try {
                // Pause the thread for 500 milliseconds
                Thread.sleep(500); // Helps simulate thread activity
            } catch (InterruptedException e) {
                // Handle exception if thread execution is interrupted
                System.out.println("Number thread interrupted");
            }
        }
    }
}
