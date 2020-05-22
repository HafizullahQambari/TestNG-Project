package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.AddEmployeePage;
import com.pages.DashBoardPageElements;
import com.pages.LoginPageElements;
import com.util.CommonMethods;
import com.util.ConfigsReader;

public class HW extends CommonMethods {
	
	@BeforeMethod
	public void NavigateToBrowser() {
		
		setUp();
	}
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();	
//	}
	@Test (priority=1)
	public void login() {
		LoginPageElements login=new LoginPageElements();
		login.username.sendKeys(ConfigsReader.getProperty("username"));
		login.password.sendKeys(ConfigsReader.getProperty("password"));
		login.loginBtn.click();
	
	
		DashBoardPageElements dash=new DashBoardPageElements();
		dash.pim.click();
		wait(2);
		dash.addEmp.click();
		wait(3);
	String actualText="Full Name";
	WebElement txt=driver.findElement(By.xpath(" //label[@class='hasTopFieldHelp']"));
	String expectedText=txt.getText();
	Assert.assertEquals(actualText, expectedText);

	}
	@Test (priority=2)
	public void addEmplyee() {
		AddEmployeePage addEmp=new AddEmployeePage();
		login();
		
		addEmp.Hafiz.sendKeys("Hafiz");
		addEmp.Qambari.sendKeys("Qambari");
		addEmp.upload.sendKeys("C:\\Users\\baria\\Desktop\\13680696_1022091924534829_5939108604780837596_n.jpg");
		
		addEmp.save.click();
		
	}
}
