//target class
package com.tushar.comps;

public abstract class Person {
	private String name;
	private String aadrs;
	private AadharDetails aadhar;
	
	public Person(String name, String aadrs, AadharDetails aadhar) {
		System.out.println("Person.Person()");
		this.name = name;
		this.aadrs = aadrs;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", aadrs=" + aadrs + ", aadhar=" + aadhar + "]";
	}
	
	
}
