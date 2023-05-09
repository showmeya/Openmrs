package com.openmrs.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PatientRecordPage 
{
	WebDriver driver;
	public PatientRecordPage(WebDriver driver)
	{
		 this.driver = driver; 
		  PageFactory.initElements( driver, this);
	}
	@FindBy(how= How.XPATH, using="//input[@id='patient-search']")
	private WebElement findPatient;
	public WebElement getfindPatient()
	{
		return findPatient;
	}
	@FindBy(how= How.XPATH, using="(//tbody[@role='alert'])[1]")
	private WebElement findPatientFirstRow;
	public WebElement getfindPatientFirstRow()
	{
		return findPatientFirstRow;
	}
	
}