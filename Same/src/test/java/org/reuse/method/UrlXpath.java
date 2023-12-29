package org.reuse.method;

public class UrlXpath {
	public static String urlGoogle="https://www.google.com/";
	public static String xpathGoogleGmailButton = "//a[text()='Gmail']";
	public static String xpathGoogleEmailTextBox="//input[@type='email']";
	public static String xpathGoogleNextButton="//button/span[contains(text(),'Next')]";
	
	public static String urlFacebook = "https://www.facebook.com/";
	public static String xpathFacebookEmail = "//input[@id='email']";
	public static String xpathFacebookPassword = "//input[@id='pass']";
	public static String xpathFacebookLogin = "//button[@name='login']";
	
	public static String urlFilpkart="https://www.flipkart.com/";
	public static String xpathFilpkartLoginClose="//span[@role='button']";
	public static String xpathFilpkartSearch="//input[@name='q']";
	public static String xpathFilpkartSearchButton="//button[@type='submit']";
	
	public static String urlAmazon = "http://www.amazon.iN";
	public static String xpathAmazonMobile = "//a[text()='Mobiles']";
	public static String xpathAmazonMobilesAccessories = "(//span[@class='nav-a-content'])[2]";
	public static String xpathAmazonPowerBank = "//a[contains(text(),'Power Banks')]";
	public static String xpathAmazonSearchBox="//input[@type='text']";
	public static String xpathAmazonSearchButton="//input[@value='Go']";
	
	public static String urlWebtable="https://cosmocode.io/automation-practice-webtable/";
	public static String xpathWebtableTr="//table[@id='countries']//tr";
	public static String xpathWebtableTd="//table[@id='countries']//td";
	
	public static String urlDragAndDrop="http://demo.guru99.com/test/drag_drop.html";
	public static String xpathDragAndDropBankPrice="(//a[contains(text(),'5000')])[2]";
	public static String xpathDragAndDropSalesPrice="(//a[contains(text(),'5000')])[4]";
	public static String xpathDragAndDropBank="//a[contains(text(),'BANK')]";
	public static String xpathDragAndDropSales="//a[contains(text(),'SALES')]";
	public static String xpathDragAndDropDebitAccount="(//li[@class='placeholder'])[1]";
	public static String xpathDragAndDropDebitAmount="(//li[@class='placeholder'])[2]";
	public static String xpathDragAndDropCreditAccount="(//li[@class='placeholder'])[3]";
	public static String xpathDragAndDropcriditAmount="(//li[@class='placeholder'])[4]";
	
	public static String urlAlert="https://www.leafground.com/alert.xhtml;jsessionid=node01jksij9xij5ercgp4e9fldeiw498669.node0";
	public static String xpathAlertSimpleDialog="(//span[text()='Show'])[1]";
	public static String xpathAlertConfirmDialog="(//span[text()='Show'])[2]";
	public static String xpathAlertPromptDialog="(//span[text()='Show'])[5]";
	
	public static String urlBlogspot="https://only-testing-blog.blogspot.com/";
	public static String xpathBlogspotDropDown="(//select[@size='10'])[1]";

}
