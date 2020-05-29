package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.CommonMethods;

public class sauceDemoLoginPage extends CommonMethods {
	
	@FindBy (id="user-name")
	public WebElement userNameTextBox;

	
	@FindBy (id="password")
	public WebElement passwordBox;
	
	@FindBy (xpath="//input[@class='btn_action']]")
	public WebElement loginButton;
	
	@FindBy(xpath="//div[text()=product]")
	public WebElement headerText;
	
	@FindBy (xpath="//h3[contains(text(),'epic']")
	public WebElement display;
	
	public sauceDemoLoginPage() {
	
		PageFactory.initElements(driver, this);
		
		
	}
	
}
