package com.class02;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.LoginPageElements;
import com.util.CommonMethods;

public class Task extends CommonMethods {
	
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//	}
//	@AfterMethod
//	public void closeBrowser() {
//		wait(3);
//	
//	}
	@Test 
	public void logo() {
		
		LoginPageElements login=new LoginPageElements();
		boolean display=login.logo.isDisplayed();
		Assert.assertTrue(display, "logo displayed");
		

	SoftAssert a=new SoftAssert();
	a.assertAll();
	
////	login.username;
//	login.password;
	
	}
	
}
