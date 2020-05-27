package com.class01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class TaskTwo {
	@BeforeClass
	public void before() {
		System.out.println("This is before class");
	}
	@AfterMethod
	public void afterClass() {
		System.out.println("This is after class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method");
	}
	
	@Test
	public void Test1() {
		System.out.println("test 1");
	}
	@Test
	public void Test2() {
		System.out.println("test 2");
	}
	@Test
	public void Test3() {
		System.out.println("test 2");
	}

}
