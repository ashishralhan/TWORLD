package org.fis.UI.automation;

import org.fis.UI.base.BeginDriver;
import org.fis.UI.pages.login;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_002_loginlogout_invaliddata extends  BeginDriver {

	

	@Test
	public  void testCase2() 
	
	{
		
		
		/*log.enterusername("testing");
		log.enterpassword("");
		log.clicksignin();*/
		
		
		EventDriver.findElement(By.id("email")).sendKeys("abcd");
		EventDriver.findElement(By.xpath("//button[@value='1']")).click();
		
		
		
		
		 
	}
	
	
	
}
