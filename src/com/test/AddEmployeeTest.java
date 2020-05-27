package com.test;

import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {
	
	@Test
	public void addEmployeePage() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dash.navigateToAddEmployee();
		
	}
	
	
	
	
	

}
