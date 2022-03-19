package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class StudentLogedInPage extends TestBase{
	WebDriver driver;
	@FindBy(xpath="//a[@routerlink=\"home\"]")
	WebElement home;
	@FindBy(xpath="//a[text()=\"Courses\"]")
	WebElement courses;
	@FindBy(xpath="//a[@class=\"section-btn btn smoothScroll\"]")
	WebElement viewprofile;
	@FindBy(xpath="//a[text()=\"Logout\"]")
	WebElement logout;
	
	public StudentLogedInPage(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	
	public void clickHomeLink()
	{
		home.click();		
	}
	
	public void clickCourseLink()
	{
		courses.click();	
		
	}
	
	public void clickViewProfileLink()
	{
		viewprofile.click();	
		
	}
	public void clickLogoutLink()
	{
		logout.click();	
		
	}


}
