package com.app.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Param {
	
	@Parameters({"username"})
	@Test
	public void test1(String user) {
		System.out.println(user);	
		
	}
	@Parameters({"password"})
	@Test
	public void test2(String pass) {
		System.out.println("test2");	
		System.out.println(pass);
	}
	
	@Test
	public void test3() {
		System.out.println("test3");	
	}

}
