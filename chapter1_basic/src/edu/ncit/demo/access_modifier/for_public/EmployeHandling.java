package edu.ncit.demo.access_modifier.for_public;

class Employee {
    public String empId;
    public String empName;
    public String education;
}

public class EmployeHandling {
    public static void main(String args[]) {
            Employee emp= new Employee();
            emp.education="BCA";
        System.out.println("eduction"+ emp.education);
        System.out.println("id"+emp.empId);

    }
}
