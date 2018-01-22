package com.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.Base;

public class HomePage extends Base {
	
	public HomePage(WebDriver driver) {
		  this.driver = driver;
	}
	
	private static WebElement element = null;
	
	public static WebElement lnk_Login(WebDriver driver)
	{
		element = driver.findElement(By.id("loginbtn"));
		return element;
		
	}
	
	public static WebElement lnk_Logout(WebDriver driver)
	{
		element = driver.findElement(By.id("loginbtn"));
		return element;
		
	}

}
