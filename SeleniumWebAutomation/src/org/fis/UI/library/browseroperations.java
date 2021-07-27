package org.fis.UI.library;

import org.fis.UI.base.BeginDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class browseroperations extends BeginDriver {
	
	
	
	public void verticalscroll() 
	{
		while(driver.findElement(By.xpath("//a[contains(text(),'Create Page')]")).isDisplayed()==false)
		{
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollTo(0,100)", "");
		}
	 }
	
	
	public void horizontalscroll() 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollTo(400,0)", "");
	 }


}




