package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class StudentupdationwithIE extends TestBase{
	WebDriver driver;
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement email;
	 @FindBy(xpath="//button[@type=\"submit\"]")
		WebElement submit;
	 public StudentupdationwithIE(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	 public void Emailclick(String stremail) 
	 {
		 email.clear();
	         email.sendKeys(stremail);
	 }
	 public void Submitclick() 
	 {
	        submit.click();
	 }


}
