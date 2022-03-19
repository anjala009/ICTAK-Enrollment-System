package com.studentenrollmrnt.scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.studentenrollmrnt.pages.EmployeLogedInPage;
import com.studentenrollmrnt.pages.EmployeLogin;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;

public class TestClassEmpoyeLogedInPage extends TestBase{

	EmployeLogedInPage obj1;
	EmployeLogedInPage obj2;
	EmployeLogedInPage obj3;
	com.studentenrollmrnt.pages.EmployeLogin objLogin;
	@Test(priority=0)
    public void verifyValidLogin() throws IOException {
    //Create Login Page object
    objLogin = new EmployeLogin(driver);
    //login to application
    String email= ExcelUtilities.getCellData(0, 0);
    String password =ExcelUtilities.getCellData(0, 1);
    String  Role=ExcelUtilities.getCellData(1, 1);
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
		obj1 = new EmployeLogedInPage(driver);
		obj1.clickHomeLink();
		String homePageUrlActual=driver.getCurrentUrl();
		Thread.sleep(20000);
		String homePageUrlExp="http://64.227.182.128/home";
		Assert.assertEquals(homePageUrlExp, homePageUrlActual);
	}
	
	@Test(priority=2)
	
	public void CoursePage() throws Exception
	{
		obj2 = new EmployeLogedInPage(driver);
		obj2.clickCourseLink();
		String coursePageUrlActual=driver.getCurrentUrl();
		Thread.sleep(20000);
		String coursePageUrlExp="http://64.227.182.128/courses";
		Assert.assertEquals(coursePageUrlExp, coursePageUrlActual);
	}
	
	@Test(priority=3)
	
	public void StudentPage() throws Exception
	{
		//Create Login Page object
		obj3 = new EmployeLogedInPage(driver);
		
		obj3.clickStudLink();
		String StudPageUrlActual=driver.getCurrentUrl();
		Thread.sleep(20000);
		String StudPageUrlExp="http://64.227.182.128/students";
		Assert.assertEquals(StudPageUrlExp, StudPageUrlActual);
		obj3.clickHomeLink();
	}

	@Test(priority=4)
	
	public void SearchPage() throws Exception
	{
		//Create Login Page object
		obj3 = new EmployeLogedInPage(driver);
	    obj3.clickSearchLink();
		String SearchPageUrlActual=driver.getCurrentUrl();
		Thread.sleep(20000);
		String SearchPageUrlExp="http://64.227.182.128/search";
		Assert.assertEquals(SearchPageUrlExp, SearchPageUrlActual);
	}
@Test(priority=5)
	
	public void LogoutPage() throws Exception
	{
		//Create Login Page object
		obj3 = new EmployeLogedInPage(driver);
	    obj3.clickLogoutLink();
		String logoutPageUrlActual=driver.getCurrentUrl();
		Thread.sleep(20000);
		String logoutPageUrlExp="http://64.227.182.128/login/studentlogin";
		Assert.assertEquals(logoutPageUrlExp, logoutPageUrlActual);
	}
}
