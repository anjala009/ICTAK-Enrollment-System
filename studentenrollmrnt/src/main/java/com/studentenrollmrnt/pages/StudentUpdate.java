package com.studentenrollmrnt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studentenrollmrnt.testbase.TestBase;

public class StudentUpdate extends TestBase{
	 WebDriver driver;

	 @FindBy(xpath="//input[@name=\"name\"]")
		WebElement name;
	 @FindBy(xpath="//input[@name=\"email\"]")
		WebElement email;
	 @FindBy(xpath="//input[@name=\"phone\"]")
		WebElement phone;
	 @FindBy(xpath="//input[@name=\"address\"]")
		WebElement address;
	 @FindBy(xpath="//input[@name=\"district\"]")
		WebElement district;
	 @FindBy(xpath="//input[@name=\"state\"]")
		WebElement state;
	 @FindBy(xpath="//input[@name=\"qualification\"]")
		WebElement qualification;
	 @FindBy(xpath="//input[@name=\"passout\"]")
		WebElement passout;
	 @FindBy(xpath="//input[@name=\"skills\"]")
		WebElement skills;
	 @FindBy(xpath="//select[@name=\"employmentStatus\"]/option[@value=\"employee\"]")
		WebElement employestatus;
	 @FindBy(xpath="//input[@name=\"techtraining\"]")
		WebElement techtraining;
	 @FindBy(xpath="//button[@type=\"submit\"]")
		WebElement submit;
	 public StudentUpdate(WebDriver driver){
	     this.driver = driver;
	     //This initElements method will create all WebElements
	     PageFactory.initElements(driver, this);
	 }
	 public void Nameclick(String strname) 
	 {
		 name.clear();
	         name.sendKeys(strname);
	 }  
	 public void Emailclick(String stremail) 
	 {
		 email.clear();
	         email.sendKeys(stremail);
	 }
	 public void Phoneclick(String strphone) 
	 {
		 phone.clear();
	         phone.sendKeys(strphone);
	 }
	 public void Addressclick(String straddress) 
	 {
		 address.clear();
	         address.sendKeys(straddress);
	 }
	 public void Districtclick(String strdistrict) 
	 {
		 district.clear();
	         district.sendKeys(strdistrict);
	 }
	 public void Stateclick(String strstate) 
	 {
		 state.clear();
	         state.sendKeys(strstate);
	 }
	 public void Qualificationclick(String strqualification) 
	 {
		 qualification.clear();
	        qualification.sendKeys(strqualification);
	 }
	 public void Passoutclick(String strpassout) 
	 {
		 passout.clear();
	        passout.sendKeys(strpassout);
	 }
	 public void Skillsclick(String strskill) 
	 {
		 skills.clear();
	        skills.sendKeys(strskill);
	 }
	 public void Employestatusclick(String stremploye) 
	 {
		 
	        employestatus.click();
	 }
	 public void Techtrainingclick(String techtraining2) 
	 {
		 techtraining.clear();
	        techtraining.sendKeys(techtraining2);
	 }
	 public void Submitclick() 
	 {
	        submit.click();
	 }
}
