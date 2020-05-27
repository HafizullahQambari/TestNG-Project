package com.HomeWork.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;
import com.util.CommonMethods;

public class dashBoardPage extends CommonMethods {
	
	@FindBy (id="menu_pim_viewPimModule")
	public WebElement pim;
	
	@FindBy (id="menu_pim_addEmployee")
	public WebElement addEmp;
	
	
	public dashBoardPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void goToAddEmployee() {
		pim.click();
		wait(2);
		addEmp.click();
	}

}
