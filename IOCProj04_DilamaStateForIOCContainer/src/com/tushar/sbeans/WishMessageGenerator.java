package com.tushar.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Autowired --> @Qualifer("ldt2") > primary = "true" > id = "dateTime
@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	@Qualifier("ldt2")
	private LocalDateTime dateTime;


	
	//b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour = dateTime.getHour();
		
		if(hour < 12) return "good Morning " + user;
		else if(hour > 12 && hour < 16) return "good afternoon" + user;
		else if(hour > 16 && hour <20) return "good evening" + user;
		else return "good night";
			
		
	}
	
	
	

}
