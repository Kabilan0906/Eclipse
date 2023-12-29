package org.reuse.method;

import org.openqa.selenium.WebElement;

public class Amazon extends Reuseable {
	public static void main(String[] args) {
		try {
//			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl(urlAmazon);
			reuseWebDriverWindowMaximize();
			reuseWebDriverDeleteAllCookies();
			reuseActionsInitialize();
			WebElement mobile = reuseWebElementXpathFindElement(xpathAmazonMobile);
			reuseThreadSleep(2000);
			reuseActionsClick(mobile);
			WebElement mobileAccessories = reuseWebElementXpathFindElement(xpathAmazonMobilesAccessories);
			reuseThreadSleep(2000);
			reuseActionsClick(mobileAccessories);
			WebElement powerBank = reuseWebElementXpathFindElement(xpathAmazonPowerBank);
			reuseThreadSleep(2000);
			reuseActionsClick(powerBank);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
