package com.openmrs.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
		WebDriver driver;	
		public AdminPage( WebDriver driver ) 
		{ 
		     this.driver = driver; 
		    PageFactory.initElements( driver, this);
		}

		@FindBy(how= How.XPATH, using= "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
		private WebElement registerPatient;
		public WebElement getregisterPatient()
		{
			return registerPatient;
		}
		
	}



