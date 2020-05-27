package com.HomeWork.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;
import com.util.CommonMethods;

public class AddEmployeeTask extends CommonMethods{
	
	@FindBy (id="firstName")
	public WebElement firstname;
	
	@FindBy (id="lastName")
	public WebElement lastname;
	
	@FindBy (id="employeeId")
	public WebElement id;
	
//	@FindBy (id="photofile")
//	public WebElement photo;
	
	@FindBy (id="chkLogin")
	public WebElement checkLogin;
	
	@FindBy (id="user_name")
	public WebElement EmpUsername;
	
	@FindBy (id="user_password")
	public WebElement EmpPassword;
	
	@FindBy (id="re_password")
	public WebElement confirmPass;
	
	@FindBy (id="btnSave")
	public WebElement saveButton;
	
	@FindBy (xpath="//span[@for='lastName']")
	public WebElement requiredFiled;
	
	public AddEmployeeTask() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	public void addEmployee() {
		sendText(firstname, "Jawid");
		sendText(lastname, "oghlo");
		sendText(id, "7325");
	}
	 
	public void loginCredentials() {
		sendText(EmpUsername, "AJawid");
		sendText(EmpPassword, "Syntax123@");
		sendText(confirmPass, "Syntax123@");
		wait(2);
		saveButton.click();
		
	}
	
	
}
