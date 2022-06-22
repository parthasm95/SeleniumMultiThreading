package com.runner;

import com.google.threadclasses.GoogleFeatureThread;

public class GoogleTestRunner {
	
	public static void main(String[] args) {
		
		Thread t1 = new GoogleFeatureThread("Chrome Thread", "chrome");
		Thread t2 = new GoogleFeatureThread("Firefox Thread", "firefox");
		
		int chromeCount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxCount = Integer.parseInt(System.getProperty("firefox"));
		
		System.out.println("total chrome : "+chromeCount+ " & "+ "total firefox : "+firefoxCount);
		
		for(int i=0,j=0;i<chromeCount || j<firefoxCount; i++, j++) {
			
			System.out.println("Threads Started...");
			t1.start();
			t2.start();
			System.out.println("threads got ended...");
			
		}
	}

}
