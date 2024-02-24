package com.app.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Sample_Three {
	
	
	// Assert class -> assertEquals , assertTrue , assertFalse
	
	@Test
	public void username() {
		String s1 = "Aiite";
		Assert.assertEquals("Aiite", s1);
		System.out.println("user");
	}
	
	@Test
	public void password() {
		String s1 = "Aiite";
		Assert.assertTrue(s1.contains("A"));
		System.out.println("pass");
	}
	
	@Test
	public void login() {
		String s1 = "Aiite";
		Assert.assertFalse(s1.contains("a"));
		System.out.println("login");
	}

}
