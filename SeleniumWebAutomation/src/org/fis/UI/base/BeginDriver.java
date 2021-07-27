package org.fis.UI.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.fis.UI.Listeners.Listeners;
import org.fis.UI.Validations.ElementExceptions;
import org.fis.UI.Validations.pageValidations;
import org.fis.UI.library.PropertyReader;
import org.fis.UI.library.browseroperations;
import org.fis.UI.pages.login;
import org.fis.UI.pages.login2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeginDriver {

	
	 public static EventFiringWebDriver EventDriver;
	 public static WebDriver driver;
	 public static login log ; 
	 public static browseroperations operations; 
	 public static pageValidations validatepage; 
	 public static ElementExceptions elementvalidation;
	@BeforeMethod
	public void startBrowser() throws Exception {
		if(PropertyReader.getPropertyData("BrowserName").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		    driver = new ChromeDriver();
		   // driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   EventDriver = new  EventFiringWebDriver(driver); 
		   Listeners imp = new Listeners();
		   EventDriver.register(imp); 
			
		}
		
		else if(PropertyReader.getPropertyData("BrowserName").equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.chrome.driver", "./Driver/Firefoxdriver.exe");
		    driver = new FirefoxDriver();
		}
		
		//driver.get("https://www.thetestingworld.com");
	   driver.navigate().to("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.navigate().to(PropertyReader.getPropertyData("ApplicationURL"));
	    driver.manage().window().maximize();
	    log = PageFactory.initElements(driver, login.class);
	    operations = new browseroperations();
	    validatepage = new pageValidations();
	    elementvalidation = new ElementExceptions(); 
	   
	   
	   
	    
	 

	}
	
	
	@AfterMethod
	public void closeBrowser() {
		
		//driver.close();
		//driver.quit();
		
}
}
