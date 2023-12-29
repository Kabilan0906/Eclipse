package org.reuse.method;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Table extends Reuseable {
	public static void main(String[] args) {
		try {
			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl(urlWebtable);
			reuseWebDriverDeleteAllCookies();
			reuseWebDriverWindowMaximize();
			List<WebElement> tableRow = reuseWebElementXpathFindElements(xpathWebtableTr);
			System.out.println("Number of column : " + tableRow.size());
			List<WebElement> tableColumn = reuseWebElementXpathFindElements(xpathWebtableTd);
			System.out.println("Number of column : " + tableColumn.size());
			for (int i = 1; i <= tableColumn.size(); i++) {
				if (i % 2 != 0) {
					reuseWebElementXpathFindElement("(//table[@id='countries']//tr//td//"
							+ "input[@type='checkbox'])["+i+"]").click();
				}
			}
//			for (WebElement webElement : tableRow) {
//				System.out.println(webElement.getText());
//			}
//			for (WebElement webElement : tableColumn) {
//				System.out.println(webElement.getText());
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
