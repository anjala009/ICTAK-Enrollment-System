package com.studentenrollmrnt.scripts;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.studentenrollmrnt.pages.EmployeLoginNV;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;

public class TestClassEmployeloginNV  extends TestBase { 
	EmployeLoginNV objLogin; 
	@Test(priority=0)
    public void verifyValidLogin() throws IOException {
    //Create Login Page object
    objLogin = new EmployeLoginNV(driver);
    //login to application
    String email= ExcelUtilities.getCellData(3, 0);
    String password =ExcelUtilities.getCellData(3, 1);
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
}