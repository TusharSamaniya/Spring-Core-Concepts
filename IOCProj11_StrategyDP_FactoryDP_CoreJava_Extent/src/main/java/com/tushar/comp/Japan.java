package com.tushar.comp;

public final class Japan implements Engine {
		

	public Japan() {
		System.out.println("BluePrint::Method called");	
	}

	@Override
	public String EngineType(int power) {
		System.out.println("Japan.EngineType()");
		return "Engine power is: " + power + " is build by the Japan Company";
	}

}
