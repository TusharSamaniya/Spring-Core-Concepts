package com.tushar.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.tushar.comp.BlueDart;
import com.tushar.comp.Courier;
import com.tushar.comp.DHL;
import com.tushar.comp.DTDC;
import com.tushar.comp.Flipkart;

public class FlipkartFactory {
	
	private static Properties props;
	static {
		try {
			//load the properties file
			InputStream is = new FileInputStream("src/main/java/com/tushar/commons/Info.properties");
			
			//create Properties class object
			props = new Properties();
			props.load(is);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//static factory method having logic to create Flipkart object having the given courier object
	public static Flipkart getInstance() {
		
		//get depedent class name from the properties class object
		String courierClassName = props.getProperty("Courie.name");
		
		Courier courier = null;
		try {
			//load the dependent class
			Class c = Class.forName(courierClassName);
			
			//create the object for dependent class
//		    courier = (Courier)c.newInstance(); //deprecated method from java 9
			
			//get all the constructors of the loaded class, there is a predefined class, method, constructor each object of constructor represent java constructor
			Constructor cons[] = c.getDeclaredConstructors();
//			
//			//create the object for depedent class using 0param constructor
			courier = (Courier)cons[0].newInstance();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//create target class object
		Flipkart fpkt = new Flipkart();
		
		//assigning dependent class object to target class object
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
