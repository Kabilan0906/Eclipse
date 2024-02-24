package com.app.stepdefition;

import com.app.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseClass  {
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}

}
