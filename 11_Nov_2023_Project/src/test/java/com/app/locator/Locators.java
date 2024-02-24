package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class Locators extends BaseClass {
	
	public static WebElement user() {
		return driver.findElement(By.id("username"));	
	}
	
	public static WebElement pass() {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement login_Button() {
		return driver.findElement(By.id("login"));
	}
	
	public static WebElement location() {
		return driver.findElement(By.id("location"));
	}
}
