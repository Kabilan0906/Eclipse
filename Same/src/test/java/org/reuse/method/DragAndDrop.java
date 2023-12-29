package org.reuse.method;

import org.openqa.selenium.WebElement;

public class DragAndDrop extends Reuseable{
	public static void main(String[] args) {
		try {
			reuseSetProperty();
			reuseDriverInitialize();
			reuseWebDriverGetUrl(urlDragAndDrop);
			reuseWebDriverWindowMaximize();
			reuseWebDriverDeleteAllCookies();
			reuseActionsInitialize();
			WebElement bankPrice = reuseWebElementXpathFindElement(xpathDragAndDropBankPrice);
			WebElement salesPrice = reuseWebElementXpathFindElement(xpathDragAndDropSalesPrice);
			WebElement bank = reuseWebElementXpathFindElement(xpathDragAndDropBank);
			WebElement sales = reuseWebElementXpathFindElement(xpathDragAndDropSales);
			WebElement debitAccount = reuseWebElementXpathFindElement(xpathDragAndDropDebitAccount);
			WebElement debitAmount = reuseWebElementXpathFindElement(xpathDragAndDropDebitAmount);
			WebElement creditAccount = reuseWebElementXpathFindElement(xpathDragAndDropCreditAccount);
			WebElement criditAmount = reuseWebElementXpathFindElement(xpathDragAndDropcriditAmount);
			reuseActionsDragAndDrop(bank, debitAccount);
			reuseActionsDragAndDrop(bankPrice, debitAmount);
			reuseActionsDragAndDrop(sales, creditAccount);
			reuseActionsDragAndDrop(salesPrice, criditAmount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
