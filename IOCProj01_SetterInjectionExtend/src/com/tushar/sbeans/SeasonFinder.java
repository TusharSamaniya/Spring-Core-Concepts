package com.tushar.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("season")
public class SeasonFinder {
	
	private LocalDateTime localDate;

	public SeasonFinder() {
		System.out.println("SeasonFinder: 0 param constructor");
	}

	
	@Autowired
	public void setLocalDate(LocalDateTime localDate) {
		this.localDate = localDate;
	}
	
	//business method
	public String getTheSeasonName(String user) {
		int month = localDate.getMonthValue();
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
