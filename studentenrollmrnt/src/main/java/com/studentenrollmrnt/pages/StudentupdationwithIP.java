package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class StudentupdationwithIP extends TestBase{
	WebDriver driver;
	@FindBy(xpath="//input[@name=\"phone\"]")
	WebElement phone;
	WebElement email;
	 @FindBy(xpath="//button[@type=\"submit\"]")
		WebElement submit;
	 public StudentupdationwithIP(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	 public void Phoneclick(String strphone) 
	 {
		 phone.clear();
	         phone.sendKeys(strphone);
	 }
	 public void Submitclick() 
	 {
	        submit.click();
	 }


}
