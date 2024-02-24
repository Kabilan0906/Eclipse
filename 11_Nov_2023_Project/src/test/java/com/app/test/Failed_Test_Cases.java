package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_Test_Cases {
	
	/*@Test(retryAnalyzer = Failed_Retry.class)
	public void test1() {
	String s ="Aiite";
	Assert.assertEquals("aiite",s );
	System.out.println("test1");

	}*/
	
	@Test
	public void test2() {
	String s ="Aiite";
	Assert.assertEquals("aiite",s );
	System.out.println("test1");

	}
	
	@Test
	public void test3() {
	String s ="Aiite";
	Assert.assertEquals("aiite",s );
	System.out.println("test1");

	}
	
	@Test
	public void test4() {
		String s ="Aiite";
		Assert.assertEquals("Aiite",s );
		
	}

}
