package edu.ncit.demo.multithreading;

public class MultiThreadingDemo extends Thread {
	
	  public void run(){ 
		  //
		    System.out.println("My thread is in running state.");  
		  }   
		  public static void main(String args[]){  
			  MultiThreadingDemo obj=new MultiThreadingDemo();   
		     obj.start();
		     System.out.println(obj.getName());
		  }  

}
