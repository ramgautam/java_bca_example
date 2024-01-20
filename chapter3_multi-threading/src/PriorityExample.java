class PriorityThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class PriorityExample {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.setPriority(Thread.MIN_PRIORITY); // Set priority to the minimum
        t1.start();

        MyThread t2 = new MyThread();
        t2.setPriority(Thread.MAX_PRIORITY); // Set priority to the maximum
        t2.start();
    }
}
