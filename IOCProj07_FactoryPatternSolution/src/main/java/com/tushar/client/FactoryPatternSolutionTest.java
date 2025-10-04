package com.tushar.client;

import com.tushar.comps.AadharDetails;
import com.tushar.comps.Employee;
import com.tushar.comps.Person;
import com.tushar.comps.Student;
import com.tushar.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	
	public static void main(String[] args) {
		Person per1 = PersonFactory.getInstance("std");
		System.out.println(per1);
		
		System.out.println("--------------------------------------");
		
		Person per2 = PersonFactory.getInstance("emp");
		System.out.println(per2);
		
	}

}
