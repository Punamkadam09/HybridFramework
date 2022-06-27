package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;

public class LeadPage extends Headerpage {

	public LeadPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	
	@FindBy(name="firstname")
	WebElement tb_firstname;
	
	@FindBy(name="lastname")
	WebElement tb_lastname;
	
	@FindBy(name="company")
	WebElement tb_company;
	
	@FindBy(name="button")
	WebElement btn_save;
	
	public void createlead(String fname,String lname,String comp)
	{
		cf.entervalue(tb_firstname, fname);
		cf.entervalue(tb_lastname, lname);
		cf.entervalue(tb_company, comp);
		cf.clickElement(btn_save, "Save button");
	}
	
	

}
