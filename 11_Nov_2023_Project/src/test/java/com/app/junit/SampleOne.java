package com.app.junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleOne {
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
	
	@After
	public void after() {
		Date date = new Date();
		System.out.println(date);
		System.out.println("after");
	}
	
	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date);
		System.out.println("before");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
