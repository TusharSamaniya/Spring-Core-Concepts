package com.tushar.clint;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tushar.sbeans.SeasonFinder;

public class DepedencyInjectionTest {
	
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("C:/Users/tusha/Spring/IOCProj01_SetterInjectionExtend/src/com/tushar/cfgs/applicationContest.xml");
		Object obj = ctx.getBean("season");
		
		SeasonFinder sef = (SeasonFinder)obj;
		
		String result = sef.getTheSeasonName("Ram");
		System.out.println(result);
	}

}
