package edu.ncit.demo.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetStudentHandling {

	public static void main(String[] args) {
		Student ramStudent= new Student("Ram", 01, "Computer Science");
		Student michealStudent= new Student("micheal", 01, "Economic Science");
		Student johnStudent= new Student("John", 02, "Economic Science");
		
		Set<Student> hash_Set = new HashSet<>();
		hash_Set.add(ramStudent);
		hash_Set.add(michealStudent);
		hash_Set.add(johnStudent);
		
		System.out.println(hash_Set);
		
		for(Student student: hash_Set) {
			System.out.println(student.getName());
		}

	}

}
