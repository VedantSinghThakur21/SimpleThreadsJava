package threads;

// Thread to print characters A to E
public class PrintCharacters implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Character: " + c);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Character thread interrupted");
            }
        }
    }
}
