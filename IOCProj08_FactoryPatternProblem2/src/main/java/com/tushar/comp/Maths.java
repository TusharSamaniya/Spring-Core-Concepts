package com.tushar.comp;

public class Maths extends Student{
	
	private String Teacher;
	private int Price;
	
	public Maths(String name, int duration, Course course, String Teacher, int Price) {
		super(name, duration, course);
		System.out.println("Maths::5-parametrized constructor");
		this.Teacher = Teacher;
		this.Price = Price;
	}

	@Override
	public String toString() {
		return "Maths [Teacher=" + Teacher + ", Price=" + Price + "] -->" + super.toString();
	}
	
	

}
