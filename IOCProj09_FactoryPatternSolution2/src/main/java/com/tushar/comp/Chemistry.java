package com.tushar.comp;

public class Chemistry extends Student{
	
	private String Teacher;
	private int Price;
	
	public Chemistry(String name, int duration, Course course, String Teacher, int Price) {
		super(name, duration, course);
		System.out.println("Chemistry::5-parametrized constructor");
		this.Teacher = Teacher;
		this.Price = Price;
	}

	@Override
	public String toString() {
		return "Chemistry [Teacher=" + Teacher + ", Price=" + Price + "] -->" + super.toString();
	}
	
	

}
