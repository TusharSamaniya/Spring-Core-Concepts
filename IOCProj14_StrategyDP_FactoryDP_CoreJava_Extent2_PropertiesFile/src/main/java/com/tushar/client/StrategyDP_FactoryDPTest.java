package com.tushar.client;

import com.tushar.comp.Car;
import com.tushar.factory.EngineFactory;

public class StrategyDP_FactoryDPTest {
	
	public static void main(String[] args) {
		Car car = EngineFactory.getInstance();
		
		String resultMsg = car.Shopping(new String[] {"Piston", "Flywheel", "Engine Valves", "Cylinder Liner"}, new int[] {7854, 3597, 1267, 7496});
		
		System.out.println(resultMsg);
	}

}
