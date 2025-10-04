package com.tushar.clint;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tushar.sbeans.WishMessageGenerator;

public class DepedencyInjectionTest {
	
	public static void main(String[] args) {
		//create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:/Users/tusha/Spring/IOCProj03_FieldInjection/src/com/tushar/cfgs/applicationcontext.xml");		
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
