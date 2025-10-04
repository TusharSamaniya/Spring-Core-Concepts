package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	private LocalDateTime dateTime;

	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime) {
		this.dateTime = dateTime;
		System.out.println("WishMessageGenerator: 0-param constructor");
	}

	
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
