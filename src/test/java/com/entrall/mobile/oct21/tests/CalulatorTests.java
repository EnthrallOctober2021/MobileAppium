package com.entrall.mobile.oct21.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.enthrall.mobile.oct21.setup.BaseClass;

public class CalulatorTests extends BaseClass{

	@Test(enabled = false)
	public void addition() {
		objects.eight.click();
		objects.add.click();
		objects.five.click();
		objects.equal.click();
		
		String actual = commons.getText(objects.result);
		
		Assert.assertEquals(actual, 10);
	}
	
	@Test(enabled = true)
	public void testWebApp() {
		driver.get("https://youtube.com/");
	}
	
	@Test(enabled = false)
	public void testUploadedApp() {
		//I will take care of it later
	}
}
