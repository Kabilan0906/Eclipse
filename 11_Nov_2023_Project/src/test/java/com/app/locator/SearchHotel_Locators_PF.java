package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotel_Locators_PF extends LoginPage_Locators_PF {

	public static WebElement getlocation() {
		return driver.findElement(By.id("location"));
	}
}
