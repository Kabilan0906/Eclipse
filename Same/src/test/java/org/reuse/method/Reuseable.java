package org.reuse.method;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reuseable extends UrlXpath {
	public static WebDriver driver;
	public static Actions acc;
	public static Robot robot;
	public static Alert alert;
	public static Select select;

	public static void reuseSetProperty() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KABI\\java project\\Sample\\Driver\\chromedriver.exe");
	}

	public static void reuseDriverInitialize() {
		driver = new ChromeDriver();
	}

	public static void reuseActionsInitialize() {
		acc = new Actions(driver);
	}

	public static void reuseAlertInitialize() {
		alert = driver.switchTo().alert();
	}

	public static void reuseRobotInitialize() throws AWTException {
		robot = new Robot();
	}

	public static void reuseThreadSleep(long i) throws InterruptedException {
		Thread.sleep(i);
	}

	public static void reuseWebDriverWindowMaximize() {
		driver.manage().window().maximize();
	}

	public static void reuseWebDriverDeleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void reuseWebDriverGetUrl(String url) {
		driver.get(url);
	}

	public static String reuseWebDriverGetCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static String reuseWebDriverGetPageSource() {
		 return driver.getPageSource();
	}

	public static void reuseWebDriverGetTitle() {
		System.out.println("We worked on site: " + driver.getTitle());
	}

	public static void reuseWebDriverQuit() {
		driver.quit();
	}

	public static void reuseWebDriverClose() {
		driver.close();
	}

	public static void reuseWebDriverNavigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void reuseWebDriverNavigateBack() {
		driver.navigate().back();
	}

	public static void reuseWebDriverNavigateForward() {
		driver.navigate().forward();
	}

	public static void reuseWebDriverNavigateRefrese() {
		driver.navigate().refresh();
	}

	public static WebElement reuseWebElementIdFindElement(String id) {
		return driver.findElement(By.id(id));
	}
	
	public static List<WebElement> reuseWebElementIdFindElements(String id) {
		return driver.findElements(By.id(id));
	}

	public static WebElement reuseWebElementNameFindElement(String name) {
		return driver.findElement(By.name(name));
	}

	public static List<WebElement> reuseWebElementNameFindElements(String name) {
		return driver.findElements(By.name(name));
	}
	
	public static WebElement reuseWebElementClassnameFindElement(String classname) {
		return driver.findElement(By.className(classname));
	}
	
	public static List<WebElement> reuseWebElementClassnameFindElements(String classname) {
		return driver.findElements(By.className(classname));
	}

	public static WebElement reuseWebElementXpathFindElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public static List<WebElement> reuseWebElementXpathFindElements(String xpath) {
		return driver.findElements(By.xpath(xpath));
	}

	public static void reuseWebElementSendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void reuseWebElementClick(WebElement element) {
		element.click();
	}

	public static void reuseWebElementClear(WebElement element) {
		element.clear();
	}

	public static void reuseWebElementIsDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public static void reuseWebElementIsEnabled(WebElement element) {
		element.isEnabled();
	}

	public static void reuseWebElementIsSelected(WebElement element) {
		element.isSelected();
	}

	public static void reuseWebElementSubmit(WebElement element) {
		element.submit();
	}

	public static String reuseWebElementGetAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public static void reuseActionsClick(WebElement element) {
		acc.click(element).perform();
	}

	public static void reuseActionsContextClick(WebElement element) {
		acc.contextClick(element).perform();
	}

	public static void reuseActionsDoubleClick(WebElement element) {
		acc.doubleClick(element).perform();
	}

	public static void reuseActionsDragAndDrop(WebElement element1, WebElement element2) {
		acc.dragAndDrop(element1, element2).perform();
	}

	public static void reuseActionsMoveToElement(WebElement element) {
		acc.moveToElement(element).perform();
	}

	public static void reuseActionsSendKeys(WebElement element) {
		acc.sendKeys(element).perform();
	}

	public static void reuseRobotDownPress() {
		robot.keyPress(KeyEvent.VK_DOWN);
	}

	public static void reuseRobotDownRelease() {
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void reuseRobotUpPress() {
		robot.keyPress(KeyEvent.VK_UP);
	}

	public static void reuseRobotUpRelease() {
		robot.keyRelease(KeyEvent.VK_UP);
	}

	public static void reuseRobotControlPress() {
		robot.keyPress(KeyEvent.VK_CONTROL);
	}

	public static void reuseRobotControlRelease() {
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void reuseRobotCopyPress() {
		robot.keyPress(KeyEvent.VK_COPY);
	}

	public static void reuseRobotCopyRelease() {
		robot.keyRelease(KeyEvent.VK_COPY);
	}

	public static void reuseRobotPastePress() {
		robot.keyPress(KeyEvent.VK_PASTE);
	}

	public static void reuseRobotPasteRelease() {
		robot.keyRelease(KeyEvent.VK_PASTE);
	}

	public static void reuseRobotCutPress() {
		robot.keyPress(KeyEvent.VK_CUT);
	}

	public static void reuseRobotCutRelease() {
		robot.keyRelease(KeyEvent.VK_CUT);
	}

	public static void reuseRobotEnterPress() {
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public static void reuseRobotEnterRelease() {
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void reuseAlertAccept() {
		alert.accept();
	}

	public static void reuseAlertDismiss() {
		alert.dismiss();
	}

	public static void reuseAlertSendKeys(String key) {
		alert.sendKeys(key);
	}

	public static void reuseSelectByIndex(WebElement element, int i) {
		select = new Select(element);
		select.selectByIndex(i);
	}

	public static void reuseSelectByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	public static void reuseSelectByVisibleText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void reuseSelectDeselectByIndex(WebElement element, int i) {
		select = new Select(element);
		select.deselectByIndex(i);
	}

	public static void reuseSelectDeselectByValue(WebElement element, String value) {
		select = new Select(element);
		select.deselectByValue(value);
	}

	public static void reuseSelectDeselectByVisibleText(WebElement element, String text) {
		select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public static void reuseSelectDeselectAll(WebElement element) {
		select = new Select(element);
		select.deselectAll();
	}

	public static void reuseSelectGetOptions(WebElement element) {
		select = new Select(element);
		System.out.println("Get options");
		List<WebElement> options = select.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	}

	public static boolean reuseSelectIsMultiple(WebElement element) {
		select = new Select(element);
		boolean data = select.isMultiple();
		return data;
	}

	public static void reuseSelectGetFirstSelectedOption(WebElement element) {
		select = new Select(element);
		System.out.println("Get first selected option");
		WebElement result = select.getFirstSelectedOption();
		System.out.println(result.getText());
	}

	public static void reuseSelectGetAllSelectedOption(WebElement element) {
		select = new Select(element);
		System.out.println("All selected options");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement result : allSelectedOptions) {
			System.out.println(result.getText());
		}
	}

	public static TakesScreenshot reuseTakesScreenshotTypeCasting() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		return tk;
	}

	public static File reuseTakesScreenshotSourceFile(TakesScreenshot tk) {
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	public static File reuseScreenshortFiledestinationFile(String name) {
		File file = new File("C:\\Users\\KABI\\java project\\Sample\\Screenshort\\" + name + ".jpeg");
		return file;
	}

	public static JavascriptExecutor reuseJavascriptExecutorTypeCasting() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	public static void reuseJavascriptExecutorScriptSetAttribute(JavascriptExecutor jse, WebElement element,String str) {
		jse.executeScript("arguments[0].setAttribute('value','"+str+"')", element);
	}
	
	public static void reuseJavascriptExecutorScriptWindowScrollIntoView(JavascriptExecutor jse, WebElement element) {
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static String reuseJavascriptExecutorScriptGetAttribute(JavascriptExecutor jse,WebElement element) {
		String result=(String)jse.executeScript("return arguments[0].getAttribute('value')", element);
		return result;
	}
	
	public static void reuseJavascriptExecutorClick(JavascriptExecutor jse,WebElement element) {
		jse.executeScript("arguments[0].click()", element);
	}
	
	public static void reuseJavascriptExecutorScriptWindowScrollBy(JavascriptExecutor jse, int x, int y) {
		jse.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

}