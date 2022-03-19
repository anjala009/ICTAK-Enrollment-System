package com.studentenrollmrnt.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.studentenrollmrnt.pages.StudentLogin;
import com.studentenrollmrnt.pages.StudentUpdate;
import com.studentenrollmrnt.pages.StudentViewprofile;
import com.studentenrollmrnt.testbase.TestBase;
import com.studentenrollmrnt.utilities.ExcelUtilities;


public class TestClassStudentUpdate extends TestBase{
	
	com.studentenrollmrnt.pages.StudentLogin objLogin;
	com.studentenrollmrnt.pages.StudentViewprofile obj1;
	StudentUpdate obj2;
	@Test(priority=0)
    public void verifyValidLogin() throws Exception {
    //Create Login Page object
    objLogin = new StudentLogin(driver);
    //login to application
    String email= ExcelUtilities.getCellData(7, 0);
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
	
	public void BtnupdatePage() throws Exception
	{
		obj1 = new StudentViewprofile(driver);
		Thread.sleep(20000);
		obj1.viewprofileclick();
        
	 
	}
@Test(priority=2)

public void buttonupdatePage() throws Exception
{
       obj1 = new StudentViewprofile(driver);
       obj1.Btnupdateclick();
       Thread.sleep(20000);
}

@Test(priority=3)
public void Updation() throws Exception {
	obj2 = new StudentUpdate(driver);
	    String name= ExcelUtilities.getCellData(4, 0);
	    String email =ExcelUtilities.getCellData(4, 1);
	    String phone= ExcelUtilities.getCellData(4, 2);
	    String address =ExcelUtilities.getCellData(4, 3);
	    String distict= ExcelUtilities.getCellData(4, 4);
	    String state=ExcelUtilities.getCellData(4, 5);
	    String qualification= ExcelUtilities.getCellData(4, 6);
	    String passout =ExcelUtilities.getCellData(4, 7);
	    String skills=ExcelUtilities.getCellData(4, 8);
	    String employestatus= ExcelUtilities.getCellData(4, 9);
	    String techtraining =ExcelUtilities.getCellData(4, 10);
	   
	    obj2.Nameclick(name);
	    obj2.Emailclick(email);
	    obj2.Phoneclick(phone);
	    obj2.Addressclick(address);
	    obj2.Districtclick(distict);
	    obj2.Stateclick(state);
	    obj2.Qualificationclick(qualification);
	    obj2.Passoutclick(passout);
	    obj2.Skillsclick(skills);
	    obj2.Employestatusclick(employestatus);
	    obj2.Techtrainingclick(techtraining);
	    obj2.Submitclick();
	
}
}

