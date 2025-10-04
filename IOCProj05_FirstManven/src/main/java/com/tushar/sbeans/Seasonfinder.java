package com.tushar.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class Seasonfinder {
	
	@Autowired
	private LocalDate date;

	public Seasonfinder() {
		System.out.println("Seasonfinder::0-param constructor");
	}
	
	public String findOutSeasonName(String user) {
		System.out.println("Seasonfinder.findOutSeasonName()");
		
		int month = date.getMonthValue();
		switch(month) {
		case 11: case 12: case 1: case 2: case 3:
			return "hey " + user + "its winter season";
			
		case 4: case 5: case 6:
			return "Hey " + user + "its summer season";
			
		default:
			return "its summer";
		}
	}

}
