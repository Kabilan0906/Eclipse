package org.reuse.method;

import org.openqa.selenium.WebElement;

public class Blogspot extends Reuseable {
	public static void main(String[] args) {
		try {
			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl(urlBlogspot);
			reuseWebDriverWindowMaximize();
			reuseWebDriverDeleteAllCookies();
			WebElement dropDown = reuseWebElementXpathFindElement(xpathBlogspotDropDown);
			boolean data = reuseSelectIsMultiple(dropDown);
			if (data == true) {
				reuseSelectGetOptions(dropDown);
				reuseThreadSleep(1500);
				reuseSelectByIndex(dropDown, 0);
				reuseThreadSleep(1500);
				reuseSelectByIndex(dropDown, 1);
				reuseThreadSleep(1500);
				reuseSelectByIndex(dropDown, 2);
				reuseThreadSleep(1500);
				reuseSelectByValue(dropDown, "Japan");
				reuseThreadSleep(1500);
				reuseSelectByValue(dropDown, "India");
				reuseThreadSleep(1500);
				reuseSelectByValue(dropDown, "Spain");
				reuseThreadSleep(1500);
				reuseSelectByVisibleText(dropDown, "Germany");
				reuseThreadSleep(1500);
				reuseSelectByVisibleText(dropDown, "Greece");
				reuseThreadSleep(1500);
				reuseSelectByVisibleText(dropDown, "Malaysia");
				reuseThreadSleep(1500);
				reuseSelectGetAllSelectedOption(dropDown);
				reuseThreadSleep(1500);
				reuseSelectDeselectByIndex(dropDown, 0);
				reuseThreadSleep(1500);
				reuseSelectDeselectByValue(dropDown, "Russia");
				reuseThreadSleep(1500);
				reuseSelectDeselectByVisibleText(dropDown, "France");
				reuseThreadSleep(1500);
				reuseSelectGetFirstSelectedOption(dropDown);
				reuseThreadSleep(1500);
				reuseSelectDeselectAll(dropDown);
				reuseThreadSleep(1500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
