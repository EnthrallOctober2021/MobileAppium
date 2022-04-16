package com.enthrall.mobile.oct21.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectClass {

	public ObjectClass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "com.google.android.calculator:id/digit_1")
	public WebElement one;
	@FindBy(id = "com.google.android.calculator:id/digit_2")
	public WebElement two;
	@FindBy(id = "com.google.android.calculator:id/digit_3")
	public WebElement three;
	@FindBy(id = "com.google.android.calculator:id/digit_4")
	public WebElement four;
	@FindBy(id = "com.google.android.calculator:id/digit_5")
	public WebElement five;
	@FindBy(id = "com.google.android.calculator:id/digit_6")
	public WebElement six;
	@FindBy(id = "com.google.android.calculator:id/digit_7")
	public WebElement seven;
	@FindBy(id = "com.google.android.calculator:id/digit_8")
	public WebElement eight;
	@FindBy(id = "com.google.android.calculator:id/digit_9")
	public WebElement nine;
	@FindBy(id = "com.google.android.calculator:id/digit_0")
	public WebElement zero;
	@FindBy(id = "com.google.android.calculator:id/op_add")
	public WebElement add;
	@FindBy(id = "com.google.android.calculator:id/eq")
	public WebElement equal;
	@FindBy(id = "com.google.android.calculator:id/result_final")
	public WebElement result;
}
