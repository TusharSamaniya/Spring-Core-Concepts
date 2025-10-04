package com.tushar.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tushar.sbeans.Seasonfinder;

public class DepedencyInjectionTest {
	
	public static void main(String[] args) {
		//create the ioc container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/tushar/cfgs/applicationContext.xml");
		
		//get target spring bean class object ref
		Object obj = ctx.getBean("sf");
		
		//typecasting
		Seasonfinder finder = (Seasonfinder)obj;
		
		//invoke the b method
		String result = finder.findOutSeasonName("Tushar");
		System.out.println(result);
		
		//close container
		ctx.close();
		
	}
	

}
