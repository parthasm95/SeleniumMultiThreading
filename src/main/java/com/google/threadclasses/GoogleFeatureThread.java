package com.google.threadclasses;

import com.pages.GooglePage;

public class GoogleFeatureThread extends Thread{
	
	public String browserName;
	GooglePage googlePage;
	
	
	public GoogleFeatureThread(String threadName, String browserName) {
		super(threadName);
		this.browserName = browserName;
		googlePage = new GooglePage();
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println("Thread started -> "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			googlePage.setUp(this.browserName);
			googlePage.googleSeatchTest();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			googlePage.tearDown();
		}
		
		System.out.println("Thread Ended -> "+ Thread.currentThread().getName());
	}
}
