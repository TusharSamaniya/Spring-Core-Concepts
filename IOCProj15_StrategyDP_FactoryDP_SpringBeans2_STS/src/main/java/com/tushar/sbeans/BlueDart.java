package com.tushar.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bDart")
@Primary
public final class BlueDart implements Courier {	

	public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}

	@Override
	public String deliever(int oId) {
		
		return " order id" + oId + " order is set for deliver using BlueDart Courier Service";
	}
	
	

}
