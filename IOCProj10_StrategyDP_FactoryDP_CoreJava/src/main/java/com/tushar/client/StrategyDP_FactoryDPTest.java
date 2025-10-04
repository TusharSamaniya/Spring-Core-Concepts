package com.tushar.client;

import com.tushar.comp.Flipkart;
import com.tushar.factory.FlipkartFactory;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		// use factory pattern class to get the flipkart class obj having our choice depedent class obj
		Flipkart fpkt = FlipkartFactory.getInstance("blue");
		
		//invoke the business method
		String resultMsg = fpkt.shopping(new String[] {"Shirt", "kurta-pajama", "hat", "kurti"}, new double[] {74.5, 98.4, 395.9, 123.6} );
		System.out.println(resultMsg);
	}

}
