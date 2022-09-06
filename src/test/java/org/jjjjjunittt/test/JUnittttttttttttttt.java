package org.jjjjjunittt.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnittttttttttttttt  extends BaseClass {

	
	@BeforeClass
	public static void BeforeClass() {
		browserlaunch();
		time(50);
	}
	
	@Before
	public void Before() {
		Date d = new Date();
		System.out.println(d);
	}
	@Before
	public void Before1() {
		Date d = new Date();
		System.out.println(d);
	}
	
	
	@Test
	public void Test() {
		urlLaunch("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9840482080");
		driver.findElement(By.id("pass")).sendKeys("9840482080");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Ignore
	@Test
	public void Test1() {
		urlLaunch("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9840482080");
		driver.findElement(By.id("pass")).sendKeys("9840482080");
		driver.findElement(By.name("login")).click();
		}
	
	@After
	public void After() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterClass
	public static void AfterClass() {
		quitt(driver);
	}
	
	@Test
	public void Test2() {
		urlLaunch("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9840482080");
		driver.findElement(By.id("pass")).sendKeys("9840482080");
		driver.findElement(By.name("login")).click();
	
	}
}
