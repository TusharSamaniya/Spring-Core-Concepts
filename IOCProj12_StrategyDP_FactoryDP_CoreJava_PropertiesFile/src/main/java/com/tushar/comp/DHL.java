package com.tushar.comp;

public final class DHL implements Courier {	

	public DHL() {
		System.out.println("DHL:0-param constructor");
	}

	@Override
	public String deliever(int oId) {
		
		return " order id" + oId + " order is set for deliver using DHL Courier Service";
	}
	
	

}
