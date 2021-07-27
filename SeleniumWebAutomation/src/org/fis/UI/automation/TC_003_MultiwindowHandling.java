package org.fis.UI.automation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.fis.UI.base.BeginDriver;
import org.fis.UI.library.TakeScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_003_MultiwindowHandling  {
	
	
	@Test
	public  void multiWindow() throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver(); 
	  // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   //driver.get("https://www.naukri.com/");
	   driver.get("https://thetestingworld.com/testings/");
	   Select country = new Select(driver.findElementByName("country"));
	   country.selectByVisibleText("India");
	   //Thread.sleep(5000);
	   WebDriverWait wait = new WebDriverWait(driver,20); 
	   wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementByName("state"), "Delhi"));
	   Select state = new Select(driver.findElementByName("state"));
	   state.selectByVisibleText("Delhi");
	   driver.manage().window().maximize();
	 
	   
	   
	   /*List<WebElement> alllinks =   driver.findElementsByXPath("//a"); 
	  Thread.sleep(2000);
	  System.out.println(alllinks.size());
	  for(WebElement ele : alllinks){
		  
		  System.out.println(ele.getAttribute("href"));
		  driver.get(ele.getAttribute("href"));
	  }*/
	  
	 
	  /* driver.switchTo().frame("abcde");
	   driver.findElementById("abcde");
	   driver.switchTo().frame(driver.findElementByXPath(""));
	   driver.switchTo().alert().accept();
	   driver.switchTo().activeElement();
	   driver.findElementById("abcd").sendKeys("ashish");*/
	  /* String mainWindow =""; 
	   Set<String> allwindows = driver.getWindowHandles();
	   for(String s : allwindows){
		   
		   
		   // System.out.println(s);
		   driver.switchTo().window(s);
		  System.out.println(driver.getCurrentUrl());
		  if(driver.getCurrentUrl().equalsIgnoreCase("https://www.naukri.com/")){
			  
			  mainWindow = s; 
		  }else{
			  
			  Thread.sleep(5000);
			  driver.close();
			  
		  }
		  
		  driver.switchTo().window(mainWindow);
	   }*/
	  
}
	
	
}
