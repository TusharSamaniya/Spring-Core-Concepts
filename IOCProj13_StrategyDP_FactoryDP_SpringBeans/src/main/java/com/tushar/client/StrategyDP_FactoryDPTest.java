package com.tushar.client;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tushar.sbeans.Flipkart;

public class StrategyDP_FactoryDPTest {

	public static void main(String[] args) {
		
		//create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:/Users/tusha/springEclipseWorkspace/IOCProj13_StrategyDP_FactoryDP_SpringBeans/src/main/java/com/tushar/cfgs/applicationContext..xml");
		
		//get target spring beans class object
		Flipkart fpkt = (Flipkart)ctx.getBean("fpkt");
		
		//invoke the b.method
		String resultMsg = fpkt.shopping(new String[] {"kurta-pajama","pathaani", "aathar"},  new double[] {2000, 3000, 432.3, 99732.8});
		
		System.out.println(resultMsg);
		
		ctx.close();
		
	}

}
