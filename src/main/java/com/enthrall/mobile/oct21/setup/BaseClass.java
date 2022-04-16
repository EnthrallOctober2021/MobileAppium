package com.enthrall.mobile.oct21.setup;

import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.enthrall.mobile.oct21.commons.CommonClass;
import com.enthrall.mobile.oct21.objects.ObjectClass;
import com.enthrall.mobile.oct21.utils.ReadConfig;

public class BaseClass {

	public static WebDriver driver;

	public ReadConfig config;
	public CommonClass commons;
	public ObjectClass objects;

	@BeforeMethod
	public void setUpDriver() {
		// localDriver();
		//remoteDriver();
		remoteWebDriver();
	}

	private void localDriver() {
		try {
			initClasses();
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", config.getPlatformName());
			dc.setCapability("platformVersion", config.getPlatformVersion());
			dc.setCapability("deviceName", config.getDeviceName());
			dc.setCapability("udid", config.getUdid());
			dc.setCapability("appPackage", config.getAppPackage());
			dc.setCapability("appActivity", config.getAppActivity());
			URL url = new URL(config.getUrl());
			driver = new RemoteWebDriver(url, dc);
			objects = new ObjectClass(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void remoteDriver() {
		try {
			initClasses();
			MutableCapabilities caps = new MutableCapabilities();
			caps.setCapability("platformName", "Android");
			caps.setCapability("appium:app", "GrubhubLocalFoodDeliveryRestaurantTakeout.apk");
			caps.setCapability("appium:deviceName", "Google Pixel 4a (5G) GoogleAPI Emulator");
			caps.setCapability("appium:platformVersion", "12.0");
			MutableCapabilities sauceOptions = new MutableCapabilities();
			sauceOptions.setCapability("appiumVersion", "1.22.1");
			caps.setCapability("sauce:options", sauceOptions);
			URL url = new URL(config.getUserName()+config.getAccessKey()+config.getRegion());
			driver = new RemoteWebDriver(url, caps);
			objects = new ObjectClass(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void remoteWebDriver() {
		try {
			initClasses();
			MutableCapabilities caps = new MutableCapabilities();
			caps.setCapability("platformName", "Android");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("appium:deviceName", "Google Pixel 4a (5G) GoogleAPI Emulator");
			caps.setCapability("appium:platformVersion", "12.0");
			MutableCapabilities sauceOptions = new MutableCapabilities();
			sauceOptions.setCapability("appiumVersion", "1.22.1");
			caps.setCapability("sauce:options", sauceOptions);
			URL url = new URL(config.getUserName()+config.getAccessKey()+config.getRegion());
			driver = new RemoteWebDriver(url, caps);
			objects = new ObjectClass(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initClasses() {
		config = new ReadConfig();
		commons = new CommonClass();
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
}
