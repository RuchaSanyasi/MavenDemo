package AutomationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// import packeges in com.pageObjectModel
import com.pageObjectModel.HomePage;
import com.pageObjectModel.LoginPage;

public class LoginTest {
	
	 private static WebDriver driver = null;
	 
	 /*
	 
	 public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://alexandriavirginiahomesearch.com");
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 HomePage.lnk_Login(driver).click();
		 
		 LoginPage.txt_username(driver).sendKeys("nirajp@brokeragent360.com");
		 LoginPage.txt_password(driver).sendKeys("1234567890");
		 LoginPage.btn_login(driver).click();
		 System.out.println("Login successfully");
	
		 
	 }*/
	 
	 @BeforeTest
		public void LaunchBrowser() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
			driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get("http://alexandriavirginiahomesearch.com");
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	 
	 @Test(description ="Login")
		public void Login() throws InterruptedException {
 HomePage.lnk_Login(driver).click();
		 
		 LoginPage.txt_username(driver).sendKeys("nirajp@brokeragent360.com");
		 LoginPage.txt_password(driver).sendKeys("123456789");
		 LoginPage.btn_login(driver).click();
		 System.out.println("Login successfully");
		 
		 
	 }
	 }
	 
	 


