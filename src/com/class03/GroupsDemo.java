package com.class03;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
		
	}
	@Test(groups="somke")
	public void test2() {
		System.out.println("Test 2");
	}
	@Test (groups= {"regression"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test (groups= {"somke", "regression"})
	public void test41() {
		System.out.println("Test 4");
	}
	

}
