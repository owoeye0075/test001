package com.inetbanking.testcases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	public String baseURL= "https://www.amazon.co.uk";
	public String CusName= "Adebayo Owoeye";
	public String password ="nobodylikejesus";
	public String Cusemail ="owoeye007@gmail.com";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver//chrom84//chromedriver84.4//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.switchTo().alert().accept();
		logger =Logger.getLogger("amazonTest");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	

}
