package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPage_Locators;
import com.app.locator.SearchHotel_Locators;

public class LoginPage_Exe extends SearchHotel_Locators{
	
	public static void username() {
		BaseClass.input_Data(LoginPage_Locators.getuser(), prop_reuse("username"));
	}
	
	public static void password() {
		BaseClass.input_Data(LoginPage_Locators.getpass(), prop_reuse("password"));
	}
	
	public static void login_button() {
		BaseClass.click_Value(LoginPage_Locators.getlogin_Button());
	}

}
