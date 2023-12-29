package org.reuse.method;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollBy extends Reuseable{
	public static void main(String[] args) {
		try {
			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl("https://www.amazon.in/");
			reuseWebDriverWindowMaximize();
			reuseWebDriverDeleteAllCookies();
			reuseThreadSleep(2000);
			JavascriptExecutor js = reuseJavascriptExecutorTypeCasting();
			reuseJavascriptExecutorScriptWindowScrollBy(js, 0, 13000);
			reuseThreadSleep(2000);
			reuseJavascriptExecutorScriptWindowScrollBy(js, 0, -13000);
			reuseThreadSleep(2000);
			WebElement search = reuseWebElementXpathFindElement(xpathAmazonSearchBox);
			reuseJavascriptExecutorScriptSetAttribute(js, search, "motorolo");
			WebElement searchButton = reuseWebElementXpathFindElement(xpathAmazonSearchButton);
			reuseJavascriptExecutorClick(js, searchButton);
			
			
//			reuseWebDriverGetUrl(urlFilpkart);
//			reuseWebDriverWindowMaximize();
//			reuseWebDriverDeleteAllCookies();
//			WebElement close = reuseWebElementXpathFindElement(xpathFilpkartLoginClose);
//			reuseJavascriptExecutorClick(js, close);
//			WebElement SearchBox = reuseWebElementXpathFindElement(xpathFilpkartSearch);
//			reuseJavascriptExecutorScriptSetAttribute(js, SearchBox, "iphone");
//			WebElement searchButton = reuseWebElementXpathFindElement(xpathFilpkartSearchButton);
//			reuseJavascriptExecutorClick(js, searchButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
