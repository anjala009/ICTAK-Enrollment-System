package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.studentenrollmrnt.testbase.TestBase;

public class Employesearchname extends TestBase  {
WebDriver driver;
/**
 * All WebElements are identified by @FindBy annotation
 */
	
	@FindBy(xpath="//input[@id=\"listSearch\"]")
	WebElement search;
	
	public Employesearchname(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	//set search iteams in textfield
	public void Search(String strname)
	{
		driver.get("http://64.227.182.128/search");
		search.clear();
		search.sendKeys(strname);
		
	}
	
}
