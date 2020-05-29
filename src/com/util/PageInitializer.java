package com.util;

import com.HomeWork.pages.AddEmployeeTask;
import com.HomeWork.pages.LoginPage;
import com.HomeWork.pages.dashBoardPage;
import com.pages.AddEmployeePage;
import com.pages.DashBoardPageElements;
import com.pages.LoginPageElements;
import com.pages.personalDetailsPageElements;
import com.pages.sauceDemoLoginPage;
//this class initialize all pages class and stores references in static variables 
//that will called/used in test classes
public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	public static AddEmployeePage addEmployee;
	public static DashBoardPageElements dash;
	public static personalDetailsPageElements personalDetails;
	public static LoginPage LoginTask;
	public static dashBoardPage dashTask;
	public static AddEmployeeTask addEmpTask;
	public static sauceDemoLoginPage sauceDemo;
	
	public static void initialize() {
		 login=new LoginPageElements();
		
		 dash=new DashBoardPageElements();
		
		addEmployee=new AddEmployeePage();
		
		personalDetails= new personalDetailsPageElements();
		
		LoginTask=new LoginPage();
		dashTask=new dashBoardPage();
		addEmpTask=new AddEmployeeTask();
		
		sauceDemo=new sauceDemoLoginPage();
		
		
	}

}
