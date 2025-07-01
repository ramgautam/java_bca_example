package edu.ncit.demo.constructor;

class Employee {
    int id;
    String name;
    float salary;
    boolean isFullTime;
    //Default Constructor
    Employee(){
        isFullTime=true;// default intialize
    }
    //Parameterized constructor
    public Employee(int id, String name, float salary, boolean isFullTime) {
        this.id = id;
        this.name = name;
        this.isFullTime=false;
    }
}

public class EmployeeHandling {
    public static void main(String[] args) {
        System.out.println("before constructor");
        Employee employee= new Employee();
        System.out.println("after constructor");
        Employee employee1= new Employee(10,"test_name",10000,true);
        System.out.printf(""+ employee.id);

    }

}
