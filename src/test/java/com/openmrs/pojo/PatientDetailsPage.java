package com.openmrs.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PatientDetailsPage {

	WebDriver driver;	
	public PatientDetailsPage( WebDriver driver ) 
	{ 
	     this.driver = driver; 
	    PageFactory.initElements( driver, this);
	}
	@FindBy(how= How.XPATH, using="//div[contains(text(),'Start Visit')]")
	private WebElement StartVisit;
	public WebElement getStartVisit()
	{
		return StartVisit;
	}
	@FindBy(how= How.XPATH, using="//button[@id='start-visit-with-visittype-confirm']")
	private WebElement Confirm;
	public WebElement getConfirm()
	{
		return Confirm;
	}
	@FindBy(how= How.XPATH, using="//ul[@class='float-left d-none d-lg-block']//div[@class='col-11 col-lg-10'][normalize-space()='End Visit']")
	private WebElement endVisit;
	public WebElement getendVisitb()
	{
		return endVisit;
	}
	@FindBy(how= How.XPATH, using="//div[@id='end-visit-dialog']//button[@class='confirm right'][normalize-space()='Yes']")
	private WebElement confirmEndVisit;
	public WebElement getconfirmEndVisit()
	{
		return confirmEndVisit;
	}
	@FindBy(how= How.XPATH, using="//div[contains(text(),'Delete Patient')]")
	private WebElement deletePatient;
	public WebElement getdeletePatient()
	{
		return deletePatient;
	}
	@FindBy(how= How.XPATH, using="(//input[@type='text'])[4]")
	private WebElement DeleteReason;
	public WebElement getDeleteReason()
	{
		return DeleteReason;
	}
	@FindBy(how= How.XPATH, using="//div[@id='delete-patient-creation-dialog']//button[@class='confirm right'][normalize-space()='Confirm']")
	private WebElement ConfirmDelete;
	public WebElement getConfirmDelete()
	{
		return ConfirmDelete;
	}
	}
