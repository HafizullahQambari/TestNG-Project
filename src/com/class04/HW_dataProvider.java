package com.class04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.CommonMethods;

public class HW_dataProvider extends CommonMethods {
	
	@Test(dataProvider="userData")
	public void data(String firstname, String lastname, String username, String password) {
		LoginTask.signin();
		dashTask.goToAddEmployee();
		sendText(addEmpTask.firstname, firstname);
		sendText(addEmpTask.lastname, lastname);
		String expectedEmpId=addEmpTask.id.getAttribute("value");
//		System.out.println(expectedEmpId);
		wait(2);
		addEmpTask.checkLogin.click();
		sendText(addEmpTask.EmpUsername, username);
		sendText(addEmpTask.EmpPassword, password);
		sendText(addEmpTask.confirmPass, password);
	
		wait(2);
		addEmpTask.saveButton.click();
		String actualEmpId=addEmpTask.id.getAttribute("value");
		Assert.assertEquals(expectedEmpId, actualEmpId, "EmpId didnot match");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File srcFile=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("screenshots/HRM"+firstname+lastname+".png"));
		takeScreenshot(firstname+" "+lastname);
		
	}
	
	
	@DataProvider (name="userData")
	public Object[][] getData(){
		Object[][] data= {
				{"Ahmad", "samir", "ahmad@123", "AmirKhan_123@"},
				{"samir", "khan", "khan123@", "AmirKhan_123@"},
				{"kabir", "khan", "khan123@", "AmirKhan_123@"},
					
		};
		return data;
	}
	

}
