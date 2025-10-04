package com.tushar.factory;

import com.tushar.comps.AadharDetails;
import com.tushar.comps.Customer;
import com.tushar.comps.Employee;
import com.tushar.comps.Person;
import com.tushar.comps.Student;

//factory pattern class
public class PersonFactory {
	
	//static factory method creating and returning one of th person sub class object
	//this method contains factory pattern logic
	public static Person getInstance(String personType) {
		//depedent class object
		Person per = null;
		if(personType.equalsIgnoreCase("std")) {
			AadharDetails details1 = new AadharDetails(956114926006L, 25, 8882418916L);
			per = new Student("Tushar", "Delhi", details1, 139, "Java");
		}else if(personType.equalsIgnoreCase("emp")) {
			AadharDetails details2 = new AadharDetails(9865326006L, 75, 74125418916L);
			per = new Employee("Jaju", "Hyd", details2, 139, "Softwere Engineer");
		}else if(personType.equalsIgnoreCase("cust")) {
			AadharDetails details3 = new AadharDetails(123654789L, 45, 12365418916L);
			per = new Customer("Jaju", "Hyd", details3, 4000, "101tushar136");
		}else{
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return per;
	}
	

}
