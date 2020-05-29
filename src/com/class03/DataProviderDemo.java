package com.class03;

import org.testng.Assert;
import org.testng.annotations.*;

import com.util.CommonMethods;

public class DataProviderDemo extends CommonMethods {
	
	@Test(dataProvider= "getData")
	public void login(String username, String password, int age) {
		
		sendText(login.username, username);
		sendText(login.password, password);
		click(login.loginBtn);
		
		
//	boolean isDisplayed=	dash.welcome.isDisplayed();
//	Assert.assertTrue(isDisplayed, "Welcome msg is not displayed");
		
	}
	@DataProvider
	public Object [][] getData(){
			Object[][] data= {
					{"Admin", "Hum@nhrm123", 23},
					{"Syntax", "Syntax123!", 25},
					{"SyntaxUser", "Syntax123!", 20}
	};
		return data ;
	}
}
