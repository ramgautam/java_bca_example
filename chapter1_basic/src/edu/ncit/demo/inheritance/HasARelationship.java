package edu.ncit.demo.inheritance;

public class HasARelationship {

	public static void main(String[] args) {
	
		Address pAddress= new Address(10,10,"NY",100,"USA");
		Address tempAddress= new Address(20,20,"NEVADA",200,"USA");
		Address birthAddress= new Address(30,30,"ALABAMA",300,"USA");
		
		Employee1 hari= new Employee1(10, "Hari", pAddress, tempAddress, birthAddress);
		
		hari.displayEmployees();

	}

}

class Employee1 {
	
	int id;
	String name;
	Address permanentAddress;
	Address temporaryAddress;
	Address birthPlaceAddress;
	
	Employee1(int rollNumber, String fullName, Address pAddress, Address tempAddress, Address bAddress){
		id=rollNumber;
		name=fullName;
		permanentAddress=pAddress;
		temporaryAddress=tempAddress;
		birthPlaceAddress=bAddress;
	}
	
void displayEmployees() {
	System.out.println("employee Name::"+ name);
}
	
	
}

class Address{
	int houseNo;
	int blockNo;
	String state;
	int zipCode;
	String country;
	
	Address(int houseNumber, int blockNumber,String stateOfAddress, int zip,String countries){
		houseNo=houseNumber;
		blockNo=blockNumber;
		state=stateOfAddress;
		 zipCode=zip;
		country=countries;
	}
}