package edu.ncit.demo.collection.set;

public class Student

{

	private String name;
    int rollNo;

	String department;

	public Student(String name, int rollNo, String department)

	{

		this.name = name;

		this.rollNo = rollNo;

		this.department = department;

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	
	@Override
	public int hashCode()

	{

		return rollNo;

	}

	@Override
	

	public boolean equals(Object obj)

	{

		Student student = (Student) obj;

		return (rollNo == student.rollNo);

	}

	@Override

	public String toString()

	{

		return rollNo + ", " + name + ", " + department;

	}

	
}
