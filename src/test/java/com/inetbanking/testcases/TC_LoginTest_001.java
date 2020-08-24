package com.inetbanking.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws InterruptedException {
	driver.get(baseURL);
	logger.info("url opened");
	
	Thread.sleep(3000);
	LoginPage lp = new LoginPage(driver);

	
	lp.ClickRegister();
	logger.info("clicked register");
	
	lp.setUserName(CusName);
	logger.info("name enter successfully");
	
	lp.SetCustomerEmail(Cusemail);
	logger.info	("email enter successfully");
	
	lp.SetCustomerPass(password);
	logger.info("password enter successully");
	
	lp.EnterConfirmPass(password);
	logger.info("confirmed password enter successfully");
	
	lp.ClickRegisterBtn();
	logger.info("register button clicked successfully");
	
	
	//.RegistratnSucess();
	
	//if(RegistratnSucess
	
	WebElement 	login=	driver.findElement(By.xpath("//span[contains(text(),'Hello, ADEBAYO')]"));
	if (login.getText().equals("hello, ADEBAYO"))
	{
		Assert.assertTrue(true);
	}
	
	else 
	{
		Assert.assertTrue(false);
	}
	
	}
	

}
