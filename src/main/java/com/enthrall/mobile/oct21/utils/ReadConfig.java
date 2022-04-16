package com.enthrall.mobile.oct21.utils;

import java.io.FileReader;
import java.util.Properties;

public class ReadConfig {

	private static String pathString = "./configurable/config.properties";

	private static String platformName;
	private static String platformVersion;
	private static String deviceName;
	private static String udid;
	private static String appPackage;
	private static String appActivity;
	private static String url;
	private static String userName;
	private static String accessKey;
	private static String region;
	
	public ReadConfig() {
		loadProperties();
	}
	
	private static void loadProperties() {
		try {
			FileReader reader = new FileReader(pathString);
			Properties properties = new Properties();
			properties.load(reader);
			platformName = properties.getProperty("platformName");
			platformVersion = properties.getProperty("platformVersion");
			deviceName = properties.getProperty("deviceName");
			udid = properties.getProperty("udid");
			appActivity = properties.getProperty("appActivity");
			appPackage = properties.getProperty("appPackage");
			url = properties.getProperty("url");
			userName = properties.getProperty("userName");
			accessKey = properties.getProperty("accessKey");
			region = properties.getProperty("region");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getPlatformName() {
		return platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public String getUdid() {
		return udid;
	}

	public String getAppPackage() {
		return appPackage;
	}

	public String getAppActivity() {
		return appActivity;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getRegion() {
		return region;
	}

}
