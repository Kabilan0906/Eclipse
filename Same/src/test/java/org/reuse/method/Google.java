package org.reuse.method;

import org.openqa.selenium.WebElement;

public class Google extends Reuseable {
	public static void main(String[] args) {
		try {
			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl(
					"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&emr=1&ifkv=AYZoVhfdMoIakc0_X59QDHif39aUvqW9PHZX3ZTX9om08lYfqetn4IQWxIiI5RigD1Gh2UkqrLavBA&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S721485940%3A1696727585419234&theme=glif");
			reuseWebDriverWindowMaximize();
			reuseWebDriverDeleteAllCookies();
			WebElement gmailButton = reuseWebElementXpathFindElement(xpathGoogleGmailButton);
			reuseActionsInitialize();
			reuseActionsContextClick(gmailButton);
			reuseRobotInitialize();
			for (int i = 0; i < 3; i++) {
				reuseRobotDownPress();
				reuseRobotDownRelease();
				reuseThreadSleep(2000);
			}
			reuseRobotEnterPress();
			reuseRobotEnterRelease();
			reuseThreadSleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
