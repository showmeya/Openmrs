package com.openmrs.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OpenLoginPage{
		
		 WebDriver driver;
		public OpenLoginPage( WebDriver driver ) 
		{ 
		     this.driver = driver; 
		    PageFactory.initElements( driver, this);
		}
			

		@FindBy(how= How.XPATH, using= "//input[@id='username']")
		private WebElement username;
		public WebElement getusername()
		{
			return username;
		}
		@FindBy(how= How.XPATH, using= "//input[@id='password']")
		private WebElement password;
		public WebElement getpassword()
		{
			return password;
		}
		@FindBy(how= How.XPATH, using= " //li[@id='Inpatient Ward']")
		private WebElement InpatientWard;
		public WebElement getInpatientWard()
		{
			return InpatientWard;
		}
		@FindBy(how= How.XPATH, using= "//input[@id='loginButton']")
		private WebElement Login;
		public WebElement getLogin()
		{
			return Login;
		}
		@FindBy(how= How.XPATH, using= "//a[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']")
		private WebElement LogOut;
		public WebElement getLogOut()
		{
			return LogOut;
		}
			
	}



