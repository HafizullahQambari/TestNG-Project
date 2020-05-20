package com.class01;

import org.testng.annotations.*;

public class DifferentAnnotations {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test() {
		System.out.println("Actual Test is running.......");
		
	}
	public void withoutAnnotation() {
		System.out.println("without Annotation");
	}

}
