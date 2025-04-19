package threads;

// Thread to print characters A to E
public class PrintCharacters implements Runnable {

    // Override the run() method to define the thread's task
    @Override
    public void run() {
        // Loop through characters from 'A' to 'E'
        for (char c = 'A'; c <= 'E'; c++) {
            // Print the current character
            System.out.println("Character: " + c);
            try {
                // Pause the thread for 600 milliseconds
                Thread.sleep(600);
            } catch (InterruptedException e) {
                // Handle the exception if thread execution is interrupted
                System.out.println("Character thread interrupted");
            }
        }
    }
}
