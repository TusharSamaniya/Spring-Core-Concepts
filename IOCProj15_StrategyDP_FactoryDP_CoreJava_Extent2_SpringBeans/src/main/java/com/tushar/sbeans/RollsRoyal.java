package com.tushar.sbeans;

import org.springframework.stereotype.Component;

@Component("rolls")
public final class RollsRoyal implements Engine {	

	public RollsRoyal() {
		System.out.println("RollsRoyal::Method called");	
	}

	@Override
	public String EngineType(int power) {
		System.out.println("RollsRoyal.EngineType()");
		return "Engine power is: " + power + " is build by the RollsRoyal Company";
	}

}
