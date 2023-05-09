package com.openmrs.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.openmrs.pojo.AttachmentPage;
import com.openmrs.pojo.PatientDetailsPage;
import com.openmrs.pojo.RegisterPatientPage;
import com.openmrs.testdata.RegisterPatient;

public class TC_Register extends BaseClass{
	@BeforeMethod
	public void loginTo() throws Exception {
		loginToOpenMRS();
	}
	
//	@Test(priority = 1, enabled = true, dataProvider = "RegisterPatientHeader", dataProviderClass = RegisterPatient.class)
//	public void RegisterPatient(String RegisterPatientHeader) throws Exception {
//		RegisterPatientPage RP = new RegisterPatientPage(driver);
//		click(RP.getRegisterPatientButton());
//		Assert.assertTrue(compareTwoText(getText(RP.getRegisterPatientHeader()),RegisterPatientHeader));
//	}
	@Test(priority = 2, enabled = true, dataProvider = "RegisterPatientName", dataProviderClass = RegisterPatient.class)
	public void PatientName(String givenname, String familyname, String dateOfBirth, String monthOfBirth, String yearOfBirth, String addressLine1, String addressLine2, String city, 
			String stateProvince, String country, String postalCode, String phoneNumber,String name, String gender, String birthdate, String address, String confirmphoneNumber,String patientGivenName,String caption, String deleteReason) throws Exception {
		RegisterPatientPage RP = new RegisterPatientPage(driver);
		PatientDetailsPage PDP = new PatientDetailsPage(driver);
		
		click(RP.getRegisterPatientButton());
		Thread.sleep(3000);
        passTextToWebelement(RP.getGivenName(), givenname);
        passTextToWebelement(RP.getFamilyName(), familyname);
        click(RP.getNextButton());
        click(RP.getPatientGender());
		click(RP.getButton1());
		passTextToWebelement(RP.getDateOfBirth(), dateOfBirth);
        selectFromDropBox(RP.getDateOfMonth(), monthOfBirth);
		passTextToWebelement(RP.getYearOfBirth(), yearOfBirth);
		click(RP.getButton2());
		passTextToWebelement(RP.getAddressLine1(), addressLine1);
		passTextToWebelement(RP.getAddressLine2(), addressLine2);
		passTextToWebelement(RP.getCity(), city);
		passTextToWebelement(RP.getStateProvince(), stateProvince);
		passTextToWebelement(RP.getCountry(), country);
		passTextToWebelement(RP.getPostalCode(), postalCode);
		click(RP.getButton3());
		passTextToWebelement(RP.getphoneNumber(), phoneNumber);
		click(RP.getButton4());
		click(RP.getButton5());
		Assert.assertTrue(compareTwoText(getText(RP.getName()),name));
		Assert.assertTrue(compareTwoText(getText(RP.getGender()),gender));
		Assert.assertTrue(compareTwoText(getText(RP.getBirthDate()),birthdate));
		Assert.assertTrue(compareTwoText(getText(RP.getAddress()),address));
		Assert.assertTrue(compareTwoText(getText(RP.getNumber()),confirmphoneNumber));
		click(RP.getConfirm());
		Assert.assertTrue(compareTwoText(getText(RP.getPatientGivenName()),patientGivenName));
		click(PDP.getStartVisit());
		click(PDP.getConfirm());
		AttachmentPage AP = new AttachmentPage(driver);
		click(AP.getAttach());
		passTextToWebelement(AP.getcaption(), caption);
		click(AP.getpatient());
		click(PDP.getendVisitb());
		click(PDP.getconfirmEndVisit());
		Thread.sleep(3000);
		click(PDP.getdeletePatient());
		passTextToWebelement(PDP.getDeleteReason(), deleteReason);
		click(PDP.getConfirmDelete());
		
	}
	@AfterMethod
	public void logOut() throws Exception {
		logout();
	}


}
