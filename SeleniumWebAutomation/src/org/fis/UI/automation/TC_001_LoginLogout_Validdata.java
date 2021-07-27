package org.fis.UI.automation;

import org.fis.UI.base.BeginDriver;
import org.fis.UI.library.PropertyReader;
import org.fis.UI.library.TakeScreenshot;
import org.fis.UI.pages.login;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TC_001_LoginLogout_Validdata extends BeginDriver {
	
	
	

	
	@Test
	public  void testCase1() throws Exception {
		
		SoftAssert verify = new SoftAssert(); 
		//operations.verticalscroll();
		log.enterusername("abcd");
		log.enterpassword("abcd");
	    TakeScreenshot.takeBrowserScreenshot("AfterLogin");
		log.clicksignin();
		//Thread.sleep(5000);
		//validatepage.validatePageURL("https://www.facebook.com");
		//Assert.assertTrue(validatepage.validatePageURL("https://www.facebook.com"), "[After login : Home page is not opened]");
		//System.out.println("End of test case");
		verify.assertTrue(validatepage.validatePageURL("https://www.facebook.com"), "[After login : Home page is not opened]");
		verify.assertTrue(validatepage.validatePageTitle(PropertyReader.getExpectedvalue("Registration_Page_Tittle")), "Notfind");
		//verify.assertTrue(validatepage.validateTextOnPage("helloworld"), "[After login : Home page is not opened]");
		//verify.assertTrue(validatepage.validateElementOnPage("//input[@id='abcd']"), "[After login : Home page is not opened]");
		System.out.println("End of test case");
		verify.assertAll();
		
		
		
		
		/*driver.findElementById("email").sendKeys("testingfacebook");
		driver.findElementById("pass").sendKeys("testing");
		driver.findElementByXPath("//button[@value='1']").click();
		Thread.sleep(5000);*/
		
		
		
		
		
		
		/*Actions keyboard = new Actions(driver);
		//driver.findElementByXPath("//input[@class ='gLFyf gsfi']").sendKeys("testing");
		//driver.findElementByXPath("//input[@class ='gLFyf gsfi']").sendKeys("");
		//keyboard.sendKeys("testing").perform();
		String s = "Testing";
		for(int i=0; i <s.length();i++) {
			
			keyboard.sendKeys(String.valueOf(s.charAt(i))).perform();*/
			
		
		
		
		//driver.findElementByXPath("//div[@id ='container']/span[@id='contents']/span[contains(text(),'testing')]/following-sibling::span[contains(text(),'for covid 19')]").click();
		
	
		
		
		/*keyboard.keyDown(Keys.CONTROL).perform();
		keyboard.sendKeys("a").perform();
		keyboard.sendKeys("c").perform();
		keyboard.keyUp(Keys.CONTROL).perform();
		
	
		keyboard.sendKeys(Keys.TAB).perform();
		keyboard.keyDown(Keys.CONTROL).perform();
		keyboard.sendKeys("v").perform();
		keyboard.keyUp(Keys.CONTROL).perform();
		
		
		
		
		
	
		keyboard.keyDown(Keys.CONTROL).perform();
		keyboard.keyDown(Keys.SHIFT).perform();
		keyboard.sendKeys("o").perform();
		keyboard.keyUp(Keys.SHIFT).perform();
		keyboard.keyUp(Keys.CONTROL).perform();*/
		
		
		/*Actions mouse = new Actions(driver);
		//driver.findElementByXPath("//span[text()='VIDEOS']");
		Thread.sleep(2000);
		mouse.moveToElement(driver.findElementByXPath("//span[contains(text(),'TUTORIAL')]")).perform();
		mouse.moveToElement(driver.findElementByXPath("//span[contains(text(),'PERFORMANCE AUTOMATION')]")).perform();
		mouse.moveToElement(driver.findElementByXPath("//span[contains(text(),'Performance Testing using JMeter')]")).perform();
		mouse.click(driver.findElementByXPath("//span[contains(text(),'Performance Testing using JMeter')]")).perform();
		
		
		
		Thread.sleep(2000);*/
		/*driver.findElementByName("q").sendKeys("abcd");
		Thread.sleep(5000);
		mouse.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		//mouse.click(driver.findElementByXPath("//a[text()='Gmail']")).perform();
		//mouse.contextClick(driver.findElementByXPath("//a[text()='Gmail']")).perform();
		mouse.doubleClick(driver.findElementByXPath("//a[text()='Gmail']")).perform();*/
		
		
		
		
		
		
	
		

	}
	
	

}
