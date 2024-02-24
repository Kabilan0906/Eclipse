package com.app.junit;

import org.junit.Ignore;
import org.junit.Test;

public class Sample_Two {
	

	@Test
	public void username() {
		System.out.println("user");
	}
	
	@Test
	public void password() {
		System.out.println("pass");
	}
	
	@Ignore
	@Test
	public void login() {
		System.out.println("login");
	}

}
