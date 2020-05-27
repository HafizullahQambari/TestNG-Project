package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashBoardPageElements;
import com.pages.LoginPageElements;
import com.util.CommonMethods;
import com.util.ConfigsReader;

public class LoginTest extends CommonMethods {
	
//	@BeforeMethod
//	public void openBrowser() {
//		
//		setUp();
//		 initialize();
//		
//	}
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//		
//	}
//	
	@Test
	public void validuserName() {
//		LoginPageElements login=new LoginPageElements();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
//		sendText(login.username, ConfigsReader.getProperty("username"));
//		sendText(login.password, ConfigsReader.getProperty("password"));
		login.loginBtn.click();
		
//		DashBoardPageElements dash=new DashBoardPageElements();
		
		String expectedUser="Welcome Admin";
		String actualUser=dash.welcome.getText();
		
		Assert.assertEquals(actualUser, expectedUser , "welcome Message did not match");
	}
		@Test
		public void invalidPasswordLogin() {
			
//			LoginPageElements login=new LoginPageElements();
			sendText(login.username, ConfigsReader.getProperty("username"));
			sendText(login.password, "2222");
			login.loginBtn.click();
			String expectedMessage="Invalid credentials";
			
			Assert.assertEquals(login.errorMsg.getText(), expectedMessage, "Error message text is not matched");
	}
		@Test
		public void emptyUsernameLogin() {
//			LoginPageElements login=new LoginPageElements();
//			sendText(login.username, ConfigsReader.getProperty("username")); 
			sendText(login.password, ConfigsReader.getProperty("password"));
			login.loginBtn.click();
			
			String expected="Username cannot be empty";
			Assert.assertEquals(login.errorMsg.getText(), expected, "error message does not matched");
		}
	
}
