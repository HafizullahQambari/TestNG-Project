package com.test;

import org.testng.Assert;
import org.testng.annotations.*;

import com.util.CommonMethods;

public class sauceDemoTest extends CommonMethods {
	
	@DataProvider (name="dataProvider")
	public Object[][] setUpData(){
		Object [][] data=new Object[4][2];
		
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
		data[3][0]="performance_glitch_user";
		data[3][1]="secret_sauce";
		
		
		
		return data;
	}
		
	@Test (dataProvider="dataProvider")
	public void loginToSauceDemo(String username, String password) {
		sendText(sauceDemo.userNameTextBox, "standard_user");
		sendText(sauceDemo.passwordBox, "secret_sauce");
		sauceDemo.loginButton.click();
		
		
	}

}
