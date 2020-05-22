package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice {
	WebDriver driver;
	@BeforeMethod
	public void NavigateToBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@AfterMethod
	public void closeBrowser() {
	}
	@Test
	public void login() {
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement clickButton=driver.findElement(By.className("btn_action"));
		clickButton.click();
	}
	@Test
	public void verify() {
		login();
		String actualtitle="Products";
	WebElement display=driver.findElement(By.className("product_label"));
	String expectedTitle=display.getText();
	
	Assert.assertEquals(actualtitle, expectedTitle);
	}
	@Test
	public void select() {
		login();
		WebElement dropdown=driver.findElement(By.className("product_sort_container"));
		
		
	Select select=	new Select(dropdown);
	select.selectByVisibleText("Price (low to high)");
	dropdown.click();
	}

}
