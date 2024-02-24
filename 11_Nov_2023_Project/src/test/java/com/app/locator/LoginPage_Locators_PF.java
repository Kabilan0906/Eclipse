package com.app.locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.app.base.BaseClass;

public class LoginPage_Locators_PF extends BaseClass {
	
	// Page factory need to create constructor
	public LoginPage_Locators_PF() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id ="username")
	private WebElement getusername;
	
	@FindBy (id ="password")
	private WebElement getpassword;
	
	@FindBy (id ="login")
	private WebElement getlogin;
	
	public List<WebElement> getGetAllElement() {
		return getAllElement;
	}

	@FindBys({
		@FindBy(id="XXX"),
		@FindBy(name="XXX")
	})
	public List<WebElement> getAllElement;

	public WebElement getGetusername() {
		return getusername;
	}

	public WebElement getGetpassword() {
		return getpassword;
	}

	public WebElement getGetlogin() {
		return getlogin;
	}



	
}
