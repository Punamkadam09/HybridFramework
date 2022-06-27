package com.vtiger.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

public class LoginTest extends BaseTest {

	
	@Test(priority=2)
	public void verifyValidLogin() 
	{
		System.out.println("Hello Git");
		String tcname = "verifyValidLogin_TC02";
		logger = extent.createTest(tcname);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(ExcelData.get(tcname).get("Userid"), ExcelData.get(tcname).get("Password"));
		HomePage hp = new HomePage(driver,logger);
		hp.clickLogout();
		extent.flush();
		
	}
   
   @Test(priority=1)
	public void verifyInValidLogin() 
	{
	    String tcname = "verifyInValidLogin_TC01";
		logger = extent.createTest(tcname);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(ExcelData.get(tcname).get("Userid"), ExcelData.get(tcname).get("Password"));
		lp.verifyErrorMsg();
		extent.flush();
		
	}
	
	
	
}
