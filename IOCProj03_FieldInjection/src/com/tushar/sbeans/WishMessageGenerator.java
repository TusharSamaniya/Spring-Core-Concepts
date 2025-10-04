package com.tushar.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	@Qualifier("idt")
	private LocalDateTime dateTime;

	@Autowired
	@Qualifier("date")
	private Date date;

	
	//b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		System.out.println(date + " " + dateTime);
		int hour = dateTime.getHour();
		
		if(hour < 12) return "good Morning " + user;
		else if(hour > 12 && hour < 16) return "good afternoon" + user;
		else if(hour > 16 && hour <20) return "good evening" + user;
		else return "good night";
			
		
	}
	
	
	

}
