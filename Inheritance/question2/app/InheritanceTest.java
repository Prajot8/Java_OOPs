package com.faith.app;

import com.faith.bean.Instructor;
import com.faith.bean.Student;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Student stu1= new Student("Dipak", 2002, "Maths");
		System.out.println(stu1);
		
		Instructor instructor= new Instructor("Dilip",1990,12000.00);
		System.out.println(instructor);
	}

}
