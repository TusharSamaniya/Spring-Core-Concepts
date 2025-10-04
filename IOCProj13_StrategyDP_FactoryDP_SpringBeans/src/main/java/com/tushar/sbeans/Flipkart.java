package com.tushar.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	
	//HAS-A property
	@Autowired
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart: 0-param constructor");
	}
	
	
	//b.method
	public String shopping(String item[], double price[]) {
		//calculate bill amount
		double total = 0.0;
		for(double p: price) 
			total = total + p;
			
			//generate random no as the order id
			int oId = new Random().nextInt(1000);
			
			//use courier 
			String msg = courier.deliever(oId);
			
		
		return Arrays.toString(item) + " are purchased having prices" + Arrays.toString(price) + " , bill amount: " + total + " --->" + msg;  
	}

}
