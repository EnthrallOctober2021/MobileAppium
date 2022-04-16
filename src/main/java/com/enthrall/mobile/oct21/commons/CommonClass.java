package com.enthrall.mobile.oct21.commons;

import org.openqa.selenium.WebElement;

public class CommonClass {

	public void click(WebElement element) {
		element.click();
	}
	
	public void input(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
}
