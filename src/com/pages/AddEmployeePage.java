package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;

public class AddEmployeePage {
	
	@FindBy (id="firstName")
	public WebElement Hafiz;
	
	@FindBy (id="middleName")
	public WebElement ullah;
	
	@FindBy (id="lastName")
	public WebElement Qambari;
	
	@FindBy (id="photofile")
	public WebElement upload;
	
	@FindBy (id="btnSave")
	public WebElement save;
	
	public AddEmployeePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
