package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample_Test {
	
	// Assert
	// Hard Assert and SoftAssert
	//
	@Test
	public void test1() {
	String s ="Aiite";
	// hard Assert
	Assert.assertEquals("Aiite",s );
	System.out.println("test1");
	Assert.assertEquals("aiite",s );
	System.out.println("test2");
	}
	
	@Test
	public void test2() {
		// soft Assert
		String s ="Aiite";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Aiite", s);
		System.out.println("sa1");
		sa.assertTrue(s.contains("a"));
		System.out.println("sa2");
		sa.assertTrue(s.contains("A"));
		System.out.println("sa3");
		sa.assertAll();
		
	}
	

}
