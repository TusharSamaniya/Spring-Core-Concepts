package com.tushar.client;

import com.tushar.comp.Course;
import com.tushar.comp.Maths;
import com.tushar.comp.Physics;
import com.tushar.comp.Student;

public class FactoryPattentProblemTest {

	public static void main(String[] args) {
		Course c1 = new Course(88824156L, 15, "Online");
		Student s1 = new Maths("Raju", 3, c1, "Priyanka", 2000);
		System.out.println(s1);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		Course c2 = new Course(9811601127L, 28, "Offline");
		Student s2 = new Physics("Prince", 1, c1, "Namo", 1000);
		System.out.println(s2);
	}

}
