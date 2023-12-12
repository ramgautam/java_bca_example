package edu.ncit.demo.collection.list;





import java.util.ArrayList;
import java.util.List;





public class ListExample {

	public static void main(String[] args) {
		
		List<String> nameList= new ArrayList<String>();//
		
		nameList.add("Hari");//0
		nameList.add("Sita");//1
		nameList.add("shrestha");
		
		nameList.add(10+"");
		
		for(String name: nameList) {
			System.out.println("value from list"+ name);
		}
		
		
	
	

	}

}


