package com.studentenrollmrnt.scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.studentenrollmrnt.pages.EmployeLogedInPage;
import com.studentenrollmrnt.pages.EmployeLogin;
import com.studentenrollmrnt.pages.Employemarkentry;
import com.studentenrollmrnt.pages.Employesearchname;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;

public class TestClassEmployemarkentry extends TestBase{
	Employemarkentry obj1;
	EmployeLogedInPage obj2;
	Employesearchname obj3;
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
    driver.navigate().refresh();

}
@Test(priority=1)
	
public void StudentPage() throws Exception
{
	
	obj2= new EmployeLogedInPage(driver);
	Thread.sleep(20000);
	obj2.clickStudLink();
	
}
@Test(priority=2)

public void SearchnamePage() throws  Exception
{
	
	obj3= new Employesearchname(driver);
	String searchname= ExcelUtilities.getCellData(6, 0);
	Thread.sleep(20000);
	obj3.Search(searchname);
	 driver.navigate().refresh();
}
@Test(priority=3)
public void MarkentryPage() throws  Exception
{
	
	obj1= new Employemarkentry(driver);
	obj1.Markentry();
	}
@Test(priority=4)
public void ExitexammarkPage() throws  Exception
{
	
	obj1= new Employemarkentry(driver);
	String exitexammark= ExcelUtilities.getCellData(6, 1);
	Thread.sleep(20000);
	obj1.Exitexammark(exitexammark);
	}
@Test(priority=5)
public void UpdatePage() throws  Exception
{
	
	obj1= new Employemarkentry(driver);
	obj1.Update();
	}

}
