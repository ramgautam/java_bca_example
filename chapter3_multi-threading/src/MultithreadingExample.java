class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("name:::"+Thread.currentThread().getName()+"::"+Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class MultithreadingExample {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        System.out.println("my thread created::" + t1.getName() );
        t1.start(); // Start the first thread

        MyThread t2 = new MyThread();
        System.out.println("my thread created::" + t2.getName() );
        t2.start(); // Start the second thread
    }
}
