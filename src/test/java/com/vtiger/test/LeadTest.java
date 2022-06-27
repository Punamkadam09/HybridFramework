package com.vtiger.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

public class LeadTest extends BaseTest {
	
	
	
	
	
	@Test(priority=1)
	public void CreateLead() 
	{
		String tcname = "Create_Lead_with_Mandatory_Fields_TC03";
		logger = extent.createTest(tcname);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(ExcelData.get(tcname).get("Userid"), ExcelData.get(tcname).get("Password"));
		HomePage hp = new HomePage(driver,logger);
		hp.clickNewLead();
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.createlead(ExcelData.get(tcname).get("FirstName"), ExcelData.get(tcname).get("LastName"), ExcelData.get(tcname).get("Company"));
		hp.clickLogout();
		extent.flush();
		
	}
   
   
	
	
	
	
}
