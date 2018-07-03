package com.Automation.Bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AppTest extends Main{
	
	 Main baseObject = new  Main();
	
	Drop_down dropDown= new Drop_down ();	
	Swap_Button SwapButton = new Swap_Button();
	
	@BeforeClass
	public void Launch_Browser() {
		baseObject.BeforeClassLauncher();
	}


@Test (priority = 0)
public void BingTest() throws InterruptedException {
	dropDown.TEST_BING_AUTOMATED();

}

@Test (priority = 1)
public void SawpTest() throws InterruptedException {
	SwapButton.Click_SwapButton();
}

@AfterClass
public void afterClass() {


}
}
