package com.app.test;

import org.testng.annotations.DataProvider;

public class DataProvider_Test2 {
	
	

	@DataProvider(name="testdata")
	public Object[][] method(){
		return new Object [][] {{"aiite1","123345"},{"aiite2","ertyuio"},{"aiite3","dfghj"}};
		
	}

	// dataprovider->excel data pass; 
}
