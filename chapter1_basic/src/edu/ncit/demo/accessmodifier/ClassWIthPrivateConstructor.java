package edu.ncit.demo.accessmodifier;

public class ClassWIthPrivateConstructor {
	
	private String name;
	private int id;
	
	 ClassWIthPrivateConstructor() {
		id=0;
		name="";
		intializePrivateDataMember();
	}
	
	private void intializePrivateDataMember() {
		this.id=10;
		this.name="20";
		
	}
	
	public void displayPrivateDataMember() {
		 intializePrivateDataMember();
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
