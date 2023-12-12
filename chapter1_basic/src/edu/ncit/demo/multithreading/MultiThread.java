package edu.ncit.demo.multithreading;

public class MultiThread {

	public static void main(String[] args) {

		System.out.println("Hello");
		Task taskRunner = new Task(); // compilation error?

		taskRunner.start();

	}
}

//
class Task extends Thread {
	
		public void run() {
			for (int a = 1; a < 1000; a++) 
				System.out.println("Numbers " + a);
			try {
				
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		public void eat() {
			System.out.println("We all like to eat dont we?");
		}
	}


