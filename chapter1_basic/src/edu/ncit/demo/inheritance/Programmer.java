package edu.ncit.demo.inheritance;

class Employee{  
	 float salary=40000; 
	 String name="Ram";
	 int age=25;
	public Employee(float salary, String name, int age) {
		this.salary = salary;
		this.name = name;
		this.age = age;
	}
	public Employee() {
		System.out.println("default Constructor employee");
	}
}
public class Programmer extends Employee{  
	 int bonus=10000;

	public Programmer(float salary, String name, int age) {
		super(salary, name, age);
	}
	public Programmer() {
		super();
		System.out.println("default Constructor programmer");
	}
	public static void main(String args[]){
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	} 
