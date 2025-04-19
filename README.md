# Java Threads Demonstration 🚀

This project demonstrates the working of Java threads using multiple classes that implement the Runnable interface. Each class performs a distinct task and runs concurrently to showcase multithreading.

👨‍💻 Student Details
- Name: Vedant Singh Thakur
- PRN: 23070126144
- Batch: B3

--- 

📂 Project Structure
Java-Threads-Demo/
├── Main.java                   // Starts all threads
├── threads/
│   ├── PrintNumbers.java       // Prints numbers from 1 to 5
│   ├── PrintCharacters.java    // Prints characters A to E
│   └── PrintMessage.java       // Prints a message five times
└── README.md                   // Documentation

---

## Thread Classes

### 1. `PrintNumbers.java`
- **Functionality**: Prints numbers from 1 to 5 with a delay of 500 milliseconds between each.
- **Purpose**: Demonstrates basic multithreading for numerical output.

### 2. `PrintCharacters.java`
- **Functionality**: Prints characters from A to E with a delay of 600 milliseconds between each.
- **Purpose**: Illustrates character-based output with multithreading.

### 3. `PrintMessage.java`
- **Functionality**: Prints a custom message ("Hello from Thread") five times with a delay of 700 milliseconds between each print.
- **Purpose**: Demonstrates repetitive message output using threads.

### 4. `Main.java`
- **Functionality**: The main entry point of the program. Creates and starts threads for `PrintNumbers`, `PrintCharacters`, and `PrintMessage`.
- **Purpose**: Demonstrates how to initialize and manage multiple threads in parallel.

## Learning Outcomes
- Understand the creation and execution of threads using the `Runnable` interface.
- Gain experience in managing thread behavior using `Thread.sleep()` and handling interruptions.
- Learn how to execute multiple tasks concurrently in Java.

---

## Usage Instructions

To run the program, ensure you have Java installed and the directory structure is maintained. You can either use an IDE like IntelliJ IDEA or Eclipse, or you can compile and run the program using the following commands in your terminal:

```bash
javac threads/*.java Main.java
java threads.Main
