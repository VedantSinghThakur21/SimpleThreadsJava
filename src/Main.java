/*
Name: Vedant Singh Thakur
PRN: 23070126144
Batch: B3
*/

package threads;

public class Main {
    public static void main(String[] args) {
        // Creating instances of thread classes
        Thread t1 = new Thread(new PrintNumbers());
        Thread t2 = new Thread(new PrintCharacters());
        Thread t3 = new Thread(new PrintMessage());

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
