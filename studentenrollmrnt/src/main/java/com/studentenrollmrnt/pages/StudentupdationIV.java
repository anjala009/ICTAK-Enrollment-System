package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class StudentupdationIV extends TestBase{
	WebDriver driver;
	 @FindBy(xpath="//input[@name=\"address\"]")
		WebElement address;
	 @FindBy(xpath="//button[@type=\"submit\"]")
		WebElement submit;
	 public StudentupdationIV(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	     public void Addressclick(String straddress) 
		 {
			 address.clear();
		         address.sendKeys(straddress);
		 }
	     public void Submitclick() 
		 {
		        submit.click();
		 }
	 

}
