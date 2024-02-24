package com.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel_Test{
	WebDriver driver = null;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		System.out.println("beforetest");
	}
	
	@Test
	public void test1() {
		driver.findElement(By.id("email")).sendKeys("Aiite1");
		driver.findElement(By.id("pass")).sendKeys("1234");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");
	}
}
