package edu.ncit.demo.accessmodifier;

public class ClassWIthPrivateConstructor {
	
	private String name;
	private int id;
	
//	private ClassWIthPrivateConstructor() {
//		id=0;
//		name="";
//	}
	
	public void intializePrivateDataMember() {
		this.id=10;
		this.name="20";
		
	}
	
	public void displayPrivateDataMember() {
		System.out.println("name"+name);
		System.out.println("id"+id);
		
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
