package com.Testlog4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 
{
private static	Logger log = Logger.getLogger(Test2.class);
    public WebDriver driver ;
	
	static
	{
          System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	} 
	@BeforeClass
	public void launchbrowser()
	{
       log.info("Browser Lauch");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		log.fatal(getClass());
		
	}
	@Test
	public void startChrome()
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("facebook");
	}

}
