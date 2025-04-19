package threads;

// Thread to print a message five times
public class PrintMessage implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message: Hello from Thread " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Message thread interrupted");
            }
        }
    }
}
