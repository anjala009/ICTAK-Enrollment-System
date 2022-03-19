package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class EmployeLogedInPage extends TestBase{
	
	WebDriver driver;
	/**
     * All WebElements are identified by @FindBy annotation
     */
	
	@FindBy(xpath="//a[@routerlink='home']")
	WebElement homeLink;

	@FindBy(xpath="//a[@routerlink='courses']")
	WebElement courseLink;
	
	@FindBy(xpath="//a[@routerlink='students']")
	WebElement studlink;
	
	@FindBy(xpath="//a[@routerlink=\"search\"]")
	WebElement searchlink;
	@FindBy(xpath="//div//a[text()=\"Logout\"]")
	WebElement logoutlink;


	public EmployeLogedInPage(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	//Click home 
	public void clickHomeLink()
	{
		homeLink.click();		
	}
	//Click courses
	public void clickCourseLink()
	{
		courseLink.click();		
	}
	//click students all
	public void clickStudLink()
	{
		studlink.click();	
		
	}
	//click search

	public void clickSearchLink()
	{
		
		searchlink.click();	
		
	}
	//click logout
	public void clickLogoutLink()
	{
		
		logoutlink.click();	
		
	}

}
