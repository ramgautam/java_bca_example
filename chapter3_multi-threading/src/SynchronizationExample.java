/**
 * Counter is a simple class with a private counter variable. The increment and getCount methods are marked as synchronized to ensure atomicity when accessing and modifying the counter.
 *
 * IncrementThread is a thread class that increments the counter in a loop.
 *
 * In the SynchronizationExample class, two threads (thread1 and thread2) are created, both sharing the same Counter instance. The join method is used to wait for the threads to complete their execution.
 *
 * The increment method of the Counter class is marked as synchronized, preventing race conditions when multiple threads try to increment the counter simultaneously.
 *
 * The final result is printed, and due to synchronization, you should see a consistent and expected counter value, which is the sum of increments performed by both threads.
 *
 * Remember that synchronization should be used cautiously, as excessive synchronization can lead to performance issues. Additionally, other synchronization mechanisms such as locks and the java.util.concurrent package can be used for more complex scenarios.
 */

class Counter {

    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        System.out.println("in synchronized increment");
        System.out.println("before counter increment ::"+ count);
        count++;
    }

    // Synchronized method to get the current counter value
    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
