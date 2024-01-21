package multithreading.runnable_interface;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class RunnableInterfaceExample {

    public static void main(String args[]) {
        MyRunnable myRunnable = new MyRunnable();

        // Create two threads and pass the same instance of MyRunnable to both
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        // Start both threads
        thread1.start();
        thread2.start();
    }
}


