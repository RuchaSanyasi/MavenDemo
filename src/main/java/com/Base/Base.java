package com.Base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import net.bytebuddy.asm.Advice.Return;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver getDriverInstance()
	{
		return driver;
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	}


