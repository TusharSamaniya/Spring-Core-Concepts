package com.tushar.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {	

	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}

	@Override
	public String deliever(int oId) {
		
		return " order id" + oId + " order is set for deliver using DTDC Courier Service";
	}
	
	

}
