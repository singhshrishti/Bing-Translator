package com.Automation.Bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
	public static WebDriver driver;
	String url = "https://www.bing.com/translator";
	String driverPath = "C:\\Users\\shrishtisingh\\Desktop\\chromedriver_win32\\chromedriver.exe";
	
	
	Boolean  condition = false;
	String Arr[] = new String[2];
	
	public void BeforeClassLauncher() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}	
	
	public void first_input() {
	     Select DValue = new Select(driver.findElement(By.id("t_sl")));
	     DValue.selectByVisibleText("Spanish");
			System.out.println();

		}

		public void second_input() {
			Select oValue = new Select(driver.findElement(By.id("t_tl")));
			oValue.selectByVisibleText("English");
			System.out.println(oValue);

}
		
		public void HardWait(long time) throws InterruptedException {
			Thread.sleep(time);
		}
		
		
public void sendtext() {
	driver.findElement(By.id("t_sv")).sendKeys("Hola");		
		}

public String[] Test_Swap_Button() {
	
	driver.findElement(By.cssSelector(".ttop_switch")).click();
	Arr[0] = driver.findElement(By.id("t_sl")).getText();
	Arr[1] = driver.findElement(By.id("t_tl")).getText();
	return Arr;
}


public boolean translation() throws InterruptedException {
Thread.sleep(10000);
	WebElement translatedtext = driver.findElement(By.id("t_tv"));
	System.out.println(translatedtext.getAttribute("value").toString());
	String translateText = translatedtext.getAttribute("value");
	if(translateText.equals("Hello"))
		 condition = false;
	return condition;

}

}
