package com.tushar.comps;

public class Customer extends Person{
	
	private double billAmt;
	private String txId;

	public Customer(String name, String aadrs, AadharDetails aadhar, double billAmt, String txId) {
		super(name, aadrs, aadhar);
		System.out.println("Customer::5-param constructor");
		this.billAmt = billAmt;
		this.txId = txId;
	}

	@Override
	public String toString() {
		return "Customer [Bill Amount=" + billAmt + ", Transation Id=" + txId + "] ---> " + super.toString();
	}
	
	

}
