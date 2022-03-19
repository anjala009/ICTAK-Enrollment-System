package com.studentenrollmrnt.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;



public class StudentLogin extends TestBase{

 WebDriver driver;

 @FindBy(xpath="//a[@href=\"/login/studentlogin\"]")
	WebElement studentlogin;
 
 @FindBy(xpath="//input[@type=\"email\"]")
	WebElement email;
	

	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//select[@name=\"role\"]/option[@value=\"student\"]")
	
	WebElement Role;
	
	@FindBy(name="sign-in")
	WebElement signin;
 

 public StudentLogin(WebDriver driver){
     this.driver = driver;
     //This initElements method will create all WebElements
     PageFactory.initElements(driver, this);
 }
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
 public void setRole(String strrole)
 {
 	Role.click();
 }
 
 public StudentLogedInPage clicklogin() 
 {
         signin.click();
         return new StudentLogedInPage(driver);
 }



         
         
         
         
         
 }
 
 
 
 
 
 
 
 
 
 
 

