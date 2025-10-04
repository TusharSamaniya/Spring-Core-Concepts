package com.tushar.comp;

public class Physics extends Student{
	
	private String Teacher;
	private int Price;
	
	public Physics(String name, int duration, Course course, String Teacher, int Price) {
		super(name, duration, course);
		System.out.println("Physics::5-parametrized constructor");
		this.Teacher = Teacher;
		this.Price = Price;
	}

	@Override
	public String toString() {
		return "Physics [Teacher=" + Teacher + ", Price=" + Price + "] -->" + super.toString();
	}
	
	

}
