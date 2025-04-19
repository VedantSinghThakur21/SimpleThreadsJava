package threads;

// Thread to print numbers from 1 to 5
public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        // Printing numbers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Pause for half second
            } catch (InterruptedException e) {
                System.out.println("Number thread interrupted");
            }
        }
    }
}
