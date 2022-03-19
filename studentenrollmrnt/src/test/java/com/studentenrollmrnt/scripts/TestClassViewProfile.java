package com.studentenrollmrnt.scripts;


import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.studentenrollmrnt.pages.StudentLogin;
import com.studentenrollmrnt.pages.StudentViewprofile;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;

public class TestClassViewProfile  extends TestBase{
	com.studentenrollmrnt.pages.StudentLogin objLogin;
	StudentViewprofile obj1;
	
	@Test(priority=0)
    public void verifyValidLogin() throws Exception {
    //Create Login Page object
    objLogin = new StudentLogin(driver);
    //login to application
    String email= ExcelUtilities.getCellData(7, 1);
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
    driver.navigate().refresh();
    
}

@Test(priority=1)
	
	public void buttonPage() throws Exception
	{
		obj1 = new StudentViewprofile(driver);
		Thread.sleep(20000);
        obj1.viewprofileclick();
        Thread.sleep(20000);
        driver.navigate().refresh();
	}
@Test(priority=2)

public void buttonupdatePage() throws Exception
{
       obj1 = new StudentViewprofile(driver);
       obj1.Btnupdateclick();
       Thread.sleep(20000);
		String btnupdateUrlActual=driver.getCurrentUrl();
		String btnupdateUrlExp="http://64.227.182.128/update-student";
		Assert.assertEquals(btnupdateUrlExp, btnupdateUrlActual);
		driver.navigate().refresh();
		
	}

	
}