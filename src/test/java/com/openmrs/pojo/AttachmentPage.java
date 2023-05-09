package com.openmrs.pojo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AttachmentPage 
{
	WebDriver driver;	
	public AttachmentPage( WebDriver driver ) 
	{ 
	     this.driver = driver; 
	    PageFactory.initElements( driver, this);
	}

	@FindBy(how= How.XPATH, using="//a[@id='attachments.attachments.visitActions.default']")
	private WebElement Attach;
	public WebElement getAttach()
	{
		return Attach;
	}
	@FindBy(how= How.XPATH, using="//div[@class='dz-default dz-message ng-binding']")
	private WebElement fileUpload;
	public WebElement getfileUpload() {
		return fileUpload;
	}
	
	@FindBy(how= How.XPATH, using="//textarea[@placeholder='Enter a caption']")
	private WebElement caption;
	public WebElement getcaption()
	{
		return caption;
		
	}
	@FindBy(how= How.XPATH,using="//a[normalize-space()='Test Calab']")
			private WebElement patient;
	public WebElement getpatient()
	{
		return patient;
		
	}
}
