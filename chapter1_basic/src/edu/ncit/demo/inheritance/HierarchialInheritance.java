package edu.ncit.demo.inheritance;

public class HierarchialInheritance {

	public static void main(String args[]) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		//c.bark();//C.T.Error  
		
		//Cat catNew= new Animal();
		
	
	
			
	}

}

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {//writing. - 
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("meowing...");
	}
}



