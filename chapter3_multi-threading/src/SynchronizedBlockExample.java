class SharedResource {
    private int counter = 0;

    public void increment() {
        // Non-critical section
        //other logics

        synchronized(this){
            // Critical section
            counter++;
            System.out.println(Thread.currentThread().getName() + " - Incremented Counter: " + counter);
        }

        // Non-critical section
        //other logics
    }

    public int getCounter() {
        return counter;
    }
}

class IncrementThreadForBlock extends Thread {
    private SharedResource sharedResource;

    public IncrementThreadForBlock(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.increment();
        }
    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();

        // Create two threads and pass the same instance of SharedResource to both
        IncrementThreadForBlock thread1 = new IncrementThreadForBlock(sharedResource);
        IncrementThreadForBlock thread2 = new IncrementThreadForBlock(sharedResource);

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        thread1.join();
        thread2.join();

        // Display the final counter value
        System.out.println("Final Counter Value: " + sharedResource.getCounter());
    }
}
