package com.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.Base;

public class LoginPage extends Base{
	
	public LoginPage(WebDriver driver) {
		  this.driver = driver;
	}
	
	private static WebElement element = null;
	
	public static WebElement txt_username(WebDriver driver)
	{
		element = driver.findElement(By.id("Email"));
		return element;
	}
	
	public static WebElement txt_password(WebDriver driver)
	{
		element = driver.findElement(By.id("Password"));
		return element;
	}
	
	public static WebElement btn_login(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector(".btn-block"));
		return element;
	}

}
