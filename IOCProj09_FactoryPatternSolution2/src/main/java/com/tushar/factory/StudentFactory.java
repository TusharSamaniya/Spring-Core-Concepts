package com.tushar.factory;

import com.tushar.comp.Chemistry;
import com.tushar.comp.Course;
import com.tushar.comp.Maths;
import com.tushar.comp.Physics;
import com.tushar.comp.Student;

public class StudentFactory {
	
	public static Student getInstance(String studentChoice) {
		Student st = null;
		if(studentChoice.equalsIgnoreCase("phy")) {
			Course c1 = new Course(8882418916L, 21, "Online");
			st = new Physics("Rohit", 1, c1, "Namo", 1000);
		}else if(studentChoice.equalsIgnoreCase("chem")) {
			Course c2 = new Course(8700712372L, 31, "Online");
			st = new Chemistry("Pinki", 2, c2, "Monica", 2000);
		}else if(studentChoice.equalsIgnoreCase("math")) {
			Course c2 = new Course(9811601127L, 15, "Offline");
			st = new Maths("Gaurav", 2, c2, "Ashiah", 4000);
		}else {
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return st;
	}

}
