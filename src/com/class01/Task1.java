package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.ConfigsReader;

public class Task1 extends CommonMethods {
	@BeforeMethod
	public void navigateToBrowser() {
		setUp();
		
	}
	@AfterMethod
	public void quiteBrowser() {
		wait(5);
		tearDown();
	}
	@Test
	public void validLogin() {
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		sendText(username, ConfigsReader.getProperty("username"));
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		sendText(password, ConfigsReader.getProperty("password"));
		   
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test
	public void invalidLogin() {
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		driver.findElement(By.id("btnLogin")).click();
		WebElement text=driver.findElement(By.id("spanMessage"));
		boolean display=text.isDisplayed();
		if(display) {
			String getText=text.getText();
			System.out.println(getText);
		}
	}
	

}
