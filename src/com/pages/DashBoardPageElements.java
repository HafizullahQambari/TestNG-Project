package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;

public class DashBoardPageElements {

	@FindBy(id="welcome")
	public WebElement welcome;
	@FindBy (id="menu_pim_viewPimModule")
	public WebElement pim;
	@FindBy (id="menu_pim_addEmployee")
	public WebElement addEmp;

	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
