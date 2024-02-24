package com.app.test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_Ann {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
		
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
		
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
		
	}
	
	@Test
	public void test1() {
		System.out.println("test1");	
	}
	@BeforeMethod
	public void beforeMthod() {
		System.out.println("beforeMthod");	
	}
	@AfterMethod
	public void afterMthod() {
		System.out.println("afterMthod");	
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");	
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");	
	}
}
