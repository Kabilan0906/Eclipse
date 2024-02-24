package com.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test {
	
	WebDriver driver = null;
	@Parameters({"browser"})	
	@BeforeTest
	public void beforeTest(String name) {
		if(name.equals("chrome")) {
			driver= new ChromeDriver();
			driver.get("https://www.facebook.com");
		}if(name.equals("edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com");
		}
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
