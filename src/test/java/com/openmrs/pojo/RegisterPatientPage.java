package com.openmrs.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPatientPage 
{
	WebDriver driver;	
	public RegisterPatientPage( WebDriver driver ) 
	{ 
	     this.driver = driver; 
	    PageFactory.initElements( driver, this);
	}
	@FindBy(how= How.XPATH, using= "//input[@name='givenName']")
	private WebElement givenname;
	public WebElement getGivenName()
	{
		return givenname;
	}
	@FindBy(how= How.XPATH, using= "//h2[contains(text(),'Register a patient')]")
	private WebElement RegisterPatientHeader;
	public WebElement getRegisterPatientHeader()
	{
		return RegisterPatientHeader;
	}
	@FindBy(how= How.XPATH, using= "(//a[@type='button'])[4]")
	private WebElement RegisterPatientButton;
	public WebElement getRegisterPatientButton()
	{
		return RegisterPatientButton;
	}
	@FindBy(how= How.XPATH, using= "(//a[@type='button'])[1]")
	private WebElement FindRecords;
	public WebElement getFindRecords()
	{
		return FindRecords;
	}
	@FindBy(how= How.XPATH, using= "//input[@name='familyName']")
	private WebElement familyname;
	public WebElement getFamilyName()
	{
		return familyname;
	}
	@FindBy(how= How.XPATH, using= "//button[@id='next-button']")
	private WebElement nxtButton;
	public WebElement getNextButton()
	{
		return nxtButton;
	}

	@FindBy(how=How.XPATH, using = "//option[@value='M']")
	private WebElement PatientGender;
	public WebElement getPatientGender()
	{
		return PatientGender;
	}
	@FindBy(how= How.XPATH, using= "//button[@id='next-button']")
	private WebElement Button1;
	public WebElement getButton1()
	{
		return Button1;
	}
	@FindBy(how = How.XPATH, using ="//input[@name='birthdateDay']")
	private WebElement dateOfBirth;
	public WebElement getDateOfBirth() 
	{
		return dateOfBirth;
	}
	@FindBy(how = How.XPATH, using = "//select[@name='birthdateMonth']")
	private WebElement dateOfMonth;
	public WebElement getDateOfMonth() 
	{
		return dateOfMonth;
	}
	@FindBy(how = How.XPATH, using = "//input[@name='birthdateYear']")
    private WebElement yearOfBirth;
	public WebElement getYearOfBirth()
	{
		return yearOfBirth;
	}
	@FindBy(how= How.XPATH, using= "//button[@id='next-button']")
	private WebElement Button2;
	public WebElement getButton2()
	{
		return Button2;
	}
	@FindBy(how= How.XPATH, using="//input[@id='address1']")
	private WebElement addressLine1;
	public WebElement getAddressLine1()
	{
		return addressLine1;
		}
	@FindBy(how= How.XPATH, using="//input[@id='address2']")
	private WebElement addressLine2;
	public WebElement getAddressLine2()
	{
		return addressLine2;
		}
	@FindBy(how= How.XPATH, using="//input[@id='cityVillage']")
	private WebElement city;
	public WebElement getCity()
	{
		return city;
		}
	@FindBy(how= How.XPATH, using="//input[@id='stateProvince']")
	private WebElement stateProvince;
	public WebElement getStateProvince()
	{
		return stateProvince;
		}
	@FindBy(how= How.XPATH, using="//input[@id='country']")
	private WebElement country;
	public WebElement getCountry()
	{
		return country;
		}
	@FindBy(how= How.XPATH, using="//input[@id='postalCode']")
	private WebElement postalCode;
	public WebElement getPostalCode()
	{
		return postalCode;
		}
	@FindBy(how= How.XPATH, using= "//button[@id='next-button']")
	private WebElement Button3;
	public WebElement getButton3()
	{
		return Button3;
	}
	@FindBy(how= How.XPATH, using="//input[@name='phoneNumber']")
	private WebElement phoneNumber;
	public WebElement getphoneNumber()
	{
		return phoneNumber;
		}
	@FindBy(how= How.XPATH, using= "//button[@id='next-button']")
	private WebElement Button4;
	public WebElement getButton4()
	{
		return Button4;
	}
	@FindBy(how= How.XPATH, using= "//select[@id='relationship_type")
	private WebElement patientRelated;
	public WebElement getpatientRelated()
	{
		return patientRelated;
	}
	@FindBy(how= How.XPATH, using= "//input[@placeholder='Person Name']")
	private WebElement personName;
	public WebElement getpersonName()
	{
		return personName;
	}
	@FindBy(how= How.XPATH, using= "//button[@id='next-button']")
	private WebElement Button5;
	public WebElement getButton5()
	{
		return Button5;
	}
	@FindBy(how= How.XPATH, using= "//input[@id='submit']")
	private WebElement Confirm;
	public WebElement getConfirm()
	{
		return Confirm;
	}
	@FindBy(how= How.XPATH, using= "//p[contains(text(),'Test, Calab')]")
	private WebElement Name;
	public WebElement getName()
	{
		return Name;
	}
	@FindBy(how= How.XPATH, using= "//p[contains(text(),'Male')]")
	private WebElement Gender;
	public WebElement getGender()
	{
		return Gender;
	}
	@FindBy(how= How.XPATH, using= "//p[contains(text(),'February')]")
	private WebElement BirthDate;
	public WebElement getBirthDate()
	{
		return BirthDate;
	}
	@FindBy(how= How.XPATH, using= "(//p[contains(text(),'Test')])[2]")
	private WebElement Address;
	public WebElement getAddress()
	{
		return Address;
	}
	@FindBy(how= How.XPATH, using= "//p[contains(text(),'8877665544')]")
	private WebElement Number;
	public WebElement getNumber()
	{
		return Number;
	}
	@FindBy(how= How.XPATH, using= "//span[@class='PersonName-givenName']")
	private WebElement PatientGivenName;
	public WebElement getPatientGivenName()
	{
		return PatientGivenName;
	}
	
	
}
	