package com.Testlog4j;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestData
{
	public WebDriver driver;
	static
	{
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	  System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	}
	@BeforeClass
	public void lanchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
	}
 @Test
 public void testData() throws InterruptedException
 {
	 driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 Thread.sleep(2000);
	 WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	 login.click();
	 Assert.assertTrue(login.isSelected(),"Showing the Boolean option::");
 }
}
