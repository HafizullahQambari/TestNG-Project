package com.test;

import org.testng.annotations.Test;

import com.util.CommonMethods;
import com.util.ConfigsReader;

public class AddEmployeeTest extends CommonMethods {
	
	@Test
	public void addEmployeePage() {
		LoginTask.signin();
		dash.navigateToAddEmployee();
		
	}
	
	
	
	
	

}
