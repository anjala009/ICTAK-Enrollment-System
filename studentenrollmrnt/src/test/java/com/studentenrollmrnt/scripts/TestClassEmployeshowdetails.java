package com.studentenrollmrnt.scripts;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.studentenrollmrnt.pages.EmployeLogedInPage;
import com.studentenrollmrnt.pages.EmployeLogin;
import com.studentenrollmrnt.pages.Employesearchname;
import com.studentenrollmrnt.pages.Employeshowdetails;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;

public class TestClassEmployeshowdetails extends TestBase{
	EmployeLogedInPage obj2;
	Employesearchname obj3;
	Employeshowdetails obj4;
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


public void ShowdetailsPage() throws  Exception
{
	
	obj4= new Employeshowdetails(driver);
	obj4.Showdetails();

}

}
