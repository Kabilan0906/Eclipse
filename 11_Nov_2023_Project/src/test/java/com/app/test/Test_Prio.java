package com.app.test;

import org.junit.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test_Prio {
	
	@Ignore
	@Test()
	public void user() {
		System.out.println("user");	
	}
	
	@Test(invocationCount=100)
	public void pass() {
		Assert.assertTrue(false);
		System.out.println("pass");	
	}
	
	@Test(enabled=false)
	public void login() {
		System.out.println("login");	
	}

}
