package com.pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage{
	
	
	//page actions
	public void googleSeatchTest() {
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		driver.findElement(By.name("q")).submit();
		
		driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).stream().forEach(element -> System.out.println(element.getText()));
		
	}
	
	public void tearDown() {
		driver.quit();
	}

}
