/*
Name: Vedant Singh Thakur
PRN: 23070126144
Batch: B3
*/

package threads;

public class Main {
    public static void main(String[] args) {
        // Creating instances of thread classes
        Thread t1 = new Thread(new PrintNumbers()); // Thread to print numbers from 1 to 5
        Thread t2 = new Thread(new PrintCharacters()); // Thread to print characters A to E
        Thread t3 = new Thread(new PrintMessage());  // Thread to print a message five times

        // Starting threads
        t1.start(); // Starts number printing thread
        t2.start(); // Starts character printing thread
        t3.start(); // Starts message printing thread
    }
}
