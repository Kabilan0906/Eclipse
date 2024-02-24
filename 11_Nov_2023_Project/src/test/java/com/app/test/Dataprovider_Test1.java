package com.app.test;

import org.testng.annotations.Test;

public class Dataprovider_Test1 {
	
	@Test(dataProvider="testdata",dataProviderClass=DataProvider_Test2.class)
	public void test1(String data1,String data2) {
		System.out.println(data1+"\n"+data2);
	}
	

	/*@DataProvider(name="testdata")
	public Object[][] method(){
		return new Object [][] {{"aiite1","123345"},{"aiite2","ertyuio"},{"aiite3","dfghj"}};
		
	}*/

}
