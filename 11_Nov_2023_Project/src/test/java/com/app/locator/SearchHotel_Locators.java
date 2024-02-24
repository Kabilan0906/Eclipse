package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotel_Locators extends LoginPage_Locators {

	public static WebElement getlocation() {
		return driver.findElement(By.id("location"));
	}
}
