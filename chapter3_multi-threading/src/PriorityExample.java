class PriorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getId() +": thread Name "+Thread.currentThread().getName());
    }
}
public class PriorityExample {
    public static void main(String args[]) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        // Set priority to the minimum
        t2.setName("high priority thread");
        t1.setName("low priority thread");
        t2.setPriority(Thread.MAX_PRIORITY);  // Set priority to the maximum
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

    }
}