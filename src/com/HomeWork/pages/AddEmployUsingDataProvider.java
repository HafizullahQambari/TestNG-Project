package com.HomeWork.pages;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.util.CommonMethods;

public class AddEmployUsingDataProvider extends CommonMethods{

	@Test (dataProvider="getData")
	public void data(String firstname, String lastname, String userID, String username,
			String password, String confirmPassword) throws Exception {
		LoginTask.signin();
		dashTask.goToAddEmployee();
		sendText(addEmpTask.firstname, firstname);
		sendText(addEmpTask.lastname, lastname);
		sendText(addEmpTask.id, userID);
		wait(3);
		addEmpTask.checkLogin.click();
		sendText(addEmpTask.EmpUsername, username);
		sendText(addEmpTask.EmpPassword, password);
		sendText(addEmpTask.confirmPass, confirmPassword);	
		addEmpTask.saveButton.click();
		
	wait(2);
	TakesScreenshot ts=(TakesScreenshot)driver;
File sourceFile=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/"+firstname+lastname+".png"));

	}
	@DataProvider
	public Object [][] getData(){
		Object [][] Data={
			{"Sameer", "Azimi", "4525", "SAzimi", "SAzimi123@", "SAzimi123@"},
			{"Ehsan", "Masodi", "1452", "Emasodi", "EMasodi123@", "EMasodi123@"},
			{"John", "johny", "1478", "Jjohny", "JJohny123@", "JJohny123@"}};
		
	return Data;
	}
	
}
	

