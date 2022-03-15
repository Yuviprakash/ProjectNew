package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// 1.CHROMEBROWZER LAUNCH
	public static WebDriver chromeLaunch() {

		WebDriverManager.chromedriver().setup(); // same as system.setpropertity funtion
		driver = new ChromeDriver(); // OBJECT CREATION
		return driver; // RETURN STATEMENT SHOULD BE IN LAST LINE ALWAYS
	}

	// 2.EdgeBROWZER LAUNCH
	public static WebDriver edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;
	}

	// 3.FIREFOX BROWZER LAUNCH
	public static WebDriver fireFoxlaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;
	}

	// 4.IMPLICITY WAIT
	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// 5.Maximize method
	public static void maxi() {
		driver.manage().window().maximize();
	}

	// 6.URL LAUNCH
	public static void urlLaunch(String url) {
		driver.get(url);

	}

	// 7.getTitle();
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 8.getCurrenturl();
	public static String getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 9.quit();
	public static void quit() {
		driver.quit();
	}
	

	// 10.close();
	public static void close() {
		driver.close();
	}

	// 11.sendKeys();
	public static void sendKeys(WebElement e, String data) {
		e.sendKeys(data);

	}// 12.gettext()

	public static String getTextt(WebElement e) {
		String text = e.getText();
		return text;
	}

	// 13.getAttribue
	public static String getAttribute(WebElement e) {
		String s = e.getAttribute("value");
		return s;
	}

	// 14.findElement();
	public static WebElement findElement(String dom) {
		WebElement e = driver.findElement(By.xpath(dom));
		return e;
	}
	// click
	 public static void click(WebElement c) {
		c.click();

	}

	
	
	// 15. findElements();

	private void findElements() {
		// TODO Auto-generated method stub

	}

	//////////// ALERT HANDLING /////////
	// 16. alertOk();
	public static void alertOk() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// 17. alertCancel();
	public static void alertCancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	// 18.promptAlert();
	public static void promptAlert(WebElement e, String data) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);
	}

	//////////// TAKESCREENSHOT-- INTERFACE////////
	// 20. screenshot();
	public static void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE); // from
		FileUtils.copyFile(from,
				new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Jan\\Screenshot\\screehshotfile.png")); // form , to
	}
	////////// JAVA SCRIPT --- INTERFACE/////////
	
	//21. scroolDown();
	public static void scroolDown(WebElement down) {
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", down);
	}
	//21. scroolUp();
	public static void scroolUp(WebElement up) {
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", up);
	}

}
