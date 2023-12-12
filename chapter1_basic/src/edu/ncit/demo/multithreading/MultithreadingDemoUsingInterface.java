package edu.ncit.demo.multithreading;

public class MultithreadingDemoUsingInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("My thread is in running state."); 
		
	}
	
	public static void main(String args[]) {
		MultithreadingDemoUsingInterface mui = 
				new MultithreadingDemoUsingInterface();
		Thread threadObject = new Thread(mui);
		threadObject.start();
		
		
	} 

}
