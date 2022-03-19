package com.studentenrollmrnt.scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.studentenrollmrnt.pages.StudentLogedInPage;
import com.studentenrollmrnt.pages.StudentLogin;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;


public class TestClassStudentLogedInPage extends TestBase{

	StudentLogedInPage obj2;
	com.studentenrollmrnt.pages.StudentLogin objLogin;
	@Test(priority=0)
    public void verifyValidLogin() throws IOException {
    //Create Login Page object
    objLogin = new StudentLogin(driver);
    //login to application
    String email= ExcelUtilities.getCellData(0, 0);
    String password =ExcelUtilities.getCellData(0, 1);
    String  Role=ExcelUtilities.getCellData(1, 0);
    objLogin.studentclick();
    objLogin.setEmail(email);
    objLogin.setPassword(password);
    objLogin.setRole(Role);
    objLogin.clicklogin();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    alert.accept();
	}
	 
	@Test(priority=1)
	
	public void HomePage() throws Exception
	{
		obj2= new StudentLogedInPage(driver);
		obj2.clickHomeLink();
		String homePageUrlActual=driver.getCurrentUrl();
		
		String homePageUrlExp="http://64.227.182.128/home";
		Assert.assertEquals(homePageUrlExp, homePageUrlActual);
	}
	
	@Test(priority=2)
	
	public void CoursePage() throws Exception
	{
		obj2 = new StudentLogedInPage(driver);
		obj2.clickCourseLink();
		String coursePageUrlActual=driver.getCurrentUrl();
	
		String coursePageUrlExp="http://64.227.182.128/courses";
		Assert.assertEquals(coursePageUrlExp, coursePageUrlActual);
	}
	
	@Test(priority=3)
	
	public void ViewProfilePage() throws Exception
	{
		//Create Login Page object
		obj2 = new StudentLogedInPage(driver);
		Thread.sleep(60000);
		obj2.clickHomeLink();
		Thread.sleep(60000);
		obj2.clickViewProfileLink();
		String viewprofileActual=driver.getCurrentUrl();
		
		String viewprofileUrlExp="http://64.227.182.128/student";
		Assert.assertEquals(viewprofileUrlExp, viewprofileActual);
		Thread.sleep(60000);
	}
@Test(priority=4)
	
	public void LogoutPage() throws Exception
	{
		//Create Login Page object
		obj2 = new StudentLogedInPage(driver);
		obj2.clickHomeLink();
		obj2.clickLogoutLink();
		String logoutActual=driver.getCurrentUrl();
		
		String logoutUrlExp="http://64.227.182.128/login/studentlogin";
		Assert.assertEquals(logoutUrlExp, logoutActual);
	}
}
