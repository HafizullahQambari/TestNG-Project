package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;
import com.util.CommonMethods;

public class AddEmployeePage extends CommonMethods {
	
	@FindBy (id="firstName")
	public WebElement firstName;
	
	@FindBy (id="middleName")
	public WebElement midName;
	
	@FindBy (id="lastName")
	public WebElement lastName;
	
	@FindBy (id="photofile")
	public WebElement upload;
	
	@FindBy (id="btnSave")
	public WebElement save;
	
	public AddEmployeePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
