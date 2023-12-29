package org.reuse.method;

import org.openqa.selenium.WebElement;

public class Alert extends Reuseable {
	public static void main(String[] args) {
		try {
			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl(urlAlert);
			reuseWebDriverWindowMaximize();
			reuseWebDriverDeleteAllCookies();
			reuseActionsInitialize();
			reuseWebElementXpathFindElement(xpathAlertSimpleDialog).click();
			reuseAlertInitialize();
			reuseThreadSleep(2000);
			reuseAlertAccept();
			reuseThreadSleep(2000);
			reuseWebElementXpathFindElement(xpathAlertConfirmDialog).click();
			reuseThreadSleep(2000);
			reuseAlertAccept();
			reuseThreadSleep(2000);
			reuseWebElementXpathFindElement(xpathAlertConfirmDialog).click();
			reuseThreadSleep(2000);
			reuseAlertDismiss();
			reuseThreadSleep(2000);
			WebElement prompt = reuseWebElementXpathFindElement(xpathAlertPromptDialog);
			reuseActionsClick(prompt);
			reuseThreadSleep(2000);
			reuseAlertSendKeys("kabilan");
			reuseThreadSleep(2000);
			reuseAlertAccept();
			reuseThreadSleep(2000);
			WebElement prompt1 = reuseWebElementXpathFindElement(xpathAlertPromptDialog);
			reuseActionsClick(prompt1);
			reuseThreadSleep(2000);
			reuseAlertSendKeys("kabilan");
			reuseThreadSleep(2000);
			reuseAlertDismiss();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
