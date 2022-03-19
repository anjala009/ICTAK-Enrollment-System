package com.studentenrollmrnt.scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.studentenrollmrnt.pages.StudentLoginIEVP;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;

public class TestClassStudentloginIEVP extends TestBase{
	StudentLoginIEVP objLogin;
	@Test(priority=0)
    public void verifyValidLogin() throws IOException {
    //Create Login Page object
    objLogin = new StudentLoginIEVP(driver);
    //login to application
    String email= ExcelUtilities.getCellData(2, 0);
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
	
  /*  String expectedTitle =com.studentenrollmrnt.constant.AutomationConstant.HOMEPAGETITLE;    
    String actualTitle =driver.getTitle();
   AssertJUnit.assertEquals(expectedTitle,actualTitle);*/
}

}
