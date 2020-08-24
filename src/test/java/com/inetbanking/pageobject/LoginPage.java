package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
WebDriver ldriver; 

public LoginPage (WebDriver rdriver)
{
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(xpath= "//span[contains(text(),'Hello, Sign in')]")
@CacheLookup
WebElement clickSignIn;


@FindBy(xpath="//a[@id='createAccountSubmit']")
@CacheLookup
WebElement Clickregister;

@FindBy(id="ap_customer_name")
@CacheLookup
WebElement CustomerName;

@FindBy(id="ap_email")
@CacheLookup
WebElement CustomerEmail;

@FindBy(id="ap_password")
@CacheLookup
WebElement CustomerPass;

@FindBy(id="ap_password_check")
@CacheLookup
WebElement ConfirmPass;

@FindBy(id="continue")
@CacheLookup
WebElement ClickCreateAcct;

@FindBy(xpath="//*[@id=\"sp-cc-accept\"]")
@CacheLookup
WebElement AcceptCookies;



public void ClickSignIn()
{
	clickSignIn.click();
}

public void ClickRegister()
{
	Clickregister.click();
}

public void setUserName(String uname)
{
	CustomerName.sendKeys(uname);
}

public void SetCustomerEmail(String email)
{
	CustomerEmail.sendKeys("email");
}

public void SetCustomerPass(String pwd)
{
	CustomerPass.sendKeys(pwd);
}

public void EnterConfirmPass(String pwd) {
	ConfirmPass.sendKeys(pwd);
}
public void ClickRegisterBtn()
{
	ClickCreateAcct.click();
}
 public void AcceptCookies()
 {
	 AcceptCookies.click();
 }
}
