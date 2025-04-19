package threads;

// Thread to print a message five times
public class PrintMessage implements Runnable {

    // Override the run() method to define the thread's task
    @Override
    public void run() {
        // Loop to print the message five times
        for (int i = 1; i <= 5; i++) {
            // Print the message along with the current count
            System.out.println("Message: Hello from Thread " + i);
            try {
                // Pause the thread for 700 milliseconds
                Thread.sleep(700);
            } catch (InterruptedException e) {
                // Handle the exception if thread execution is interrupted
                System.out.println("Message thread interrupted");
            }
        }
    }
}
