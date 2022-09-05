package org.jjjjjunittt.test;

import java.time.Duration;

import javax.swing.SortOrder;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

//	Declared webdriver in instance variable so common for all parent and child
	public static WebDriver driver;

//	Launch the browser from parent class without creating object 	
	public static WebDriver browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

//	URL Launch

	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
////	Date
//	public static void date() {
//		date d = new date();
//		
				

	

//	Implicitlywait and maximize the screen method 
//	and apply parameter for calling seconds manually

	public static void time(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));
		driver.manage().window().maximize();
	}

//	Clear

	public static void clear(WebElement c) {
		c.clear();

	}

//	Sendkeys 
	public static void sendKeys(WebElement s, String value) {
		s.sendKeys(value);
	}

//	Click
	public static void click(WebElement btn) {
		btn.click();

	}
//	Dropdowns step below

	public static void dropDown(WebElement element, String option, String value) {
		Select s = new Select(element);

		if (option.equalsIgnoreCase("ByIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (option.equalsIgnoreCase("ByValue")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (option.equalsIgnoreCase("ByVisibletext")) {
			s.selectByVisibleText(value);
		}
	}
//		Print Order number 
//		
//		public static String orderNumber(WebElement or) {
//			attribute = or.getAttribute("value");
//			  return attribute;

//		}

//		close the browser

	public static void quitt(WebDriver q) {
		q.quit();

	}

//		Alert - Always use Switchto.alert();

	public static void simpleAlert() {
		Alert aa = driver.switchTo().alert();
		aa.accept();
	}

	public static void confirmAl() {
		Alert ac = driver.switchTo().alert();
		ac.accept();
		ac.dismiss();
	}
	public static void promptAl() {
		Alert ap = driver.switchTo().alert();
		ap.sendKeys("done");
		ap.accept();
		ap.dismiss();
		
		
		
	}
	
}
	
	

