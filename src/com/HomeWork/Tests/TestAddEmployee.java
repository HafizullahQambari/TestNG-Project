package com.HomeWork.Tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.util.CommonMethods;
import com.util.ConfigsReader;

public class TestAddEmployee extends CommonMethods{
	@BeforeMethod
	public void navigateToBrowser() {
		
		LoginTask.signin();
		wait(2);
		dashTask.goToAddEmployee();
//		dashTask.pim.click();
//		wait(3);
//		dashTask.addEmp.click();
	}
	@Test
	public void addingLoginCredentials() {
		
		addEmpTask.addEmployee();
//		sendText(addEmpTask.firstname, "Ahmad");
//		sendText(addEmpTask.lastname, "jawid");
//		sendText(addEmpTask.id, "3179");
		addEmpTask.checkLogin.click();
		wait(2);
		addEmpTask.loginCredentials();
	}
	@Test 
	public void requiredFiled() {
		sendText(addEmpTask.firstname, "Ahmad");
		addEmpTask.checkLogin.click();
		addEmpTask.loginCredentials();
		String expectedText="Required";
		String accutalText=addEmpTask.requiredFiled.getText();
		Assert.assertEquals(expectedText, accutalText, "text did not match");
	}
}
