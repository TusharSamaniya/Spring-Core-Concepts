package com.nt.clint;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DepedencyInjectionTest {
	
	public static void main(String[] args) {
		//create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:/Users/tusha/Spring/IOCProj01_SetterInjection/src/com/nt/cfgs/applicationContext.xml");		
		//get target spring bean class object from ioc container
		Object obj = ctx.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		//invoke the b.method
		String result = generator.generateWishMessage("raja");
		System.out.println("Result: " +result);
		
		//close the ioc container
		ctx.close();
	}

}
