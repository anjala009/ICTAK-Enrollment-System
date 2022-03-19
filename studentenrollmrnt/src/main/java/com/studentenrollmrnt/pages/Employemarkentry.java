package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class Employemarkentry extends TestBase{
	WebDriver driver;
	/**
     * All WebElements are identified by @FindBy annotation
     */

	@FindBy(xpath="//button[@class=\"btn btn-info\"]")
	WebElement markentry;
	@FindBy(xpath="//input[@name=\"techtraining\"]")
	WebElement exitexammark;
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement update;
	
	public Employemarkentry(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	//click mark entry button
	public void Markentry()
	{
           markentry.click();
     }
	//set mark in textbox
	public void Exitexammark(String strmark)
	{
		exitexammark.clear();
		exitexammark.sendKeys(strmark);
     }
	//click update
	public void Update()
	{
		update.click();
     }
}
