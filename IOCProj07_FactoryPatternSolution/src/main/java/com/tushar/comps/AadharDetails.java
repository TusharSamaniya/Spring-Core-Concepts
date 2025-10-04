//depedent class
package com.tushar.comps;

public class AadharDetails {
	
	private long aadharNo;
	private int age;
	private long mobileNo;
	
	//alt_shift+s, o
	public AadharDetails(long aadharNo, int age, long mobileNo) {
		System.out.println("AadharDetails.AadharDetails()");
		this.aadharNo = aadharNo;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	
	//alt+shift+s,s
	@Override
	public String toString() {
		return "AadgarDetails [aadharNo=" + aadharNo + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
