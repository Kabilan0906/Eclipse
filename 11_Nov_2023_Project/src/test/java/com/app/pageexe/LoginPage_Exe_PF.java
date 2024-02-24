package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPage_Locators_PF;

public class LoginPage_Exe_PF extends LoginPage_Locators_PF {
	
	public static void username() {
		BaseClass.input_Data( new LoginPage_Locators_PF().getGetusername(), prop_reuse("username"));
	}
	
	public static void password() {
		BaseClass.input_Data( new LoginPage_Locators_PF().getGetpassword() , prop_reuse("password"));
	}
	
	public static void loginButton() {
		BaseClass.click_Value( new LoginPage_Locators_PF().getGetlogin() );
	}

}
