package com.openmrs.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.openmrs.pojo.PatientRecordPage;
import com.openmrs.pojo.RegisterPatientPage;
import com.openmrs.testdata.RegisterPatient;

public class TC_PatientDetails  extends BaseClass{
	@BeforeMethod
	public void loginTo() throws Exception {
		loginToOpenMRS();
	}
	@AfterMethod
	public void logOut() throws Exception {
		logout();
	}
	@Test(priority = 1, enabled = true)
	public void ConfirmVisit()throws Exception {
		RegisterPatientPage RP = new RegisterPatientPage(driver);
		PatientRecordPage PRP = new PatientRecordPage(driver);

		click(RP.getFindRecords());
        passTextToWebelement(PRP.getfindPatient(), "Test");	
		click(PRP.getfindPatientFirstRow());

        }
}
