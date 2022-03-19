package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class StudentViewprofile extends TestBase{
	WebDriver driver;
	

	 @FindBy(xpath="//*[@id='home']//a[(text()='VIEW PROFILE')]")
		WebElement viewprofile;
	 @FindBy(xpath="//div[@class=\"btn update\"]//span[(text()=\"Update\")]")
		WebElement btnupdate;
	 public StudentViewprofile(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	 public void viewprofileclick() 
	 {
		 driver.get("http://64.227.182.128/home");
           viewprofile.click();
			
	 }
	 public void Btnupdateclick() 
	 {
		 driver.get("http://64.227.182.128/student");
	        btnupdate.click();
	 }


}
