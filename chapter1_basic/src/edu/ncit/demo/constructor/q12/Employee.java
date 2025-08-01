package edu.ncit.demo.constructor.q12;

public class Employee {
    String name;
    int employeeId;
    float salary;

    public Employee(){// default constructor, nor-arg constructor

    }
    public Employee(String name,int employeeId,float salary){ //parameteraized constructor
        this.name=name;
        this.employeeId=employeeId;
        this.salary=salary;
    }
    public void raiseSalary(float incrementPercentage){
        this.salary+=(float) (this.salary*0.10);//fixed 10%
        //this.salary=(float) (this.salary*incrementPercentage);
    }
    public void displaySalary(){
        System.out.println("Raised salary::"+this.salary);
    }
    public static void main(String args[]){
        Employee kabita= new Employee("Kabita Shrestha",1,1000f);
        // object is created , with intialized through constructor
        kabita.raiseSalary((10/100)); // this method will raise the salary
        kabita.displaySalary(); // it will display
    }
}
