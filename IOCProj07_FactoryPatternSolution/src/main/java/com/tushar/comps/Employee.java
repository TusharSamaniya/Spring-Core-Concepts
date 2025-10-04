package com.tushar.comps;

public class Employee extends Person{
	
	private int empId;
	private String desg;

	public Employee(String name, String aadrs, AadharDetails aadhar, int empId, String desg) {
		super(name, aadrs, aadhar);
		System.out.println("Employee::5-param constructor");
		this.empId = empId;
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", desg=" + desg + "] ---> " + super.toString();
	}
	
	

}
