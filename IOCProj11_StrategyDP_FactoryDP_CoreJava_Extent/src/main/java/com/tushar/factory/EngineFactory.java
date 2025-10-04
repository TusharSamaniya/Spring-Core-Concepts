package com.tushar.factory;

import com.tushar.comp.BluePrint;
import com.tushar.comp.Car;
import com.tushar.comp.Engine;
import com.tushar.comp.Japan;
import com.tushar.comp.RollsRoyal;

public class EngineFactory {
	
	public static Car getInstance(String msg) {
		Engine eng = null;
		if(msg.equalsIgnoreCase("blue")) {
			eng = new BluePrint();
		}else if(msg.equalsIgnoreCase("jap")) {
			eng = new Japan();
		}else if(msg.equalsIgnoreCase("rolls")) {
			eng = new RollsRoyal();
		}else {
			throw new IllegalArgumentException("Invalid Company");
		}
		
		Car car = new Car();
		car.setEngineType(eng);
		
		return car;
		
	}

}
