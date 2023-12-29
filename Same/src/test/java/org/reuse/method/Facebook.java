package org.reuse.method;

import org.openqa.selenium.WebElement;

public class Facebook extends Reuseable {
	public static void main(String[] args) {
		try {
			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl(urlFacebook);
			reuseWebDriverWindowMaximize();
			reuseWebDriverDeleteAllCookies();
			reuseWebDriverGetTitle();
			WebElement email = reuseWebElementXpathFindElement(xpathFacebookEmail);
			WebElement password = reuseWebElementXpathFindElement(xpathFacebookPassword);
			WebElement login = reuseWebElementXpathFindElement(xpathFacebookLogin);
			reuseWebElementSendKeys(email, "kabilan");
			reuseWebElementSendKeys(password, "6757");
			reuseWebElementClick(login);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
