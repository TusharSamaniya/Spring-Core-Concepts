package com.tushar.client;

import com.tushar.comps.AadharDetails;
import com.tushar.comps.Employee;
import com.tushar.comps.Person;
import com.tushar.comps.Student;

public class FactoryPattternProblemTest {
	
	public static void main(String[] args) {
		AadharDetails details = new AadharDetails(956114926006L, 21, 8882418916L); //depedent class object
		Person st = new Student("Tushar", "Delhi", details, 139, "Java"); //target class object
		System.out.println(st);
		
		System.out.println("--------------------------------------");
		
		AadharDetails details1 = new AadharDetails(956114926007L, 24, 88825488916L); //depedent class object
		Person st2 = new Employee("Raju", "Hyd", details1, 10001, "Softwere Engineer"); //target class object
		System.out.println(st2);
		
	}

}
