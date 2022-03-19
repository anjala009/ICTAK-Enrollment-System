package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class EmployeLoginVEIP extends TestBase{
	WebDriver driver;
	/**
     * All WebElements are identified by @FindBy annotation
     */

	 @FindBy(xpath="//a[@href=\"/login/studentlogin\"]")
		WebElement studentlogin;
	 
	 @FindBy(xpath="//input[@type=\"email\"]")
		WebElement email;
		
     @FindBy(xpath="//input[@type=\"password\"]")
		WebElement password;
		
	 @FindBy(xpath="//select[@name=\"role\"]/option[@value=\"employee\"]")
		
		WebElement Role;
		
	 @FindBy(name="sign-in")
		WebElement signin;
	 

	 public EmployeLoginVEIP(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	 //click login
	 public void studentclick() 
	 {
	         studentlogin.click();
	 }

	 //Set email in textbox
	 public void setEmail(String strEmail){
		 email.clear();
	         email.sendKeys(strEmail);     
	 }
	         
	//Set password textbox
	 public void setPassword(String strPassword){
		 password.clear();
	 	password.sendKeys(strPassword);     
	 }
	 //select student
	 public void setRole(String strrole)
	 {
	 	Role.click();
	 }
	 //click login
	 public EmployeLogedInPage clicklogin() 
	 {
	         signin.click();
	         return new EmployeLogedInPage(driver);
	 }



}
