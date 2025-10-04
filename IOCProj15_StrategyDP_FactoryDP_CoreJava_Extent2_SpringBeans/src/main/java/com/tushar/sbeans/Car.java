package com.tushar.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	
	@Autowired
	private Engine engine;
	
	public Car() {
		System.out.println("Car: method called");
	}

	
	
	//business method 
	public String Shopping(String[] items, int[] price) {
		int total = 0;
		for(int x: price) total += x;
		
		int power = new Random().nextInt(10000, 50000);
		
		String msg = engine.EngineType(power);
		
		return Arrays.toString(items) + " are purchased having price " + Arrays.toString(price) + " , total bill amount: " + total + " , " + msg;
	}

}
