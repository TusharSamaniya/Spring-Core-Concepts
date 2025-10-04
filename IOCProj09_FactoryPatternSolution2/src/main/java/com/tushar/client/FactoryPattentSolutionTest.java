package com.tushar.client;

import com.tushar.comp.Student;
import com.tushar.factory.StudentFactory;

public class FactoryPattentSolutionTest {

	public static void main(String[] args) {
		Student s1 = StudentFactory.getInstance("math");
		System.out.println(s1);
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Student s2 = StudentFactory.getInstance("chem");
		System.out.println(s2);
	}

}
