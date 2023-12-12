package edu.ncit.demo.collection;

import java.util.Date;

public class ObjectArrayHandling {
	public static void main(String args[]) {

	int [] marks= new int[100];	
	Bicycle[] bicycles = new Bicycle[3]; // Data structure and collection mechanism

	//List bicycleList = new ArrayList<String>();
	
	
	

		
	// creating object using new keyword
	Bicycle ramCycle = new Bicycle();// object declaration and initialization
	Bicycle pukarCycle = new Bicycle();
	Bicycle abhishek = new Bicycle //paramerterarized constructor
                     ("test",
                     "Abhishek",
                     "ring10",
                     "Cube",
                     new Date());// object declaration
	
	
	// for Ram
		ramCycle.setCycleOwnwer("Ram");
		ramCycle.setCycleVendor("Giant");
		ramCycle.setManufacturateDate(new Date());

		// for pukar
		pukarCycle.setCycleOwnwer("Pukar");
		pukarCycle.setCycleVendor("Hero");
		pukarCycle.setManufacturateDate(new Date());
		

		
	bicycles[0]=ramCycle;
	bicycles[1]=pukarCycle;
	bicycles[2]=abhishek;
	
	Object [] bicyclesObject= new Object[100];
	bicyclesObject[0]=ramCycle;
	bicyclesObject[1]=pukarCycle;
	bicyclesObject[2]=abhishek;


	
	
	
// inforamation getting of Ram
	System.out.println("Cycle vendor::"+ramCycle.getCycleVendor());
	System.out.println("cycle product date::"+ramCycle.getManufacturateDate());

	// information getting of pukar
	System.out.println("Cycle vendor::"+pukarCycle.getCycleVendor());
	System.out.println("cycle product date::"+pukarCycle.getManufacturateDate());
	
	
	System.out.println("Using loop and arrays");


	//normal for loop.
	for( int index =0; index<bicycles.length; index ++) {
		System.out.println("Using for loop, Bicycle owners::"+ bicycles[index].getCycleOwnwer());
		System.out.println("Cycle vendor::"+bicycles[index].getCycleVendor());
	}
	
	bicycles[2].getCycleOwnwer();


	// using for each
	System.out.println("Using for each loop ");
	for(Bicycle bicycle: bicycles) {
		System.out.println("Using for loop, Bicycle owners::"+ bicycle.getCycleOwnwer());
		System.out.println("Cycle vendor::"+bicycle.getCycleVendor());
	}
	

}}