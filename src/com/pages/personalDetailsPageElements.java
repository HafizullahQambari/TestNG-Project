package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseClass;

public class personalDetailsPageElements {
	
	@FindBy (id="psersonal_cmbNation")
	WebElement nationalityDD;
	
	@FindBy (name="personal[optGender]")
	public List<WebElement> generRadioGroup;
	
	
	public personalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
