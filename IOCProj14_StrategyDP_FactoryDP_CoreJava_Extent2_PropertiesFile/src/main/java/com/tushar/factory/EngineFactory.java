package com.tushar.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.tushar.comp.Car;
import com.tushar.comp.Engine;

public class EngineFactory {
	
	private static Properties pros;
	
	//load the properties file
	static {
		try {
			InputStream is = new FileInputStream("src/main/java/com/tushar/commons/applicationContext.properties");
			
			pros = new Properties();
			pros.load(is);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static Car getInstance() {
		
		String engineType = pros.getProperty("Engine.Type");
		Engine engine = null;
		
		try {
			Class c = Class.forName(engineType);
			
			/*  //method 1
			engine = (Engine) c.newInstance();
			*/
			
			/*   //method 2
			Constructor cons[] = c.getDeclaredConstructors();
			engine = (Engine) cons[0].newInstance();
			*/
			
			//method 3
			Constructor<Engine> cons[] = c.getDeclaredConstructors();
			engine =  cons[0].newInstance();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Car car = new Car();
		car.setEngineType(engine);
		
		return car;
		
		//load one of the engine type
		
		//create object for car
		
		//assign type of engine to car
		
		
	}

}
