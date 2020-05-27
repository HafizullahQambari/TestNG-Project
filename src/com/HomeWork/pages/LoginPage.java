package com.HomeWork.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;
import com.util.CommonMethods;
import com.util.ConfigsReader;

public class LoginPage extends CommonMethods {
	
	@FindBy (id="txtUsername")
	public WebElement username;
	
	@FindBy (id="txtPassword")
	public WebElement password;
	
	@FindBy (id="btnLogin")
	public WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void signin() {
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(login);
		
		
	}
}
