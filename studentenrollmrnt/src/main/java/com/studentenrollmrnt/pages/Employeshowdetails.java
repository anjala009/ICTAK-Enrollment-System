package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class Employeshowdetails extends TestBase{
	WebDriver driver;
	@FindBy(xpath="//button[@class=\"btn btn-primary\"]")
	WebElement showdetails;
	public Employeshowdetails(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	public void Showdetails()

	{
		driver.get("http://64.227.182.128/students");
		showdetails.click();
		
		
    }
}
