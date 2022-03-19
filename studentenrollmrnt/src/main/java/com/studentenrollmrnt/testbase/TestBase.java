package com.studentenrollmrnt.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	//PARENT CLASS which contains INITIALIZE PROPERTIES, SETUP BROWSER, GET URL(), MAXIMIZE WINDOW, IMPLICITWAIT(), DELETE COOKIES...
	public static  WebDriver driver;
	public static Properties prop ;
	public static String driverPath = "D:\\drivers\\chromedriver.exe";
	//Creating a Constructor of the Class TestBase -public
	//1) This is the Function for READING Properties File
	public void TestBase()
	{
		try
		{
			//2) Creating OBJECT for PROPERTIES CLASS.
			prop = new Properties();
			//3) Create an OBJECT for INPUTSTREAM CLASS + Location of config.properties File
			//Surround it with [TRY CATCH]
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources" + "/config.properties");
			//4) LOAD PROPERTIES FILE using load() and PROPERTIES OBJECT
			prop.load(ip);
			
			
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	} 

	
 @BeforeTest
public void onSetup() {
	TestBase();
	//get browser value from config.properties file using prop obj &getProperty()
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
    }
	//Driver Maximize, Implicite Time, delete cookies...
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	//Launch URL
			driver.get(prop.getProperty("url"));
}
 @AfterTest
	public void quitBrowser() throws IOException 
	{
		//driver.quit();
	}

}
