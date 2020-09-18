package com.Testlog4j;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/**
 * Its a Logger Structure Program
 * @author Vijay
 *
 */
public class Test1
{
	/**
	 * its very important to logger class for creating the logs
	 */
private static	Logger log = Logger.getLogger(Test1.class);
	public WebDriver driver ;
	
	static
	{
          System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@BeforeClass
	public void launchbrowser()
	{
		log.info("Browser Lauch");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		log.fatal(getClass());
		
	}
//	@Listeners(TestListner.TestngListner.class)
	@Test(priority = 1)
	public void start() throws InterruptedException
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("log4j propertyFiles ");
		Thread.sleep(2000);
		List<WebElement> search = driver.findElements(By.xpath("//li"));
		System.out.println(search.size());
		log.info("******Size is*******"+search.size());
		Thread.sleep(3000);
		log.info("*********Search list is*******");
		for(WebElement s:search)
		{
			System.out.println(s.getText());
		}
		
		log.warn("****Some time its not recorganize*********");
		search.clear();
		
	}
//	@Listeners(TestListner.TestngListner.class)
	@Test(priority = 2,dependsOnMethods ="start")
	public void list()
	{
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		log.info("*******no.of links are******");
		log.info(links.size());
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
		
	}
	

}
