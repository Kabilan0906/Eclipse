package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SearchHotel_Locators;

public class SearchHotel_Exe extends LoginPage_Exe {
	
	public static void location() {
		BaseClass.dropdpown_Value(SearchHotel_Locators.getlocation(), excel_Read_Base_ReUse(2, 0));
	}

}
