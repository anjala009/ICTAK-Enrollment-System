package com.studentenrollmrnt.scripts;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.studentenrollmrnt.pages.EmployeLogedInPage;
import com.studentenrollmrnt.pages.EmployeLogin;
import com.studentenrollmrnt.pages.Employesearchname;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;

public class TestClassEmployesearchname extends TestBase{
	
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
	
	public void SearchPage() throws Exception
	{
		
		obj2= new EmployeLogedInPage(driver);
	    obj2.clickSearchLink();
	    Thread.sleep(10000);
	    driver.navigate().refresh();
	}
@Test(priority=2)

public void SearchnamePage() throws JavascriptException, Exception
{
	
	obj3= new Employesearchname(driver);
	String searcqualification= ExcelUtilities.getCellData(5, 0);
	Thread.sleep(10000);
	obj3.Search(searcqualification);
	 driver.navigate().refresh();
	
}
@Test(priority=3)

public void SearchpassoutyearPage() throws JavascriptException, Exception
{
	
	obj3= new Employesearchname(driver);
	String searchpassoutyear= ExcelUtilities.getCellData(5, 1).toString();
	Thread.sleep(10000);
	obj3.Search(searchpassoutyear);
	 driver.navigate().refresh();
	}
@Test(priority=4)

public void SearchcousePage() throws JavascriptException, Exception
{
	
	obj3= new Employesearchname(driver);
	String searchcourse= ExcelUtilities.getCellData(5, 2);
	Thread.sleep(10000);
	obj3.Search(searchcourse);
	 driver.navigate().refresh();
	}

@Test(priority=5)

public void SearchdistictPage() throws JavascriptException, Exception
{

obj3= new Employesearchname(driver);
String searchdistrict= ExcelUtilities.getCellData(5, 3);
Thread.sleep(10000);
obj3.Search(searchdistrict);
driver.navigate().refresh();
}
@Test(priority=6)

public void SearchstatePage() throws JavascriptException, Exception
{

obj3= new Employesearchname(driver);
String searchstate= ExcelUtilities.getCellData(5, 4);
Thread.sleep(10000);
obj3.Search(searchstate);
driver.navigate().refresh();
}
@Test(priority=7)

public void SearchmarkPage() throws JavascriptException, Exception
{

obj3= new Employesearchname(driver);
String searchmark= ExcelUtilities.getCellData(5, 5).toString();
Thread.sleep(10000);
obj3.Search(searchmark);
driver.navigate().refresh();
}
@Test(priority=8)

public void SearchstatusPage() throws JavascriptException, Exception
{

            obj3= new Employesearchname(driver);
            String searchstatus= ExcelUtilities.getCellData(5, 6);
             Thread.sleep(10000);
             obj3.Search(searchstatus);
              driver.navigate().refresh();
}
@Test(priority=9)

public void SearchinvalidPage() throws JavascriptException, Exception
{

    obj3= new Employesearchname(driver);
    String searchinvalid= ExcelUtilities.getCellData(5, 7);
    Thread.sleep(10000);
    obj3.Search(searchinvalid);
    driver.navigate().refresh();
}

}
