package com.enthrall.mobile.oct21.practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SimpleTest {

	public static WebDriver driver;
	
	@Test(enabled = false)
	public void testASimpleAppiumScript() throws MalformedURLException {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("platformName","Android");
		//ds.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability("platformVersion", "12");
		ds.setCapability("deviceName", "Pixel 4 XL");
		ds.setCapability("udid", "9C181FFBA000S0");
		
		ds.setCapability("appPackage", "com.google.android.calculator");
		ds.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new RemoteWebDriver(url, ds);
		
		System.out.println("Appium Started...");
		
		WebElement element = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
		element.click();
		element = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		element.click();
		element = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		element.click();
		element = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		element.click();
		
		element = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
		
		System.out.println("Result is : " + element.getText());
	}
	
	@Test(enabled = false)
	public void testWithApp() throws MalformedURLException {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("platformName","Android");
		//ds.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability("platformVersion", "12");
		ds.setCapability("deviceName", "Pixel 4 XL");
		ds.setCapability("udid", "9C181FFBA000S0");
		
		ds.setCapability("app","C:\\Users\\mdnas\\eclipse-workspace\\com.enthrall.mobile.oct21\\apps\\Android-MyDemoAppRN.1.2.0.build-231.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new RemoteWebDriver(url, ds);
		
		System.out.println("Appium Started...");
	}
	
	@Test
	public void testWithGrubHub() throws MalformedURLException {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("platformName","Android");
		//ds.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		ds.setCapability("platformVersion", "12");
		ds.setCapability("deviceName", "Pixel 4 XL");
		ds.setCapability("udid", "9C181FFBA000S0");
		ds.setCapability("fullReset", "true");
		
		ds.setCapability("app","C:\\Users\\mdnas\\eclipse-workspace\\com.enthrall.mobile.oct21\\apps\\GrubhubLocalFoodDeliveryRestaurantTakeout.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new RemoteWebDriver(url, ds);
		
		System.out.println("Appium Started...");
	}
}
