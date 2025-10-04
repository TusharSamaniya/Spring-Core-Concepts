package com.tushar.factory;

import com.tushar.comp.BlueDart;
import com.tushar.comp.Courier;
import com.tushar.comp.DHL;
import com.tushar.comp.DTDC;
import com.tushar.comp.Flipkart;

public class FlipkartFactory {
	
	//static factory method having logic to create Flipkart object having the given courier object
	public static Flipkart getInstance(String courierType) {
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}else if(courierType.equalsIgnoreCase("dhl")) {
			courier = new DHL();
		}else if(courierType.equalsIgnoreCase("blue")) {
			courier = new BlueDart();
		}else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		
		//create target class object
		Flipkart fpkt = new Flipkart();
		
		//assigning dependent class object to target class object
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
