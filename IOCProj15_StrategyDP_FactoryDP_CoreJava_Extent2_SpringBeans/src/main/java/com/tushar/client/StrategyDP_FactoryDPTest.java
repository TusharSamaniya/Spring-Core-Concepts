package com.tushar.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tushar.sbeans.Car;

public class StrategyDP_FactoryDPTest {
	
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:/Users/tusha/springEclipseWorkspace/IOCProj15_StrategyDP_FactoryDP_CoreJava_Extent2_SpringBeans/src/main/java/com/tushar/cfgs/applicationContext.xml");
		
		Car c = (Car)ctx.getBean("car");
		
		String resultMsg = c.Shopping(new String[] {"Piston", "Flywheel", "Engine Valves", "Cylinder Liner"}, new int[] {7854, 3597, 1267, 7496});
		
		System.out.println(resultMsg);
	}

}
