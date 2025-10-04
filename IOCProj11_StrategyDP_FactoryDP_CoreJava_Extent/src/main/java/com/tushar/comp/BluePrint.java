package com.tushar.comp;

public final class BluePrint implements Engine {
		

	public BluePrint() {
		System.out.println("BluePrint::Method called");	
	}

	@Override
	public String EngineType(int power) {
		System.out.println("BluePrint.EngineType()");
		return "Engine power is: " + power + " is build by the BluePrint Company";
	}

}
